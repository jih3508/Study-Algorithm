package SILVER¥²;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NUMBER15649 {

	static int N, M;
	static StringBuilder sb = new StringBuilder();
	static int[] array;
	static boolean[] visited;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		array = new int[M];
		
		visited = new boolean[N+1];

		
		NM(0);
		System.out.println(sb);
	}
	
	public static void NM(int m) {		
		if (m == M){
			for (int i = 0; i < M; i ++) {
				sb.append(array[i] + " ");
			}
			sb.append("\n");
		}else {
			for(int k = 1; k <= N; k++) {
				if(!visited[k]) {
					visited[k] = true;
					array[m] = k;
					NM(m+1);
					visited[k] = false;
				}
				
			}
		}
				
	}
}
