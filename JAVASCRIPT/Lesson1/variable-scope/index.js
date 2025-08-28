// Variable Scope = where a variable is recognized and accessible  (local vs global)


// Global variable
let score = 0;

function playGame() {
  // Local variable (only inside this function)
  let level = 1;

  console.log("Starting game...");
  console.log("Global score is: " + score);
  console.log("Local level is: " + level);

  // Change global variable inside function
  score += 10;
  console.log("New global score: " + score);
}

playGame();

console.log("Outside function - score is: " + score); 
