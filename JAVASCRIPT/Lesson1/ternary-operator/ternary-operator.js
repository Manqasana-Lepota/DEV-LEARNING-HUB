// ternary operator = a shortcut to if{} and else{} statements helps to
//                    assign a variable based on a condition
//                   coditions ? codeIfTrue : codeIfFalse

let age = 19;
let message = age >= 18? "You're and adult" : "You're a minor";
console.log(message);

let time = 9;
let greeting = time < 12 ? "Good morning!" : "Good afternoon!";
console.log(greeting);

let isStudent = true;
let message1 = isStudent ? "You are a student" : "You are NOT a student";
console.log(message1);

let purchaseAmount = 9;
let discount = purchaseAmount >= 100 ? 10 : 0;
console.log(`Your total is $${purchaseAmount-purchaseAmount* (discount/100)}`);