package SILVERⅡ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NUMBER1182 {
	
	static int[] array;
	static int count = 0;
	static int N, S;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		S = Integer.parseInt(st.nextToken());
		
		array = new int[N];
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		combination(0, 0);
		System.out.println(count);
	}
	
	public static void combination(int k, int value) {
		
		if(k > 0 && S == value) {
			count ++;
		}
		if (k == N) {
			return;
		}else {
			for(int i = k; i < N; i++) {
				combination(i + 1, value + array[i]);

			}
		}
	}

}
