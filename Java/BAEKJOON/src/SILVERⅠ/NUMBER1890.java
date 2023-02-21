package SILVERⅠ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NUMBER1890 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] board = new int[N][N];
		long[][] field = new long[N][N];
		StringTokenizer st;
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		field[0][0] = 1;
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(board[i][j] == 0) continue;
				if( 0 <= i + board[i][j] && i + board[i][j] < N) {
					field[i + board[i][j]][j] += field[i][j];
				}
				if( 0 <= j + board[i][j] && j + board[i][j] < N) {
					field[i][j + board[i][j]] += field[i][j];
				}
				
			}
		}
		
		System.out.println(field[N- 1][N - 1]);		
	}
}
