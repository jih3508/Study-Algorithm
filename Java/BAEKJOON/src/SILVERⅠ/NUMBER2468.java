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
	
	static int[][] paper;
	static int N, M;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		paper = new int[N][M];
		int x1, y1, x2, y2;
		for(int k = 0; k < K; k++) {
			st = new StringTokenizer(br.readLine());
			x1 = Integer.parseInt(st.nextToken());
			y1 = Integer.parseInt(st.nextToken());
			x2 = Integer.parseInt(st.nextToken());
			y2 = Integer.parseInt(st.nextToken());
			for(int x = x1; x < x2; x++) {
				for(int y = y1; y < y2; y++) {
					paper[x][y] = 1;
				}
			}
		}
		
		List<Integer> areas = new ArrayList<Integer>();
		for(int x = 0; x < N; x++) {
			for(int y = 0; y < M; y++) {
				if(paper[x][y] == 0) {
					areas.add(bfs(x, y));
				}
			}
			
		}
		Collections.sort(areas);
		System.out.println(areas.size());
		for(int i = 0; i < areas.size(); i++) {
			System.out.print(areas.get(i) + " ");
		}
		
	}
	
	public static int bfs(int x, int y) {
		// 상화자우 방향설정
		int[] dx = new int[] {0, 0, -1, 1};
		int[] dy = new int[] {-1, 1, 0, 0};
		
		Queue<int[]> queue = new LinkedList<int[]>();
		int count = 1;
		paper[x][y] = 1;
			
		queue.add(new int[] {x, y});
		int fx, fy, cx, cy;
		while (!queue.isEmpty()) {
			int[] location = queue.poll();
			cx = location[0];
			cy = location[1];
			for(int i = 0; i < 4; i++) {
				fx = cx + dx[i];
				fy = cy + dy[i];
				if(0 <= fx && fx < N && 0<= fy && fy < M && paper[fx][fy] == 0) {
					paper[fx][fy] = 1;
					queue.add(new int[] {fx, fy});
					count++;
				}
			}
		}
		
		return count;
	}

}
