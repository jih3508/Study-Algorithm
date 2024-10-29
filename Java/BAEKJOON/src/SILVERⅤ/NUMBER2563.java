package SILVERⅤ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NUMBER2563 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] arrays = new int[101][101];
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int x, y;
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			for(int a = 0; a < 10; a++) {
				for(int b = 0; b < 10; b++) {
					arrays[x + a][y + b] = 1;
				}
			}
		}
		int count = 0;
		for(int i = 0; i <= 100; i++) {
			for(int j = 0; j <= 100; j++) {
				count += arrays[i][j];
			}
		}
		
		System.out.println(count);
		
	}
}
