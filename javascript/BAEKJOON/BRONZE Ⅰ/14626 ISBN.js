var input = require('fs').readFileSync(__dirname+'/test.txt').toString().trim();
//var input = require('fs').readFileSync("/dev/stdin", "utf-8").trim();

const original = input;

for (let i = 0; i <= 9; i++) {
    // '*'를 0~9 숫자로 순서대로 대체
    const ISBN = original.replace("*", i);

    // ISBN-13 가중합 계산
    // 짝수 인덱스(0,2,4...) × 1, 홀수 인덱스(1,3,5...) × 3
    const sum = [...ISBN].reduce((acc, char, j) => {
        const digit = parseInt(char);
        return acc + (j % 2 === 0 ? digit : digit * 3);
    }, 0);

    // 가중합이 10의 배수이면 유효한 ISBN → 해당 숫자 출력 후 종료
    if (sum % 10 === 0) {
        console.log(i);
        break;
    }
}