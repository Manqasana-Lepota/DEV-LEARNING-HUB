// How to accept user input

// 1. Easy Way = window prompt
// 2. Professional Way = HTML textbox
let username;

document.getElementById("mySubmit").onclick = function() {
    username = document.getElementById("myText").value;
    document.getElementById("myH1").textContent = `Hello ${username} !`;

}