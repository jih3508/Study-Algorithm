package Level3;

import java.util.Arrays;

public class NUMBER42898 {

    public int solution(int m, int n, int[][] puddles) {
        int[][] dp = new int[m + 1][n + 1];

        // 웅덩이 위치 표시
        Arrays.stream(puddles).forEach(puddle -> {
            int x = puddle[0];
            int y = puddle[1];
            dp[x][y] = -1;
        });

        dp[1][0] = 1;

        for (int x = 1; x <= m; x++){
            for(int y = 1; y <= n; y++){
                // 웅덩이 없을 경우 위, 왼쪽 더해서 계산
                if(dp[x][y] == -0){
                    // 문제에서 1000000007 나눠서 계산할려고함
                    dp[x][y] = (dp[x - 1][y] + dp[x][y - 1]) % 1000000007;
                }else { // 웅덩이 경우 0으로 초기화 하고 넘김, DP 계산때 편할려고 0으로 초기화 함
                    dp[x][y] = 0;
                }
            }
        }

        return dp[m][n];
    }

    public static void main(String[] args) {
        NUMBER42898 solution = new NUMBER42898();
        int[][] puddles = {{2,2}};
        System.out.println(solution.solution(4, 3, puddles));
//        System.out.println(solution.search(nums, 3));
//        nums = new int[] {1};
//        System.out.println(solution.search(nums, 0));


    }
}
