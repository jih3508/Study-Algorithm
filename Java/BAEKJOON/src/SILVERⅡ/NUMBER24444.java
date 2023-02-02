package SILVERⅡ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.StringTokenizer;

public class NUMBER24444 {

	static Map<Integer, ArrayList<Integer>> grape = new HashMap<Integer, ArrayList<Integer>>();
	static int N;
	static int[] visited;
	static int count = 1;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int start = Integer.parseInt(st.nextToken());
		
		for(int i = 1; i <= N; i++) {
			grape.put(i, new ArrayList<Integer>());
		}
		visited = new int[N + 1];
		
		int a, b;
		for(int i = 1; i <= M; i++) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			grape.get(a).add(b);
			grape.get(b).add(a);
		}
		
		for(int i = 1; i <= N; i++) {
			Collections.sort(grape.get(i));
		}
		bfs(start);
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= N; i++) {
			sb.append(visited[i]).append("\n");
		}
		System.out.println(sb);
		
	}
	
	public static void bfs(int strat_node) {
		visited[strat_node] = count;
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(strat_node);
		int node;
		while(!queue.isEmpty()) {
			node = queue.poll();
			for(int n : grape.get(node)) {
				if(visited[n] == 0) {
					visited[n] = ++count;
					queue.add(n);
				}
			}
		}
	}
}
