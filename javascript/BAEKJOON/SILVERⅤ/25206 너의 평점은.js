var input = require('fs').readFileSync(__dirname+'/test.txt').toString().trim().split("\n");
//var input = require('fs').readFileSync("/dev/stdin", "utf-8").trim().split("\n");
// 등급에 따른 과목평점 정의
const grades = {
    "A+" : 4.5,
    "A0": 4.0,
    "B+": 3.5,
    "B0": 3.0,
    "C+": 2.5,
    "C0": 2.0,
    "D+": 1.5,
    "D0": 1.0,
    "F": 0.0,
};

let totalCredits = 0; // (학점 × 과목평점)의 총합을 저장할 변수
let count = 0;  // 총 학점을 저장할 변수

for (let i = 0; i < 20; i++) {

    let [subject, credit, grade] = input[i].replace("\r", "").split(" ");
    credit = parseFloat(credit);

    // P/F 과목 중 P인 경우 계산에서 제외
    if(grade !== "P"){
        totalCredits += credit * grades[grade];
        count += credit;
    }
}

// 전공평점 계산 = (학점 × 과목평점)의 총합 / 총 학점
console.log(totalCredits / count);
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