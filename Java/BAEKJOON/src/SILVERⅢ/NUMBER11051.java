package SILVERⅢ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NUMBER11051 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[][] dp = new int[N + 1][N + 1];
		dp[0][0] = 1;
		for(int i = 1; i <= N; i++) {
			dp[i][0] = 1;
			for(int j = 1; j <= i; j++) {
				dp[i][j] = (dp[i - 1][j] + dp[i - 1][j -1]) % 10007;
			}
		}
		System.out.println(dp[N][K]);
			
	}
}
