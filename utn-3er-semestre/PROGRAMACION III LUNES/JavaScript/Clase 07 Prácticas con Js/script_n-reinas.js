const N = 8;
const tablero = document.getElementById("tablero");
const indicesOut = document.getElementById("indices");

function crearTablero(n) {
  tablero.innerHTML = "";
  tablero.style.gridTemplateColumns = `repeat(${n}, 50px)`;
  for (let i = 0; i < n * n; i++) {
    const celda = document.createElement("div");
    celda.className = "celda";
    const fila = Math.floor(i / n);
    const col = i % n;
    if ((fila + col) % 2 === 0) celda.classList.add("negra");
    tablero.appendChild(celda);
  }
}

function dibujarReinas(queenPos) {
  const celdas = tablero.children;
  for (let fila = 0; fila < queenPos.length; fila++) {
    const col = queenPos[fila];
    const index = fila * N + col;
    celdas[index].textContent = "♛";
  }
}

function esSeguro(fila, col, queens) {
  for (let i = 0; i < fila; i++) {
    const qCol = queens[i];
    if (qCol === col || qCol - i === col - fila || qCol + i === col + fila) {
      return false;
    }
  }
  return true;
}

function resolverNReinas(fila, queens) {
  if (fila === N) return queens.slice();
  for (let col = 0; col < N; col++) {
    if (esSeguro(fila, col, queens)) {
      queens[fila] = col;
      const resultado = resolverNReinas(fila + 1, queens);
      if (resultado) return resultado;
    }
  }
  return null;
}

crearTablero(N);
const solucion = resolverNReinas(0, Array(N).fill(-1));
if (solucion) {
  dibujarReinas(solucion);
  indicesOut.textContent = JSON.stringify(solucion);
} else {
  indicesOut.textContent = "No se encontró solución";
}
