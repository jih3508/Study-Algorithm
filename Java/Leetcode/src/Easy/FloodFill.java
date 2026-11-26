package Easy;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class FloodFill {

    private  final  int [] dx = {1, -1, 0, 0};
    private  final  int [] dy = {0, 0, -1, 1};

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int originalColor = image[sr][sc];
        // 이미 목표 색이면 바꿀 게 없다. 이 가드가 있어야 아래에서
        // "색이 바뀐 칸 = 방문한 칸"이 성립해 visited 배열 없이 돈다.
        if (originalColor == color) return image;

        int m = image.length;
        int n = image[0].length;

        // LinkedList는 원소마다 노드 객체를 만든다. 큐 용도로는 ArrayDeque가 빠르다.
        Deque<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{sr, sc});
        image[sr][sc] = color;

        while (!queue.isEmpty()) {
            int[] nowLocation = queue.poll();
            for (int i = 0; i < 4; i++) {
                int fx = nowLocation[0] + dx[i];
                int fy = nowLocation[1] + dy[i];
                if (fx < 0 || fx >= m || fy < 0 || fy >= n) continue;
                if (image[fx][fy] != originalColor) continue;
                // 넣을 때 바로 칠해서 방문 표시를 겸한다. 중복 삽입을 막는다.
                image[fx][fy] = color;
                queue.offer(new int[]{fx, fy});
            }
        }
        return image;
    }

    public static void main(String[] args) {
        FloodFill solution = new FloodFill();
        System.out.println(Arrays.deepToString(solution.floodFill(new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}}, 1, 1, 2 )));
        System.out.println(Arrays.deepToString(solution.floodFill(new int[][]{{0, 0, 0}, {0, 0, 0}}, 0, 0, 0 )));
        System.out.println(Arrays.deepToString(solution.floodFill(new int[][]{{0, 0, 0}, {0, 0, 0}}, 1, 0, 2 )));
    }

}
