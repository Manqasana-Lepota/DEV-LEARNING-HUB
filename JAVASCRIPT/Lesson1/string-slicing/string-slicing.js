// String Slicing = craeting a substring from a portion of another string
//                  string.slice(start, end)

let phrase = "Learning JavaScript is fun!";

// 1. Extract "JavaScript"
let word1 = phrase.slice(9, 19);
console.log(word1);

// 2. Extract "Learning"
let word2 = phrase.slice(0, 8);
console.log(word2); 

// 3. Extract "fun!"
let word3 = phrase.slice(-4); 
console.log(word3);

// 4. Extract last 4 characters
let word4 = phrase.slice(phrase.length - 4);
console.log(word4);

// 5. Extract everything after the first space
let firstSpaceIndex = phrase.indexOf(" ");
let word5 = phrase.slice(firstSpaceIndex + 1);
console.log(word5);
