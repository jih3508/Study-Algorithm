package SILVER¥°;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NUMBER1932 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] array = new int[n][n+1];
		StringTokenizer st;
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j <= i; j++ ) {
				array[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for(int i = 1; i < n; i++) {
			array[i][0] += array[i-1][0]; 
			for(int j = 1; j <= i; j++) {
				array[i][j] += Math.max(array[i-1][j-1], array[i-1][j]);
			}
		}
		System.out.println(Arrays.stream(array[n-1]).max().getAsInt());
	}

}
