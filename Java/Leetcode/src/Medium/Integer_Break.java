package Medium;

import java.util.Arrays;

public class Integer_Break {
	public int integerBreak(int n) {
        int[] dp = new int[n + 1];
        Arrays.setAll(dp, i -> 0);
        dp[1] = 1;
        for(int i = 2; i < (n + 1); i++) {
        	for(int j = 1; j < (i / 2 + 1); j++) {
        		dp[i] = Math.max(dp[i], j * dp[i - j]);
        		dp[i] = Math.max(dp[i], j * (i - j)); 
        	}
        }
        
        return dp[n];
    }
	
	public static void main(String[] args) {
		Integer_Break integerBreak = new Integer_Break();
		System.out.println(integerBreak.integerBreak(2));
		System.out.println(integerBreak.integerBreak(10));
	}
}
