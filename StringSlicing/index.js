// STRING SLICING

const fullName = "Manqasana Lepota";
const email = "nqhasy@gmail.com";

//let firstName = fullName.slice(0, 9);
//let  lastName = fullName.slice(10, 17);

//let firstChar = fullName.slice(0, 1);
//let lastChar = fullName.slice(-1);

let firstName = fullName.slice(0, fullName.indexOf(" "));
let lastName = fullName.slice(fullName.indexOf(" "));

let username = email.slice(0, email.indexOf("@"));
let extension = email.slice(email.indexOf("@") + 1);



console.log(firstName);
console.log(lastName);
console.log(username);