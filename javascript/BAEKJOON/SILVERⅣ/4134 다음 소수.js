var input = require('fs').readFileSync(__dirname+'/test.txt').toString().trim().split("\n");
//var input = require('fs').readFileSync("/dev/stdin", "utf-8").trim().split("\n");

/**
 * n이 소수인지 판별한다.
 * 2부터 sqrt(n)까지 나누어 떨어지는 수가 없으면 소수
 */
function isPrime(n) {
    for (let i = 2; i <= Math.sqrt(n); i++) {
        if (n % i === 0) return false;
    }
    return true;
}

/**
 * n 이상의 소수 중 가장 작은 소수를 반환한다.
 */
function nextPrime(n) {
    // 0, 1은 소수가 아니므로 가장 작은 소수인 2 반환
    if (n <= 1) return 2;

    while (true) {
        if (isPrime(n)) return n;
        n++;
    }
}

const T = parseInt(input[0]); // 테스트 케이스 수
const result = [];

for (let i = 1; i <= T; i++) {
    const N = parseInt(input[i]);
    result.push(nextPrime(N));
}

// 출력은 마지막에 한 번만 (console.log 반복 호출 대신 성능 개선)
console.log(result.join("\n"));