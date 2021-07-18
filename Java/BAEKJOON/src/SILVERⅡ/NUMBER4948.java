package SILVER¥±;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NUMBER4948 {
	
	public static void main(String[] args) throws IOException {
    	
		boolean[] array = new boolean[123456*2 + 1];
		Arrays.fill(array, true);
		array[1] = false;
		for (int i = 2; i < 123456*2 + 1; i++) {
			for (int j = i * 2; j <123456*2 + 1; j+=i) {
				array[j] = false;
			}
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N; 
		int count;
		while (true) {
			N = Integer.parseInt(br.readLine());
			if (N == 0) {break;}
			count = 0;
			for (int i = N+1; i < 2*N; i++) {
				count += array[i] ? 1 : 0;
			}
			System.out.println(count == 0 ? 1 : count);
		}
    }

}
