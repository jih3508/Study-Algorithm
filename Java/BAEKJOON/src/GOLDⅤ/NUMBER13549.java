package GOLDⅤ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class NUMBER13549 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(N);
		int[] location = new int[100001];
		Arrays.setAll(location, i -> -1);
		location[N] = 0;
		int now, fx;
		while(!queue.isEmpty()) {
			now = queue.poll();
			
			if(now == K) break;
			fx = now - 1;
			if((0 <= fx && fx <= 100000) && (location[fx] == -1 || location[now] < location[fx])) {
				location[fx] = location[now] + 1;
			    queue.add(fx);				
			}
			fx = now + 1;
			if((0 <= fx && fx <= 100000) && (location[fx] == -1 || location[now] < location[fx])) {
				location[fx] = location[now] + 1;
			    queue.add(fx);				
			}
			
			fx = now * 2;
			if((0 <= fx && fx <= 100000) && (location[fx] == -1 || location[now] < location[fx])) {
				location[fx] = location[now];
			    queue.add(fx);				
			}
			
		}
		System.out.println(location[K]);
	}

}
