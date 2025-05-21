// STRING METHODS

let userName = "Manqasana  ";
let phoneNumber = "123-456-7890";


console.log(userName.charAt(0));
console.log(userName.indexOf("a"));
console.log(userName.lastIndexOf("a"));
console.log(userName.length);
console.log(userName.trim());
console.log(userName.toUpperCase());
console.log(userName.toLowerCase());
console.log(userName.repeat(4));
console.log(userName.startsWith(" "));
console.log(userName.endsWith(" "));
console.log(userName.includes(" "));


console.log(phoneNumber.replaceAll("-", "/"));
console.log(phoneNumber.padStart(15, "0"))