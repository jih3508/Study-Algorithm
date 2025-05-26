var input = require('fs').readFileSync(__dirname+'/test.txt').toString().trim().split("\n");
//var input = require('fs').readFileSync("/dev/stdin", "utf-8").toString().trim().split("\n");


for(var i = 0; i < input.length - 1; i++) {
    // 한 줄씩 정수를 읽어옴
    const N = parseInt(input[i]);

    let numbers = new Array();

    // 1부터 N/2까지 반복하여 약수를 찾음
    // N/2를 넘는 수는 N의 약수가 될 수 없음 (N 자신 제외)
    for (let i = 1; i <= Math.floor(N / 2); i++) {
        // i가 N의 약수인지 확인 (나머지가 0이면 약수)
        if (N % i == 0) {
            numbers.push(i);
        }
    }

    // 약수들의 합을 계산 (Stream의 reduce 사용)
    const hap  = numbers.reduce((x, y) => x + y, 0);

    if (N === hap ) {
        // 완전수인 경우: "N = 약수1 + 약수2 + ..." 형태로 출력
        console.log(`${N} = ${numbers.join(' + ')}`);
    }else {
        // 완전수가 아닌 경우
        console.log(`${N} is NOT perfect.`)
    }

}