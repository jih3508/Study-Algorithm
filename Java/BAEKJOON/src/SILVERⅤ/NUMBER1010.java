package SILVERⅤ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NUMBER1010 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for(int t = 0; t < T; t++) {
			st = new StringTokenizer(br.readLine());
			int east = Integer.parseInt(st.nextToken());
			int west = Integer.parseInt(st.nextToken());
			int[][] dp = new int[west + 1][west + 1];
			dp[0][0] = 1;
			for(int i = 1; i <= west; i++) {
				dp[i][0] = 1;
				for(int j = 1; j <= i; j++) {
					dp[i][j] = (dp[i - 1][j] + dp[i - 1][j -1]);
				}
			}
			System.out.println(dp[west][east]);
		}
					
	}
}
