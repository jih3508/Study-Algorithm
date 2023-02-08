package SILVERⅠ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class NUMBER7562 {
	
	static int[] dx = {-2, -2, -1, -1, 1, 1, 2, 2}; 
	static int[] dy = {-1, 1, -2, 2, -2, 2, -1, 1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int[] start, end;
		int size;
		while(N-- > 0) {
			size = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());			
			start = new int[] {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
			st = new StringTokenizer(br.readLine());
			end = new int[] {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
			System.out.println(bfs(size, start, end));
		}
		
	}
	
	public static int bfs(int size, int[] start, int[] end) {
		int[][] fields = new int[size][size];
		Queue<int[]> queue =  new LinkedList<int[]>();
		queue.add(start);
		int x, y, fx, fy;
		int[] location;
		while (!queue.isEmpty()) {
			location = queue.poll();
			x = location[0];
			y = location[1];
			if(x == end[0] && y == end[1]) break;
			for(int i = 0; i < 8; i++) {
				fx = x + dx[i];
				fy = y + dy[i];
				if(0 <= fx && fx < size && 0<= fy && fy < size && fields[fx][fy] == 0) {
					fields[fx][fy] = fields[x][y] + 1;
					queue.add(new int[] {fx, fy});
				}
			}
		}
		
		return fields[end[0]][end[1]];
	}

}
