const countLabel = document.getElementById("countLabel");
let count = 0;

function increaseBtn() {
    count++;
    countLabel.textContent = count;
}

function decreaseBtn() {
    count--;
    countLabel.textContent = count;
}

function resetBtn() {
    count = 0;
    countLabel.textContent = count;
}