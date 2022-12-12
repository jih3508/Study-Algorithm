package SILVER¥²;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NUMBER15654 {
	
	static int[] array1, array2;
	static int N, M;
	static StringBuilder sb = new StringBuilder();
	static boolean[] visited;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		array1 = new int[N];
		array2 = new int[M];
		visited = new boolean[N];
		for(int i = 0; i < N; i ++) {
			array1[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(array1);
		NM(0);
		System.out.println(sb);
		
	}
	
	public static void NM(int x) {
		if(x == M) {
			for(int i = 0; i < M; i++) {
				sb.append(array2[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		for(int i = 0; i < N; i++) {
			if(!visited[i]) {
				visited[i] = true;
				array2[x] = array1[i];
				NM(x + 1);
				visited[i] = false;
			}
		}
		
	}

}
