package SILVERⅡ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class NUMBER23757 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		PriorityQueue<Integer> presents = new PriorityQueue<Integer>();
		for(int i = 0; i < N; i++) {
			presents.offer(-1 * Integer.parseInt(st.nextToken()));
		}
		st = new StringTokenizer(br.readLine());
		int[] children = new int[M];
		for(int i  = 0; i < M; i++) {
			children[i] = Integer.parseInt(st.nextToken());
		}
		int present;
		int flag = 1;
		for(int child: children) {
			present = -1 * presents.poll();
			if(child > present) {
				flag = 0;
				break;
			}
			presents.offer(child - present);
		}
		
		System.out.println(flag);
	}

}
