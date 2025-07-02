// String Methods = allow you to manipulate and work with text (string)

/* Length - Returns the number of characters in the string. */
let text = "Javascript";
console.log(text.length);



/* toUpperCase() and tolowerCase() - Converts the string to uppercase or lowercase. */
let username = "Manqasana";
console.log(username.toUpperCase());
console.log(username.toLowerCase());



/* charAt(index) - Returns the character at the specified index.*/
let city = "Cape Town";
console.log(city.charAt(0));




/**
 * indexOf(substring) and lastIndexOf(substring)
 * Finds the first/last index of the substring.
 */

let sentence = "I love JavaScript";
console.log(sentence.indexOf("love"));
console.log(sentence.lastIndexOf("a"));




/**
 * slice(start, end)
 * Extracts part of a string (end not included).
 * substring(start, end)
 * Similar to slice but does not accept negative values.
 */
let word = "Developer";
console.log(word.slice(0, 4));
console.log(word.substring(0, 4));


/**
 * replace(old, new)
 * Replaces part of the string (only replaces the first match).
 */
let greet = "Hello World";
console.log(greet.replace("World", "Manqasana")); 



/**
 * trim()
 * Removes whitespace from both ends of the string.
 */

let messy = "   Hello   ";
console.log(messy.trim());



/**
 * split(separator)
 * Splits the string into an array based on the separator.
 */
let tags = "html,css,js";
console.log(tags.split(","));



/**
 * includes(substring)
 * Checks if the string contains the substring.
 */
let message = "Welcome to JavaScript!";
console.log(message.includes("JavaScript"));



/**
 * startsWith() / endsWith()
 * Checks if the string starts/ends with a specific substring.
 */
let lang = "JavaScript";
console.log(lang.startsWith("Java"));
console.log(lang.endsWith("Script")); 





