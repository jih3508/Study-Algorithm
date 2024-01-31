package SILVERⅤ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NUMBER14606 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		long[] dp = new long[91];
		dp[0] = 0;
		dp[1] = 0;
		dp[2] = 1;

		int B, C;
		
		for(int i = 3; i <= N; i++) {
			B = i / 2 + (i % 2);
			C = i / 2;
			dp[i] = B * C + dp[B] + dp[C];
		}
		
		System.out.println(dp[N]);
		
	}

}
