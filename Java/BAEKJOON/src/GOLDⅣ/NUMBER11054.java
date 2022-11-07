package GOLD¥³;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NUMBER11054 {

	public static void main(String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] S = new int[N];
		int[] reverseS = new int[N];
		
		for(int i = 0; i < N; i++) {
			S[i] = Integer.parseInt(st.nextToken());
			reverseS[N-i-1] = S[i];
		}
		
		int[] dp_r = LIS(S, N, 1);
		int[] dp_l = LIS(reverseS, N, 0);
		int[] dp = new int[N];
		for(int i = 0; i < N; i++) {
			dp[i] = dp_r[i] + dp_l[N - i -1];
		}
		
		System.out.println(Arrays.stream(dp).max().getAsInt());
	}
	
	
	public static int[] LIS(int[] S, int N, int num) {
		int[] dp = new int[N];
		Arrays.setAll(dp, i -> num);
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < i; j++) {
				if(S[i] > S[j]) {
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}
			}
		}
		
		return dp;
	}
}
