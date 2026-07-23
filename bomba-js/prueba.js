const timer = document.getElementById('timer');
const mensaje = document.getElementById('mensaje');
const restartButton = document.getElementById('restart');
const bomb = document.getElementById('bomb');

let seconds = 10;
let intervalId;

function updateTimer() {
  timer.textContent = seconds;

  if (seconds <= 3) {
    timer.classList.add('warning');
    bomb.classList.add('warning');
  } else {
    timer.classList.remove('warning');
    bomb.classList.remove('warning');
  }

  if (seconds <= 0) {
    mensaje.textContent = '💥 ¡BOOM!';
    timer.textContent = '0';
    timer.classList.add('explode');
    bomb.classList.add('explode');
    clearInterval(intervalId);
    return;
  }

  mensaje.textContent = 'La bomba está armada...';
  seconds -= 1;
}

function startCountdown() {
  clearInterval(intervalId);
  seconds = 10;
  timer.classList.remove('warning', 'explode');
  bomb.classList.remove('warning', 'explode');
  mensaje.textContent = 'La bomba está armada...';
  updateTimer();
  intervalId = setInterval(updateTimer, 1000);
}

restartButton.addEventListener('click', startCountdown);
startCountdown();
