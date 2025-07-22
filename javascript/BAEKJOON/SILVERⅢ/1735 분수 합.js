var input = require('fs').readFileSync(__dirname+'/test.txt').toString().trim().split("\n");
//var input = require('fs').readFileSync("/dev/stdin", "utf-8").trim().split("\n");

/**
 * 유클리드 호제법을 이용한 최대공약수(GCD) 계산
 * @param x 첫 번째 수
 * @param y 두 번째 수
 * @return x와 y의 최대공약수
 */
const GCD = (x, y) => {
    let r;
    while(x % y != 0 && y != 0){
        r = x  % y;
        x = y;
        y = r;
    }

    return y;
}

// 첫 번째 분수 A1/B1 입력 받기
const [a1, b1] = input[0].split(" ");

// 두 번째 분수 A2/B2 입력 받기
const [a2, b2] = input[1].split(" ");


// 두 분수의 합 계산
// A1/B1 + A2/B2 = (A1*B2 + A2*B1) / (B1*B2)
const a3 = a1 * b2 + a2 * b1; // 합의 분자
const b3 = b1 * b2;            // 합의 분모

// 기약분수로 만들기 위해 최대공약수(GCD) 구하기
const gcd  = GCD(a3, b3);

// 분자와 분모를 최대공약수로 나누어 기약분수 출력
console.log(`${Math.floor(a3 / gcd)} ${Math.floor(b3 / gcd)}`)