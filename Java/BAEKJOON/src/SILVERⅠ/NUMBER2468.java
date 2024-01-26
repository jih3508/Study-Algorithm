package SILVERⅠ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class NUMBER2468 {
	
	static int N;
	static int[][] areas, board;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		areas = new int[N][N];
		
		StringTokenizer st;
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++) {
				areas[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int min_high = 100;
		int max_high = 0;
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				min_high = Math.min(min_high, areas[i][j]);
				max_high = Math.max(max_high, areas[i][j]);
			}
		}
		int count = 0;
		for(int high = min_high - 1; high < max_high; high++) {
			count = Math.max(count, count_area(high));
		}
			
		System.out.println(count);
		
	}
	
	public static int count_area(int high) {
		int cnt = 0;
		
		board = new int[N][N];
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				board[i][j] = areas[i][j] > high? 1 : 0;
			}
		}
		
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if( board[i][j] == 1) {
					bfs(i, j);
					cnt++;
				}
			}
		}
		
		return cnt;
	}
	
	public static void bfs(int x, int y) {
		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};
		
		Queue<int []> queue = new LinkedList<>();
		queue.add(new int[] {x, y});
		board[x][y] = 0;
		int nx, ny, fx, fy;
		while (!queue.isEmpty()) {
			int[] location = queue.poll();
			nx = location[0];
			ny = location[1];
			
			for(int k = 0; k < 4; k++) {
				fx = nx + dx[k];
				fy = ny + dy[k];
				if((0 <= fx && fx < N) && (0<= fy && fy < N) && (board[fx][fy] == 1)) {
					board[fx][fy] = 0;
					queue.add(new int[] {fx, fy});
				}
			}
		}
		
		
	}
}
