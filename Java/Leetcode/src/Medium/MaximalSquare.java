package Medium;

import java.util.Arrays;

public class MaximalSquare {

  public int maximalSquare(char[][] matrix) {

    // 초기설정
    // 가로세로 길이
    int width = matrix[0].length;
    int height = matrix.length;

    int maxValue = 0; // 최대값

    // DP 초기화
    int[][] dp = new int[height][width];

    // 왼쪽, 위, 왼쪽 대각선 위
    int[] dx = {0, -1, -1};
    int[] dy = {-1, 0, -1};

    /*
     * 0번째 행열 그대로 주입
     */
    for (int i = 0; i < height; i++) {
      dp[i][0] = matrix[i][0] - '0';
      maxValue = Math.max(dp[i][0], maxValue);
    }

    for (int i = 0; i < width; i++) {
      dp[0][i] = matrix[0][i] - '0';
      maxValue = Math.max(dp[0][i], maxValue);
    }

    int fx, fy;


    // (1, 1) 부터 탐색 시작
    for (int x = 1; x < height; x++) {
      for (int y = 1; y < width; y++) {

        // 현재 matrix 위치가 1일 경우 dp 탐색
        if (matrix[x][y] == '1') {
          int value = width + height;
          for (int k = 0; k < 3; k++) {
            fx = x + dx[k];
            fy = y + dy[k];
            value = Math.min(value, dp[fx][fy]);
          }
          dp[x][y] = value + 1; // 탐색 한 것 중 가장 적은 것을 더한다.


        }else{
          dp[x][y] = 0;
        }
        maxValue = Math.max(maxValue, dp[x][y]);
      }
    }

    return maxValue * maxValue;
  }


  public static void main(String[] args) {
    MaximalSquare maximalSquare = new MaximalSquare();
    System.out.println(maximalSquare.maximalSquare(new char[][]{{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}}));
    System.out.println(maximalSquare.maximalSquare(new char[][] {{'0','1'},{'1','0'}}));
  }

}
