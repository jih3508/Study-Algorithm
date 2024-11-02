package Medium;

import java.util.Arrays;

public class MinimumNumberOfCoinsForFruits {

    public int minimumCoins(int[] prices) {

        int size = prices.length;
        if(size == 1){
            return prices[0];
        }

        int[][] dp = new int[size][size];
        Arrays.stream(dp).forEach(arr -> Arrays.fill(arr,100_000 * size));
        dp[0][0] = prices[0];
        dp[0][1] = prices[0];

        for (int i = 1; i < size; i++) {
            dp[i][i - 1] = dp[i-1][i -1];
            dp[i][i] = Math.min( dp[i-1][i], dp[i][i-1] + prices[i]);
            for(int j = i + 1; j <= (i * 2 + 1); j++){
                if(j >= size){
                    break;
                }
                dp[i][j] = Math.min(dp[i][i -1] + prices[i], dp[i-1][j]);
            }
        }

        return dp[size-1][size-1];
    }

    public static void main(String[] args) {
        MinimumNumberOfCoinsForFruits solution = new MinimumNumberOfCoinsForFruits();
        System.out.println(solution.minimumCoins(new int[] {32}));
        System.out.println(solution.minimumCoins(new int[] {3,1,2}));
        System.out.println(solution.minimumCoins(new int[] {1,10,1,1}));
        System.out.println(solution.minimumCoins(new int[] {26,18,6,12,49,7,45,45}));

    }
}
