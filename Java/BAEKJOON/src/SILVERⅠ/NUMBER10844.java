package SILVER¥°;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NUMBER10844 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long MOD  = 1000000000;
		long dp[][] = new long[n+1][10];
		Arrays.setAll(dp[1], i -> 1);
		dp[1][0] = 0;
		for(int i = 2; i  <= n; i++) {
			dp[i][0] = dp[i-1][1];
			for(int j = 1; j<=8; j++) {
				dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1]) % MOD;
			}
			dp[i][9] = dp[i-1][8];
		}
		
		System.out.println(Arrays.stream(dp[n]).sum() % MOD);
		
	}
}
