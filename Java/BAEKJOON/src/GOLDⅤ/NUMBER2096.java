package GOLDⅤ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NUMBER2096 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] max_dp = new int[2][3];
		int[][] min_dp = new int[2][3];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 3; i++) {
			max_dp[0][i] = Integer.parseInt(st.nextToken());
			min_dp[0][i] = max_dp[0][i];
		}
		
		// 입력할때 마다 dp 연산한다.
		int x1, x2, x3; // 입력 받을값 변수
		for(int i = 1; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			x1 = Integer.parseInt(st.nextToken());
			x2 = Integer.parseInt(st.nextToken());
			x3 = Integer.parseInt(st.nextToken());
			// 최대값 dp 점화식
			max_dp[1][0] = x1 + Math.max(max_dp[0][0], max_dp[0][1]);
		    max_dp[1][1] = x2 + Math.max(max_dp[0][0], Math.max(max_dp[0][1], max_dp[0][2]));
		    max_dp[1][2] = x3 + Math.max(max_dp[0][1], max_dp[0][2]);
		    
		    // 최소값 dp 점화식
		    min_dp[1][0] = x1 + Math.min(min_dp[0][0], min_dp[0][1]);
		    min_dp[1][1] = x2 + Math.min(min_dp[0][0], Math.min(min_dp[0][1], min_dp[0][2]));
		    min_dp[1][2] = x3 + Math.min(min_dp[0][1], min_dp[0][2]);
		    
		    // 연산 끝난후에 이전값으로 저장
		    for(int k = 0; k < 3; k++) {
		    	max_dp[0][k] = max_dp[1][k];
		    	min_dp[0][k] = min_dp[1][k];
		    } 
		}
		
		System.out.println(Arrays.stream(max_dp[0]).max().getAsInt() + " " + Arrays.stream(min_dp[0]).min().getAsInt());
		
	}

}
