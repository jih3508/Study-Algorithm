package SILVERⅠ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NUMBER2156 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] array = new int[n];
		for(int i = 0; i < n; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
		int[] dp = new int[n];
		dp[0] = array[0];
		if(n > 1) dp[1] = array[0] + array[1];
		if(n > 2) { 
			dp[2] = Math.max(array[1] + array[2], array[0] + array[2]);
			dp[2] = Math.max(dp[2], dp[1]);
		}
		for(int i = 3; i < n; i++) {
			dp[i] = Math.max(dp[i-2], dp[i-3] + array[i - 1]);
			dp[i] = Math.max(dp[i-1], dp[i] + array[i]);
		}
		System.out.println(dp[n-1]);
	}

}
