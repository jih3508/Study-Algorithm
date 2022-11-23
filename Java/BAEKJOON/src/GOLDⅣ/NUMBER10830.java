package GOLD¥³;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NUMBER10830 {
	
	static int N;
	static long B;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		B = Long.parseLong(st.nextToken());
		
		int[][] matrix = new int[N][N];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++) {
				matrix[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		
		int[][] result = matrix_mul(matrix, B);
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				sb.append(result[i][j] % 1000).append(" ");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
		
	}
	
	public static int[][] matrix_mul(int[][] arrays, long expo){
		if (expo == 1) return arrays;
		
		int[][] result = matrix_mul(arrays, expo / 2);
		
		if(expo % 2 == 1) return mul(mul(result, result), arrays);
		else return mul(result, result);
	}
	
	
	public static int[][] mul(int[][] matrix1, int[][] matrix2){
		int[][] result = new int[N][N];
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				for(int k = 0; k < N; k++) {
					result[i][j] += (matrix1[k][j] * matrix2[i][k]) % 1000; 
				}
				result[i][j] = result[i][j] % 1000;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				sb.append(result[i][j]).append(" ");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
		
		return result;
	}

}
