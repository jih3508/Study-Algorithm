package GOLD¥³;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NUMBER11404 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		int[][] adj = new int[N + 1][N + 1];
		int INF = Integer.MAX_VALUE / 2;
		for (int i = 1; i <= N; i++) {
			Arrays.setAll(adj[i], x ->  INF);
		}
		StringTokenizer st;
		int a, b, c;
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());
			adj[a][b] = Math.min(adj[a][b], c);
		}
		for(int k = 1; k <= N; k++) {
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= N; j++) {
					if(i == j) adj[i][j] = 0;
					else adj[i][j] = Math.min(adj[i][j], adj[i][k] + adj[k][j]);
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				sb.append(adj[i][j] == INF? 0 : adj[i][j]).append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

}
