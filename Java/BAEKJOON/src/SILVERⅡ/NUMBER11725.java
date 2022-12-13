package SILVER¥±;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.StringTokenizer;

public class NUMBER11725 {

	static int[] parents;
	static Map<Integer, ArrayList<Integer>> tree = new HashMap<Integer, ArrayList<Integer>>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		parents = new int[N + 1];
		int a, b;
		for(int i = 1; i <= N; i++) {
			tree.put(i, new ArrayList<Integer>());
		}
		for(int i = 1; i < N; i++) {
			st = new StringTokenizer(br.readLine());		
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			tree.get(a).add(b);
			tree.get(b).add(a);
		}
		
		level_order(1);
		
		for(int i = 2; i <= N; i++) {
			System.out.println(parents[i]);
		}
		
	}
	
	public static void level_order(int start) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(start);
		int node;
		ArrayList<Integer> data;
		while (!queue.isEmpty()) {
			node = queue.poll();
			data = tree.get(node);
			for(int i : data) {
				if(parents[i] == 0) {
					parents[i] = node;
					queue.add(i);
				}
			}			
		}
	}
}
