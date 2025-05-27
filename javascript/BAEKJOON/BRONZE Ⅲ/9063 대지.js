var input = require('fs').readFileSync(__dirname+'/test.txt').toString().trim().split("\n");
//var input = require('fs').readFileSync("/dev/stdin", "utf-8").trim().split("\n");

const N = parseInt(input[0]);

// 모든 옥구슬 위치 중에서 x, y 좌표의 최솟값과 최댓값을 찾기 위한 변수들
// 최솟값 변수들은 가능한 최댓값으로 초기화
let minX = 10000; // x좌표의 최솟값 (서쪽 경계)
let minY = 10000; // y좌표의 최솟값 (남쪽 경계)

let maxX = -10000;
let maxY = -10000;

for (let i = 1; i <= N; i++) {

    const [x, y] = input[i].split(' ').map(Number);

    // 현재 점의 x좌표와 지금까지의 최솟값을 비교하여 더 작은 값으로 갱신
    minX = Math.min(minX, x);
    // 현재 점의 y좌표와 지금까지의 최솟값을 비교하여 더 작은 값으로 갱신
    minY = Math.min(minY, y);
    // 현재 점의 x좌표와 지금까지의 최댓값을 비교하여 더 큰 값으로 갱신
    maxX = Math.max(maxX, x);
    // 현재 점의 y좌표와 지금까지의 최댓값을 비교하여 더 큰 값으로 갱신
    maxY = Math.max(maxY, y);

}

// 모든 옥구슬을 포함하는 가장 작은 직사각형의 넓이 계산
// 가로 길이: (동쪽 경계 - 서쪽 경계)
// 세로 길이: (북쪽 경계 - 남쪽 경계)
// 넓이 = 가로 × 세로
console.log((maxX - minX) * (maxY - minY));