package Level2;

import java.util.Arrays;

public class NUMBER12913 {

    int solution(int[][] land) {

        int N = land.length;

        int[][] result = new int[N][4];

        for (int k = 0; k < 4; k++) {
            result[0][k] = land[0][k];
        }
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    if(j == k) continue;
                    result[i+1][j] = Math.max(result[i+1][j], result[i][j] + land[i + 1][k]);
                }
            }
        }


        return Arrays.stream(result[N-1]).max().getAsInt();
    }

    public static void main(String[] args) {
        NUMBER12913 obj = new NUMBER12913();
        System.out.println(obj.solution(new int[][]  {  {1,2,3,5},
                                                        {5,6,7,8},
                                                        {4,3,2,1}}));

    }
}
