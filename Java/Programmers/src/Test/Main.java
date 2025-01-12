package Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public int solution(int N, int[] board){
		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};

		int[][] boards = new int[N][N];
		int[] now = {N / 2, N / 2};
		for(int i = 0; i < N; i++){
			for(int j = 0; j < N; j++){
				boards[i][j] = board[i * 5 + j];
			}
		}

		int[][] result = new int[N][N];
		result[now[0]][now[1]] = boards[now[0]][now[1]];

		Queue<int[]> queue = new LinkedList<>();
		queue.add(now);
		while(!queue.isEmpty()){
			int[] location = queue.poll();
			int x = location[0];
			int y = location[1];

			for(int k = 0; k < 4; k++){
				int fx = x + dx[k];
				int fy = y + dy[k];
				boolean q1 = (0 <= fx) && (fx < N) && (0 <= fy) && (fy < N) && (fx != fy);
				if(q1 && ((result[fx][fy] == 0) ||( result[fx][fy] != 0 && (result[x][y] + boards[fx][fy] < result[fx][fy])))){
					result[fx][fy] = result[x][y] + boards[fx][fy];
					queue.add(new int[] {fx, fy});
				}

			}

		}
		int minMove = Integer.MAX_VALUE;
		for(int i = 0; i < N; i++){
			if(i != 0){
				minMove = Math.min(minMove, result[0][i]);
				minMove = Math.min(minMove, result[i][0]);
			}
			if(i != N - 1){
				minMove = Math.min(minMove, result[N - 1][i]);
				minMove = Math.min(minMove, result[i][N - 1]);
			}

		}

		Arrays.stream(result).forEach(array -> System.out.println(Arrays.toString(array)));
		//Arrays.stream(boards).forEach(array -> System.out.println(Arrays.toString(array)));

		return minMove;
	}

	public static void main(String[] args) {
		
		Main obj = new Main();
		int[] board = {9, 3, 9, 9, 9, 5, 2, 7, 8, 9, 8, 1, 5, 8, 9, 6, 1, 8, 7, 9, 9, 9, 8, 9, 9};
		System.out.println(obj.solution(5, board));

		
	}

}
