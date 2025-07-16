package SILVERⅢ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NUMBER2559 {
	
	public static void main(String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] array = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] s = new int[N + 1];
		for(int i = 0; i < N; i++) {
			s[i + 1] = s[i] + array[i];
		}
		
		int max_value = -100 * K;
		for(int i = 0; i <= N - K ; i++) {
			max_value = Math.max(max_value, s[i + K] - s[i]);
		}
		
		System.out.println(max_value);
				
	}

}
