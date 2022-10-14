package GOLDⅣ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NUMBER2580 {

static int[][] matrix = new int[9][9];
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		for(int i = 0; i < 9; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 9; j++) {
				matrix[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		sudoku(0, 0);

	}
		
	/**
	 *  sudoku
	 */
	public static void sudoku(int row, int col) {
		
		// 한 행이 끈나면 다음행으로 이동
		if(col == 9) {
			sudoku(row + 1, 0);
			return;
		}
		// 9개 행을 탐색을 끝나면 결과를 출력하고 종료한다.
		if(row == 9) {
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					sb.append(matrix[i][j]).append(' ');
				}
				sb.append("\n");
			}
			
			System.out.println(sb);
			System.exit(0);
		}
		if(matrix[row][col] == 0) {
			
			for(int num = 1; num <= 9; num++) {
				if(is_value(matrix, row, col, num)) {					
					matrix[row][col] = num;
					sudoku(row, col + 1);
					
				}
			}
			matrix[row][col] = 0;
			return;
		}
		sudoku(row, col + 1);
		
	}
	

	// 스도쿠의 조건이 만족하는지 확인
	public static boolean is_value(int[][] array, int row, int col, int num) {
		return is_closs(array, row, col, num) && is_box(array, row - row % 3 ,col - col %3, num);
	}
	
	// 가로, 세로중에 중복되는 숫자 확인
	public static boolean is_closs(int[][] array, int row, int col, int num) {
		for(int i = 0; i < 9; i++) {
			if (array[row][i] == num || array[i][col] == num) return false;
		}	
		return true;
	}
	
	// 본인이 속한 영역이 중복 되는지 확인
	public static boolean is_box(int[][] array, int row, int col, int num) {
		for(int j = 0; j < 3; j++) {
			for (int i = 0; i < 3; i ++) {
				if (array[row + j][col + i] == num) return false;
			}
		}
		return true;
	}
}
