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

public class NUMBER1926 {
	
	static int n, m;
	static int[][] picture;
	static List<Integer> counter = new ArrayList<Integer>(); // 영역 넓이 담을 공간
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		picture = new int[n][m];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < m; j++){
				picture[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		counter.add(0); // 없는 경우 0을 출력 해야 하기 때문에 0을 추가한다.
		 
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++){
				if(picture[i][j] == 1) bfs(i, j);
			}
		}
		
		System.out.println(counter.size() - 1);
		System.out.println(Collections.max(counter));
	}
	
	public static void bfs(int x, int y) {
		Queue<int[]> queue = new LinkedList<int[]>();
		queue.add(new int[] {x, y});
		int count = 1;
		int[] dx = {0, 0, -1, 1};
		int[] dy = {-1, 1, 0, 0};
		picture[x][y] = 0;
		while (!queue.isEmpty()) {
			int[] location = queue.poll();
			int nx = location[0];
			int ny = location[1];
			
			for(int i = 0; i < 4; i++) {
				int fx = nx + dx[i];
				int fy = ny + dy[i];
				// 그림 영역이 포함 되어 있는지 확인
				if(0 <= fx && fx < n && 0 <= fy && fy < m && picture[fx][fy] == 1) {
					// 그림 역역있으면 영역을 지우고 면적개수 +1 증가한다.
					count++;
					picture[fx][fy] = 0;
					queue.add(new int[] {fx, fy});
				}
			}
		}
		counter.add(count);
	}

}
