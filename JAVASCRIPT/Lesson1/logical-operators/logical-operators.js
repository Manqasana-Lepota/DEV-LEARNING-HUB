// Logical Operators = used to combine or manipulate boolean values (true or false)
//      AND = &&
//      OR = ||
//      NOT = !


let isAdmin = true;
let isLoggedIn = false;
let hasClearance = true;

// 1. isLoggedIn AND isAdmin
let access1 = isLoggedIn && isAdmin;
console.log("1. Access with AND:", access1);

// 2. isAdmin OR hasClearance
let access2 = isAdmin || hasClearance;
console.log("2. Access with OR:", access2);

// 3. NOT isLoggedIn
let access3 = !isLoggedIn;
console.log("3. Access with NOT:", access3);

// 4. isLoggedIn AND (isAdmin OR hasClearance)
let access4 = isLoggedIn && (isAdmin || hasClearance);
console.log("4. Combined AND/OR:", access4); 