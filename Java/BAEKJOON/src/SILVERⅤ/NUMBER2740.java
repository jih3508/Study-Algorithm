package SILVERⅤ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NUMBER2740 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[][] A = new int[N][M];
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < M; j ++) {
				A[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[][] B = new int[M][K];
				
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < K; j ++) {
				B[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int[][] result = new int[N][K];
		
		// 행렬연산
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < K; j ++) {
				result[i][j] = 0;
				for(int x = 0; x < M; x++) {
					result[i][j] += A[i][x] * B[x][j];
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < K; j ++) {
				sb.append(result[i][j]).append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

}
