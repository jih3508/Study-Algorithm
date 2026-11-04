package Medium;

import java.util.ArrayDeque;
import java.util.Deque;

public class NumberOfIslands {

    // 상하좌우 4방향만 연결로 인정 — 대각선은 다른 섬
    private static final int[] DX = {-1, 1, 0, 0};
    private static final int[] DY = {0, 0, -1, 1};

    private int m, n;

    /**
     * 격자에서 4방향으로 이어진 '1' 덩어리(섬)의 개수를 센다.
     * @param grid '1'(땅)과 '0'(물) 격자. 방문한 땅을 '0'으로 바꾼다.
     */
    public int numIslands(char[][] grid) {
        this.m = grid.length;
        this.n = grid[0].length;

        int count = 0;
        for (int x = 0; x < m; x++) {
            for (int y = 0; y < n; y++) {
                // 남은 '1'은 아직 어떤 섬에도 안 들어간 땅 — 새 섬의 시작점
                if (grid[x][y] == '1') {
                    bfs(grid, x, y);
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * (x, y)에서 시작해 연결된 땅을 모두 물('0')로 바꿔 방문 처리한다.
     * @param grid 탐색할 격자 (제자리에서 수정)
     * @param x 시작 행
     * @param y 시작 열
     */
    private void bfs(char[][] grid, int x, int y) {
        Deque<int[]> queue = new ArrayDeque<>();
        // 방문 표시는 꺼낼 때가 아니라 넣을 때 — 같은 칸의 중복 삽입 방지
        grid[x][y] = '0';
        queue.offer(new int[]{x, y});

        while (!queue.isEmpty()) {
            int[] nowLocation = queue.poll();

            for (int i = 0; i < 4; i++) {
                int fx = nowLocation[0] + DX[i];
                int fy = nowLocation[1] + DY[i];

                // 범위 검사를 먼저 해야 grid 접근에서 인덱스 예외가 안 남
                if (0 <= fx && fx < m && 0 <= fy && fy < n
                        && grid[fx][fy] == '1') {
                    grid[fx][fy] = '0';
                    queue.offer(new int[]{fx, fy});
                }
            }
        }
    }


    public static void main(String[] args) {
        NumberOfIslands solution = new NumberOfIslands();
        // Example 1 — 기대 출력: 1
        char[][] grid1 = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };

        System.out.println(solution.numIslands(grid1));

        // Example 2 — 기대 출력: 3
        char[][] grid2 = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };

        System.out.println(solution.numIslands(grid2));
    }

}
