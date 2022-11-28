package SILVER¥²;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NUMBER2021 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] ranks = new int[N];
		for(int i = 0; i < N; i++) {
			ranks[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(ranks);
		long count = 0;
		for(int i = 0; i < N; i++) {
			count += Math.abs(ranks[i] - 1 - i);
		}
		System.out.println(count);
	}
}
