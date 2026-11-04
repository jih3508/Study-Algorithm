/**
 * @param {character[][]} grid
 * @return {number}
 */
var numIslands = function(grid) {

    // 상하좌우 4방향만 연결로 인정 — 대각선은 다른 섬
    const DX = [-1, 1, 0, 0];
    const DY = [0, 0, -1, 1];
    const [m, n] = [grid.length, grid[0].length];

    /**
     * (x, y)에서 시작해 연결된 땅을 모두 물('0')로 바꿔 방문 처리한다.
     * @param grid 탐색할 격자 (제자리에서 수정)
     * @param x 시작 행
     * @param y 시작 열
     */
    const dfs = (x, y) =>{
        // 재귀 대신 배열 스택 — 섬이 크면 재귀 깊이가 칸 수만큼 깊어져 스택이 넘침
        // push/pop은 배열 끝에서만 일어나서 O(1)
        let stack = [[x, y]];
        // 방문 표시는 꺼낼 때가 아니라 넣을 때 — 같은 칸의 중복 삽입 방지
        grid[x][y] = "0";

        while(stack.length > 0){
            const nowLocation = stack.pop();

            for (let i = 0; i < 4; i++) {
                const [fx, fy] = [nowLocation[0] + DX[i], nowLocation[1] + DY[i]];
                // 범위 검사를 먼저 해야 grid[fx]가 undefined인 경우를 피함
                if (0 <= fx && fx < m && 0 <= fy && fy < n
                    && grid[fx][fy] === "1") {
                    grid[fx][fy] = "0";
                    stack.push([fx, fy]);
                }
            }
        }
    }

    let count = 0;
    /**
     * 격자에서 4방향으로 이어진 '1' 덩어리(섬)의 개수를 센다.
     * @param grid '1'(땅)과 '0'(물) 격자. 방문한 땅을 '0'으로 바꾼다.
     */
    for (let x = 0; x < m; x++) {
        for (let y = 0; y < n; y++) {
            if(grid[x][y] === '1'){
                dfs(x, y);
                count++;
            }
        }
    }

    return count;
};

console.log(numIslands([
    ["1","1","1","1","0"],
    ["1","1","0","1","0"],
    ["1","1","0","0","0"],
    ["0","0","0","0","0"]
]));

console.log(numIslands([
    ["1","1","0","0","0"],
    ["1","1","0","0","0"],
    ["0","0","1","0","0"],
    ["0","0","0","1","1"]
]));
