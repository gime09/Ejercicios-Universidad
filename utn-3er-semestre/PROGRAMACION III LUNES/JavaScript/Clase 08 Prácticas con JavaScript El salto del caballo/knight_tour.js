class KnightTourSolver {
  constructor() {
    this.N = 8;
    this.moves = [
      [2, 1], [1, 2], [-1, 2], [-2, 1],
      [-2, -1], [-1, -2], [1, -2], [2, -1]
    ];
    this.board = [];
    this.solutions = [];
    this.currentSolution = 0;
    this.isSearching = false;
    this.startTime = 0;
    this.nodesExplored = 0;
    this.maxSolutions = 10;
    this.animationRunning = false;
    
    this.initializeUI();
  }

  initializeUI() {
    // Event listeners
    document.getElementById('startBtn').addEventListener('click', () => this.startSearch());
    document.getElementById('stopBtn').addEventListener('click', () => this.stopSearch());
    document.getElementById('animateBtn').addEventListener('click', () => this.animateSolution());
    document.getElementById('prevBtn').addEventListener('click', () => this.previousSolution());
    document.getElementById('nextBtn').addEventListener('click', () => this.nextSolution());
    
    document.getElementById('boardSize').addEventListener('change', (e) => {
      this.N = parseInt(e.target.value);
      document.getElementById('startX').max = this.N - 1;
      document.getElementById('startY').max = this.N - 1;
      this.drawEmptyBoard();
    });

    this.drawEmptyBoard();
  }

  initializeBoard() {
    this.board = Array.from({ length: this.N }, () => Array(this.N).fill(-1));
  }

  isValid(x, y) {
    return x >= 0 && y >= 0 && x < this.N && y < this.N && this.board[x][y] === -1;
  }

  copyBoard() {
    return this.board.map(row => row.slice());
  }

  // Optimización: Regla de Warnsdorff - elegir el movimiento que lleva a la casilla con menos opciones
  getAccessibilityCount(x, y) {
    let count = 0;
    for (const [dx, dy] of this.moves) {
      const nx = x + dx;
      const ny = y + dy;
      if (this.isValid(nx, ny)) {
        count++;
      }
    }
    return count;
  }

  getSortedMoves(x, y) {
    const validMoves = [];
    for (const [dx, dy] of this.moves) {
      const nx = x + dx;
      const ny = y + dy;
      if (this.isValid(nx, ny)) {
        const accessibility = this.getAccessibilityCount(nx, ny);
        validMoves.push({ dx, dy, nx, ny, accessibility });
      }
    }
    // Ordenar por accesibilidad (Regla de Warnsdorff)
    return validMoves.sort((a, b) => a.accessibility - b.accessibility);
  }

  async knightTourAll(x, y, moveCount) {
    if (!this.isSearching) return;
    
    this.nodesExplored++;
    
    // Actualizar estadísticas cada 1000 nodos
    if (this.nodesExplored % 1000 === 0) {
      this.updateStats();
      await new Promise(resolve => setTimeout(resolve, 1)); // Permitir que la UI se actualice
    }

    if (moveCount === this.N * this.N) {
      this.solutions.push(this.copyBoard());
      this.updateStats();
      
      if (this.solutions.length >= this.maxSolutions) {
        this.stopSearch();
        return;
      }
      return;
    }

    const sortedMoves = this.getSortedMoves(x, y);
    
    for (const move of sortedMoves) {
      if (!this.isSearching) break;
      
      this.board[move.nx][move.ny] = moveCount;
      await this.knightTourAll(move.nx, move.ny, moveCount + 1);
      this.board[move.nx][move.ny] = -1; // backtrack
    }
  }

  async startSearch() {
    this.isSearching = true;
    this.solutions = [];
    this.currentSolution = 0;
    this.nodesExplored = 0;
    this.startTime = Date.now();
    
    const startX = parseInt(document.getElementById('startX').value);
    const startY = parseInt(document.getElementById('startY').value);
    this.maxSolutions = parseInt(document.getElementById('maxSolutions').value);
    
    this.initializeBoard();
    this.board[startX][startY] = 0;
    
    // Actualizar UI
    document.getElementById('startBtn').disabled = true;
    document.getElementById('stopBtn').disabled = false;
    document.getElementById('status').textContent = 'Buscando soluciones...';
    document.getElementById('solutionNav').style.display = 'none';
    document.getElementById('animateBtn').disabled = true;
    
    try {
      await this.knightTourAll(startX, startY, 1);
      this.completeSearch();
    } catch (error) {
      console.error('Error durante la búsqueda:', error);
      this.stopSearch();
    }
  }

  stopSearch() {
    this.isSearching = false;
    document.getElementById('startBtn').disabled = false;
    document.getElementById('stopBtn').disabled = true;
    this.completeSearch();
  }

  completeSearch() {
    const timeElapsed = (Date.now() - this.startTime) / 1000;
    
    if (this.solutions.length > 0) {
      document.getElementById('status').textContent = 
        `¡Búsqueda completada! Encontradas ${this.solutions.length} soluciones en ${timeElapsed.toFixed(2)} segundos.`;
      this.drawBoard(this.solutions[0]);
      document.getElementById('solutionNav').style.display = 'block';
      document.getElementById('animateBtn').disabled = false;
      this.updateSolutionInfo();
    } else {
      document.getElementById('status').textContent = 
        `Búsqueda completada. No se encontraron soluciones en ${timeElapsed.toFixed(2)} segundos.`;
      this.drawEmptyBoard();
    }
    
    document.getElementById('progressFill').style.width = '100%';
  }

  previousSolution() {
    if (this.solutions.length === 0) return;
    this.currentSolution = (this.currentSolution - 1 + this.solutions.length) % this.solutions.length;
    this.drawBoard(this.solutions[this.currentSolution]);
    this.updateSolutionInfo();
  }

  nextSolution() {
    if (this.solutions.length === 0) return;
    this.currentSolution = (this.currentSolution + 1) % this.solutions.length;
    this.drawBoard(this.solutions[this.currentSolution]);
    this.updateSolutionInfo();
  }

  updateSolutionInfo() {
    document.getElementById('solutionInfo').textContent = 
      `Solución ${this.currentSolution + 1} de ${this.solutions.length}`;
  }

  async animateSolution() {
    if (this.solutions.length === 0 || this.animationRunning) return;
    
    this.animationRunning = true;
    document.getElementById('animateBtn').disabled = true;
    document.getElementById('animateBtn').textContent = '⏸️ Animando...';
    
    const solution = this.solutions[this.currentSolution];
    this.drawEmptyBoard();
    
    // Crear array de movimientos en orden
    const moves = [];
    for (let i = 0; i < this.N; i++) {
      for (let j = 0; j < this.N; j++) {
        if (solution[i][j] !== -1) {
          moves[solution[i][j]] = { x: i, y: j };
        }
      }
    }
    
    // Animar cada movimiento
    for (let i = 0; i < moves.length; i++) {
      if (!this.animationRunning) break;
      
      const move = moves[i];
      const cell = document.querySelector(`[data-pos="${move.x}-${move.y}"]`);
      if (cell) {
        cell.textContent = i;
        cell.classList.add('knight-path');
        setTimeout(() => cell.classList.remove('knight-path'), 500);
      }
      
      await new Promise(resolve => setTimeout(resolve, 300));
    }
    
    this.animationRunning = false;
    document.getElementById('animateBtn').disabled = false;
    document.getElementById('animateBtn').textContent = '🎬 Animar Solución';
  }

  updateStats() {
    const timeElapsed = (Date.now() - this.startTime) / 1000;
    document.getElementById('solutionsFound').textContent = this.solutions.length;
    document.getElementById('timeElapsed').textContent = timeElapsed.toFixed(1);
    document.getElementById('nodesExplored').textContent = this.nodesExplored.toLocaleString();
    
    // Actualizar barra de progreso basada en soluciones encontradas
    const progress = Math.min((this.solutions.length / this.maxSolutions) * 100, 100);
    document.getElementById('progressFill').style.width = progress + '%';
  }

  drawEmptyBoard() {
    const boardDiv = document.getElementById('board');
    let html = '<table>';
    
    for (let i = 0; i < this.N; i++) {
      html += '<tr>';
      for (let j = 0; j < this.N; j++) {
        const colorClass = (i + j) % 2 === 0 ? 'light' : 'dark';
        html += `<td class="${colorClass}" data-pos="${i}-${j}"></td>`;
      }
      html += '</tr>';
    }
    
    html += '</table>';
    boardDiv.innerHTML = html;
  }

  drawBoard(solution) {
    const boardDiv = document.getElementById('board');
    let html = '<table>';
    
    for (let i = 0; i < this.N; i++) {
      html += '<tr>';
      for (let j = 0; j < this.N; j++) {
        const colorClass = (i + j) % 2 === 0 ? 'light' : 'dark';
        const cellValue = solution[i][j] === -1 ? '' : solution[i][j];
        html += `<td class="${colorClass}" data-pos="${i}-${j}">${cellValue}</td>`;
      }
      html += '</tr>';
    }
    
    html += '</table>';
    boardDiv.innerHTML = html;
  }
}

// Inicializar la aplicación cuando el DOM esté listo
document.addEventListener('DOMContentLoaded', () => {
  const solver = new KnightTourSolver();
});