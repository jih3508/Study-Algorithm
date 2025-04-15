/*
 * 554. Brick Wall
 * https://leetcode.com/problems/brick-wall/description/
 */
/**
 * @param {number[][]} wall
 * @return {number}
 */
var leastBricks = function(wall) {

    const size = wall.length; // 벽의 총 행 수
    let map = new Map(); // 벽돌 경계의 위치와 그 빈도수를 저장하는 맵
    let maxCount = 0; // 가장 많이 등장하는 벽돌 경계선의 수

    for (let i = 0; i < size; i++) {
        const row = wall[i]; // 현재 행의 벽돌 배열을 가져옴
        let length = 0; // 현재까지의 누적 길이
        for (let j = 0; j < row.length - 1; j++) { // 마지막 벽돌은 벽의 끝이므로 제외
            length += row[j]; // 현재 벽돌의 길이를 누적
            const value = map.get(length) ? map.get(length) + 1 : 1;
            map.set(length, value); // 맵에 업데이트된 빈도수 저장
            maxCount = Math.max(maxCount, value); // 최대 빈도수 갱신
        }
    }

    return size - maxCount; // 벽의 전체 행 수에서 최대 경계선을 뺀 값이 최소로 가로지르는 벽돌 수
};

let wall = [[1,2,2,1],[3,1,2],[1,3,2],[2,4],[3,1,2],[1,3,1,1]];
console.log(leastBricks(wall));

wall = [[1],[1],[1]];
console.log(leastBricks(wall));
