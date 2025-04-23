package SILVERⅠ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NUMBER11660 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] matrix = new int[N + 1][N + 1];
		for(int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 1; j <= N; j++) {
				matrix[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int[][] prefix_sum = new int[N + 1][N + 1];
		
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= N; j++) {
				prefix_sum[i][j] =  prefix_sum[i-1][j] + prefix_sum[i][j-1] + matrix[i][j] - prefix_sum[i - 1][j - 1];
			}
		}
		
		int x1, y1, x2, y2;
		while(M-- > 0) {
			st = new StringTokenizer(br.readLine());
			x1 = Integer.parseInt(st.nextToken());
			y1 = Integer.parseInt(st.nextToken());
			x2 = Integer.parseInt(st.nextToken());
			y2 = Integer.parseInt(st.nextToken());
			System.out.println(prefix_sum[x2][y2]  + prefix_sum[x1 -1][y1 -1] - prefix_sum[x2][y1 - 1] - prefix_sum[x1 - 1][y2]);
		}
		
	}
}
