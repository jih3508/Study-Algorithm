/**
 * 문제: 방문 길이
 * url: https://school.programmers.co.kr/learn/courses/30/lessons/49994
 */



// 각 명령어에 대응하는 [dx, dy] 이동 벡터
const MOVE = {
    "U": [0, 1],
    "D": [0, -1],
    "R": [1, 0],
    "L": [-1, 0],
}

// 좌표평면 경계값
const BOUNDARY_MIN = -5;
const BOUNDARY_MAX = 5;


/**
 * 좌표가 경계(-5 ~ 5) 안에 있는지 확인한다.
 * @param {number} x
 * @param {number} y
 * @returns {boolean}
 */
function isWithinBoundary(x, y) {
    return (
        x >= BOUNDARY_MIN && x <= BOUNDARY_MAX &&
        y >= BOUNDARY_MIN && y <= BOUNDARY_MAX
    );
}
function solution(dirs) {



    let [x, y] = [0, 0];

    const visitedEdges = new Set(); // 지나간 구간(간선)을 저장하는 집합

    for(const dir of dirs){

        const [fx, fy] = [x + MOVE[dir][0], y + MOVE[dir][1]];

        // 경계안에 포함되었을때
        if(isWithinBoundary(fx, fy)){

            // 현재 위치 -> 다음 위치 구간을 문자열 키로 만들어 기록
            // "A|B"와 "B|A"를 모두 넣어 방향에 상관없이 같은 길로 취급
            visitedEdges.add(`(${x}, ${y}),(${fx}, ${fy})`);
            visitedEdges.add(`(${fx}, ${fy}),(${x}, ${y})`);

            // 위치 갱신
            [x, y] = [fx, fy]
        }

    }

    // 두 개씩(정방향/역방향) 저장했으므로 실제 간선 개수는 절반
    return visitedEdges.size / 2;
}



console.log(solution("ULURRDLLU"));
console.log(solution("LULLLLLLU"));