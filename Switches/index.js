// SWITCH

const testscore = document.getElementById("testscore");
const mySubmit = document.getElementById("mySubmit");
const myLetterGrade = document.getElementById("myLetterGrade");

mySubmit.onclick = function() {
    const score = Number(testscore.value);
    switch(true) {
        case score >= 90:
            myLetterGrade.textContent = "A";
            break;

        case score >= 80:
            myLetterGrade.textContent = "B";
            break;

        case score >= 70:
            myLetterGrade.textContent = "C";
            break;

        case score >= 60:
            myLetterGrade.textContent = "D";
            break;


        default:
            myLetterGrade.textContent = "F";
    }
}