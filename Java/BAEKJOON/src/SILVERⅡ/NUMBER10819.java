package SILVERⅡ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NUMBER10819 {

	static int[] array;
	static int max_Num = 0;
	static int N;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		
		array = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		combination(0);
		System.out.println(max_Num);
	}
	
	public static void combination(int k) {
		
		int tmp;
		
		if (k == N) {
			int value = 0;
			for(int i = 0; i < N - 1; i++) {
				value += Math.abs(array[i + 1] - array[i]);
			}
			max_Num = Math.max(max_Num, value);
			return;
		}else {
			for(int i = k; i < N; i++) {
				tmp = array[i];
				array[i] = array[k];
				array[k] = tmp;
				combination(k + 1);
				array[k] = array[i];
				array[i] = tmp;

			}
		}
	}
}
