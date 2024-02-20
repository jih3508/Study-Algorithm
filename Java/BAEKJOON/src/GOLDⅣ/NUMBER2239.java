package GOLDⅣ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NUMBER2239 {

	static final int size = 9;
	static int x, y;
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strings;
		
		int[][] arrays = new int[size][size];
		Arrays.stream(arrays).forEach(array -> {
			Arrays.setAll(array, num -> 0);
		});
		for(int i = 0; i < size; i++) {
			strings = br.readLine().split("|");
			for(int j = 0; j< size; j++) {
				arrays[i][j] = Integer.parseInt(strings[j]);
			}
		}
		sudoku(arrays);
	}
	
	
	public static void sudoku(int[][] arrays) {
		
		if(isBlank(arrays)) {		
			printSudoku(arrays);
			System.exit(0);
		}else {
			int row = x;
			int col = y;
			for(int num = 1; num <= size; num++) {
				if(checked(row, col, num, arrays)) {
					arrays[row][col] = num;
					sudoku(arrays);
					arrays[row][col] = 0;
				}
			}
		}
	}
	
	public static boolean checked(int row, int col, int num, int[][] arrays) {
		
		return checkedCross(row, col, num, arrays) && checkedBox(row - row % 3, col - col % 3, num, arrays);
	}
	
	public static boolean checkedCross(int row, int col, int num, int[][] arrays){
		
		for(int k = 0; k < size; k++) {
			if(arrays[k][col] == num || arrays[row][k] == num) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean checkedBox(int row, int col, int num, int[][] arrays) {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(arrays[row + i][col + j] == num) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static boolean isBlank(int[][] arrays) {
		
		for(int i = 0; i < size; i++) {
			for(int j = 0; j< size; j++) {
				if(arrays[i][j] == 0) {
					x = i;
					y = j;
					return false;
				}
			}
		}
		
		return true;
	}
	
	public static void printSudoku(int[][] arrays) {
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < size; i++) {
			for(int j = 0; j< size; j++) {
				sb.append(arrays[i][j]);
			}
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
	}
}
