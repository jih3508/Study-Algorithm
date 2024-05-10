package Medium;

public class MaximalSquare {

  public int maximalSquare(char[][] matrix) {

    int width = matrix[0].length;
    int height = matrix.length;

    int[][] dp = new int[height][width];

    int[] dx = {0, -1};
    int[] dy = {-1, 0};

    for (int i = 0; i < height; i++) {
      dp[i][0] = matrix[i][0] - '0';
    }

    for (int i = 0; i < width; i++) {
      dp[0][i] = matrix[0][i] - '0';
    }

    int fx, fy;


    for (int x = 1; x < height; x++) {
      for (int y = 1; y < width; y++) {
        if (matrix[x][y] == '1') {
          boolean flag = true;

            if(matrix[fx][fy] == '1' )){

            }
            else{
              flag = false;
              break;
            }

            if(flag){
              dp[x][y] = dp[fx][fy] + 1;
            }

          }
        else{
          for (int k = 0; k < 3; k++) {
            fx = x + dx[k];
            fy = y + dy[k];
            dp[x][y] = Math.max(dp[fx][fy], dp[x][y]);
          }

        }
        }

      }
    }
    return dp[height - 1][width - 1];
  }


  public static void main(String[] args) {
    MaximalSquare maximalSquare = new MaximalSquare();
    System.out.println(maximalSquare.maximalSquare(new char[][]{{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}}));
  }

}
