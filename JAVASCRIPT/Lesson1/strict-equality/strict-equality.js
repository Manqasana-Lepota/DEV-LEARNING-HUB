// = assignment
const myName = "Manqasana";
console.log(myName);


// == comparison operator (compare if values are equal)
const PI = 3.14;

if(PI == "3.14") {
    console.log("That is PI");
}
else {
    console.log("That is NOT PI");
}


// === strict equality operator (compare if values & datatype are equal)
let correctUsername = "admin";
let correctPassword = "1234";

let inputUsername = "admin";
let inputPassword = "1234";

if (inputUsername === correctUsername && inputPassword === correctPassword) {
  console.log("Login successful!");
} else {
  console.log("Invalid username or password.");
}


// != inequality operator
let username = "admin";
let password = "1234";

let inputUser = "user";
let inputPass = "1234";

if (inputUser != username || inputPass != password) {
  console.log("Access denied");
} else {
  console.log("Access granted");
}


// !== strict inequality operator
let correctPIN = 1234;
let userPIN = "1234";
if (userPIN !== correctPIN) {
  console.log("Incorrect PIN");
} else {
  console.log("Access granted");
}






