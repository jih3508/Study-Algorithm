package GOLDⅤ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class NUMBER2565 {

	public static void main(String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] wires = new int[n][2];
		int[] dp = new int[n];
		Arrays.setAll(dp, i -> 1);
		StringTokenizer st;
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 2; j++) {
				wires[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		// 2���� �迭 ����
		Arrays.sort(wires, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0];
			}			
		});
		
		for(int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if(wires[i][1] > wires[j][1]) {
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}
			}
		}
		
		System.out.println(n - Arrays.stream(dp).max().getAsInt());
						
	}
}
