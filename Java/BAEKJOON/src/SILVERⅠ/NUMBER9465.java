package SILVER¥°;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NUMBER9465 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int n;
		int[][] sticker, dp;
		while(T-- > 0) {
			n = Integer.parseInt(br.readLine());
			sticker = new int[2][n];
			dp = new int[2][n];
			for(int i = 0; i < 2; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 0; j < n; j++) {
					sticker[i][j] = Integer.parseInt(st.nextToken()); 
				}				
			}
			dp[0][0] = sticker[0][0];
			dp[1][0] = sticker[1][0];
			if(n > 1) {
				dp[0][1] = sticker[0][1] + dp[1][0];
				dp[1][1] = sticker[1][1] + dp[0][0];
			}
			if(n > 2) {
				for(int i = 2; i < n; i++) {
					dp[0][i] = sticker[0][i] + Math.max(dp[1][i - 1], dp[1][i - 2]);
					dp[1][i] = sticker[1][i] + Math.max(dp[0][i - 1], dp[0][i - 2]);
				}
			}
			System.out.println(Math.max(Arrays.stream(dp[0]).max().getAsInt(),Arrays.stream(dp[1]).max().getAsInt()));
		}
			
	}
}
