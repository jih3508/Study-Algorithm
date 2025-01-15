package Easy;

import java.util.Arrays;

public class CountingBits {

    public int[] countBits(int n) {

        int[] dp = new int[n + 1];

        dp[0] = 0;
        dp[1] = 1;
        int n2 = 2;
        for (int i = 2; i <= n; i++) {
            if (i == n2){
                dp[i] = 1;
                n2 *= 2;
            }else{
                dp[i] = dp[i - n2 / 2] + 1;
            }
        }

        return dp;
    }

    public static void main(String[] args) {
        CountingBits obj = new CountingBits();
        System.out.println(Arrays.toString(obj.countBits(2)));
        System.out.println(Arrays.toString(obj.countBits(5)));
    }
}
