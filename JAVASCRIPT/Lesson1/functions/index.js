// Function = A section of reusable code.
//            Declare code once, use it whenever you want.
//            Call the function to execute that code.


//Function Declaration
function greet() {
  console.log("Hello, World!");
}


//Function with Parameters
function greetUser(name) {
  console.log("Hello, " + name + "!");
}


//Function with Return Value
function add(a, b) {
  return a + b;
}

//Function Expression
const multiply = function (x, y) {
  return x * y;
};

greet();
greetUser("Manqasana");  

let result = add(5, 3);
console.log(result); 

console.log(multiply(4, 6)); 





