package SILVERⅠ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class NUMBER5014 {
	
	static int[] elevator;
	static int F, S, G, U, D;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		F = Integer.parseInt(st.nextToken());
		S = Integer.parseInt(st.nextToken());
		G = Integer.parseInt(st.nextToken());
		U = Integer.parseInt(st.nextToken());
		D = Integer.parseInt(st.nextToken());
		elevator  = new int[F + 1];
		Arrays.setAll(elevator, i -> -1);
		
		bfs();
	}
	
	public static void bfs() {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(S);
		elevator[S] = 0;
		
		int stair;
		while(!queue.isEmpty()) {
			stair = queue.poll();
			
			if(stair == G) {
				System.out.println(elevator[stair]);
				return;
			}
			if (0 < stair + U && stair + U <= F && elevator[stair + U] == -1) {
				elevator[stair + U] = elevator[stair] + 1;
				queue.add(stair + U);
			}
			
			if (0 < stair - D && stair - D <= F && elevator[stair - D] == -1) {
				elevator[stair - D] = elevator[stair] + 1;
				queue.add(stair - D);
			}
		}
		
		System.out.println("use the stairs");
	}

}
