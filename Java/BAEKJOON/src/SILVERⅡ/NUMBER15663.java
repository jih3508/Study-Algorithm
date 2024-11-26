package SILVERⅡ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class NUMBER15663 {

	static int[] array, result;
	static int N, M;
	static Set<String> set = new HashSet<String>();
	static StringBuilder sb = new StringBuilder();
	static boolean[] checked;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		array = new int[N];
		result = new int[M];
		checked = new boolean[N];
		for(int i = 0; i < N; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(array);
		
		NM(0);
		System.out.println(sb);
	}
	
	public static void NM(int k) {
		StringBuilder NMsb = new StringBuilder();
		if (k == M) {
			for(int i = 0; i < M; i++) {
				NMsb.append(result[i]).append(" ");
			}
			if(!set.contains(NMsb.toString())) {
				sb.append(NMsb).append("\n");
				set.add(NMsb.toString());
			}
			return ;
		} 
		
		for(int i = 0; i < N; i++) {
			if(!checked[i]) {
				checked[i] = true;
				result[k] = array[i];
				NM(k + 1);
				checked[i] = false;
			}
		}
	}
}
