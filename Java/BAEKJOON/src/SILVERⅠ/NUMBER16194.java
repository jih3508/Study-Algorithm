package SILVERⅠ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NUMBER16194 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] p = new int[N];
		int[] dp = new int[N];
		for(int i = 0; i < N; i++) {
			p[i] = Integer.parseInt(st.nextToken());
		}
		dp[0] = p[0];
		for(int i = 1; i < N; i++) {
			dp[i] = p[i];
			for(int j = 0; j < i; j++) {
				dp[i] = Math.min(dp[i], dp[j] + p[i - j - 1]);
			}
		}
		System.out.println(dp[N - 1]);		
	}

}
