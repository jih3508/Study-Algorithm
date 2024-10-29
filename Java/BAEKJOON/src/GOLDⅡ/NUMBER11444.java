package GOLDⅡ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NUMBER11444 {

	static int size = 2;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		StringTokenizer st = new StringTokenizer(br.readLine());
		long N = Long.parseLong(st.nextToken());
		
		long[][] matrix = {{1, 1}, {1, 0}};
		
		System.out.println(N > 0 ? matrix_mul(matrix, N)[0][1]: 0);
		
	}
	
	public static long[][] matrix_mul(long[][] arrays, long expo){
		if (expo == 1) return arrays;
		
		long[][] result = matrix_mul(arrays, expo / 2);
		
		if(expo % 2 == 1) return mul(mul(result, result), arrays);
		else return mul(result, result);
	}
	
	
	public static long[][] mul(long[][] matrix1, long[][] matrix2){
		long[][] result = new long[size][size];
		
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				for(int k = 0; k < size; k++) {
					result[i][j] += (matrix1[k][j] * matrix2[i][k]) % 1000000007; 
				}
				result[i][j] = result[i][j] % 1000000007;
			}
		}
		
		return result;
	}
	
}
