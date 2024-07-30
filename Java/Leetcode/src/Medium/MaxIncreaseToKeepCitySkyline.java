package Medium;

import java.util.Arrays;

public class MaxIncreaseToKeepCitySkyline {
    public int maxIncreaseKeepingSkyline(int[][] grid) {

        int width = grid.length; // 길이
        int[][] buildings = new int[width][width];
        int result = 0; // 결과 값

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < width; j++) {
                int maxValueX = Arrays.stream(grid[i]).max().getAsInt(); // x축 가장 큰 값
                int maxValueY = 0;
                // y축 가장 큰 값
                for (int k = 0; k < width; k++) {
                    maxValueY = Math.max(maxValueY, grid[k][j]);
                }
                buildings[i][j] = Math.min(maxValueX, maxValueY); // gird[i][j]기준으로 행과 열중에서 작은 값을 지정
                buildings[i][j] = Math.max(buildings[i][j], grid[i][j]); // 지정한 값과 현재 위치 값중 큰값으로 지정한다.
                result += buildings[i][j] - grid[i][j]; // 현재 위치와 새로 만들 빌딩 높이 크기 차이를 구한다.
            }
        }

        return result;
    }

    public static void main(String[] args) {
        MaxIncreaseToKeepCitySkyline maximalSquare = new MaxIncreaseToKeepCitySkyline();
        System.out.println(maximalSquare.maxIncreaseKeepingSkyline(new int[][] {{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}}));
        System.out.println(maximalSquare.maxIncreaseKeepingSkyline(new int[][] {{0,0,0},{0,0,0},{0,0,0}}));
    }
}
