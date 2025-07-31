var input = require('fs').readFileSync(__dirname+'/test.txt').toString().trim().split("\n");
//var input = require('fs').readFileSync("/dev/stdin", "utf-8").trim().split("\n");

/**
 * 유클리드 호제법을 사용한 최대공약수 계산
 */
const GCD = (x, y) => {
    let r;
    while(x % y != 0){

        r = x % y;
        x = y;
        y = r;
    }

    return y;
}


const N = parseInt(input[0]);

let positions = new Array(N);

for (let i = 1; i <= N; i++) {
    positions[i - 1] = parseInt(input[i]);
}

// 연속된 가로수들 사이의 거리 계산
let gaps = new Array(N - 1);
for(let i = 0; i < N - 1; i++) {
    gaps[i] = Math.abs(positions[i + 1] - positions[i]);
}

// 모든 간격의 최대공약수 계산
let gcd = gaps[0];
let totalDistance = gaps[0];
for (let i = 1; i < gaps.length; i++) {
    gcd = GCD(gcd, gaps[i]);
    totalDistance += gaps[i];
}

// 필요한 가로수 개수 = (총 거리 / 최소 간격) - 기존 간격 개수
console.log((totalDistance / gcd) - gaps.length);