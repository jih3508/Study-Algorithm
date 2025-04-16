var input = require('fs').readFileSync(__dirname+'/test.txt').toString().trim().split("\n");
//var input = require('fs').readFileSync("/dev/stdin", "utf-8").trim().split("\n");
// 등급에 따른 과목평점 정의
const gradeToScore = {
    "A+": 4.5,
    "A0": 4.0,
    "B+": 3.5,
    "B0": 3.0,
    "C+": 2.5,
    "C0": 2.0,
    "D+": 1.5,
    "D0": 1.0,
    "F": 0.0,
};

let totalCredits = 0; // 학점합
let totalPoints = 0; // 점수합

for (let i = 0; i < input.length; i++) {
    let [subject, credits, grade] = input[i].split(" ");
    credits = +credits;

    if (grade !== "P") {  // "P"를 문자열로 처리해야 합니다.
        totalCredits += credits;
        totalPoints += credits * gradeToScore[grade];
    }
}

const gpa = totalPoints / totalCredits;
console.log(gpa.toFixed(6));  // 소수점 6자리까지 출력
/*
const gradeToScore = {
    "A+": 4.5,
    "A0": 4.0,
    "B+": 3.5,
    "B0": 3.0,
    "C+": 2.5,
    "C0": 2.0,
    "D+": 1.5,
    "D0": 1.0,
    "F": 0.0,
};

let totalCredits = 0; // 학점합
let totalPoints = 0; // 점수합

for (let i = 0; i < input.length; i++) {
    let [subject, credits, grade] = input[i].split(" ");
    credits = +credits;

    if (grade !== "P") {  // "P"를 문자열로 처리해야 합니다.
        totalCredits += credits;
        totalPoints += credits * gradeToScore[grade];
    }
}

const gpa = totalPoints / totalCredits;
console.log(gpa.toFixed(6));  // 소수점 6자리까지 출력

 */