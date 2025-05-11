package SILVERⅠ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NUMBER2447 {

static String[][] matrix;
	
	public static void main(String[] args) throws IOException {
    	
		int i, j;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		matrix = new String[n][n];
		for(i = 0; i < n; i++) {
			Arrays.fill(matrix[i], "*");
		}
		star(0, 0, n / 3);
		
		String s;
		for(i = 0; i < n; i++) {
			s = "";
			for(j =0; j< n; j++) {
				s += matrix[i][j];
			}
			System.out.println(s);
		}
	}
	
	static void star(int x, int y, int k) {
		int i, j;
		if (k < 1) {
			return;
		}
		for(i = 0; i < k; i++) {
			for(j = 0; j < k; j++) {
				matrix[x + k +i][y + k + j]= " ";
			}
		}
		
		for(i = 0; i < 3; i++) {
			for(j = 0; j < 3; j++) {
				star(x + i * k, y + j * k, k/3);
			}
		}
	}
}
