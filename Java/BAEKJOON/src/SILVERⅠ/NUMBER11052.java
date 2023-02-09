package SILVERⅠ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NUMBER11052 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] pack = new int[N];		
		for (int i = 0; i < N; i++) {
			pack[i]=Integer.parseInt(st.nextToken());
		}
		int[] dp = new int[N];
		for(int i = 0; i < N; i++) {
			dp[i] = pack[i];
			for(int j = 0; j < i; j++) {
				dp[i] = Math.max(dp[i], dp[i - j - 1] + pack[j]);
			}
		}
		System.out.println(dp[N - 1]);
	}

}
