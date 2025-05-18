function greetUser() {
    let name = document.getElementById("firstname").value;
    let message = "Hello, " + name + "! Welcome to the site.";
    document.getElementById("greetingMessage").innerText = message;
}
