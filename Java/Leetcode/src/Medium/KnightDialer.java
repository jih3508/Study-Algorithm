package Medium;

import java.util.Arrays;

public class KnightDialer {

    // 이동 가능한 지점
    int[][] movePoints = {
            {4, 6}, // 0
            {6, 8}, // 1
            {7, 9}, // 2
            {4, 8}, // 3
            {3, 9, 0}, // 4
            {}, // 5
            {1, 7, 0}, // 6
            {2, 6}, // 7
            {1, 3}, // 8
            {2, 4} // 9
    };

    long MOD = (int) Math.pow(10, 9) + 7; // 나머지 연산 수

    public int knightDialer(int n) {

        long[][] dp = new long[n][10];

        Arrays.fill(dp[0], 1);

        for (int i = 0; i < n - 1; i++) {
            // 0 ~ 9까지 탐색
            for(int j = 0; j < 10; j++){
                // 이동할 지점에 추가
                for(int num: movePoints[j]){
                    dp[i+1][num] = (dp[i+1][num] +  dp[i][j]) % MOD;
                }
            }

        }
        // 마지막 이동가능한 모든수 구하기
        long result = 0;
        for (int i = 0; i < 10; i++){
            result = (result + dp[n-1][i]) % MOD;
        }

        return (int) result;
    }

    public static void main(String[] args) {
        KnightDialer obj = new KnightDialer();
        System.out.println(obj.knightDialer(1));
        System.out.println(obj.knightDialer(2));
        System.out.println(obj.knightDialer(3131));


    }
}
