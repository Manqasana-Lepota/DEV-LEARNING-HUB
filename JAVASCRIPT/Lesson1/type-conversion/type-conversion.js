// Type Conversion = channge the datatype of a value to another 
//                  (strings, numbers, booleans)


/* Convert string to number */

let strNumber = "123";
let num = Number(strNumber);
console.log(num);


/* Convert number to string */

let age = 25;
let ageStr = String(age);
console.log(ageStr);


/* Convert boolean to number */

let isOnline = true;
let statusNum = Number(isOnline);
console.log(statusNum);


/* Convert number to boolean */

let items = 0;
let hasItems = Boolean(items);
console.log(hasItems);


/* Convert string to boolean */

let value = "hello";
let isTrue = Boolean(value);
console.log(isTrue);

/* Exercise */
let result = "5" + 3;
console.log(result);

let result1 = "5" - 2;
console.log(result1);

/* Convert String with spaces to number */
let weirdString = "  42  ";
let num1 = Number(weirdString);
console.log(num1)


/* Invalid conversion */
let invalid = "abc";
let num2 = Number(invalid);
console.log(num2);

/* Write a function to convert any input to a number */

function toNumber(input) {
    return Number(input);
}
console.log(toNumber("100"));
console.log(toNumber(true));
console.log(toNumber(false));
console.log(toNumber("abc"));