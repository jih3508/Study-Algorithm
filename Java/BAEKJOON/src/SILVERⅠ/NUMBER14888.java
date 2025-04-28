package SILVERⅠ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NUMBER14888 {
	
	static int max_value = Integer.MIN_VALUE;
	static int min_value = Integer.MAX_VALUE;
	static int[] numbers;
	static int  N;
	
	public static void main(String[] args) throws IOException {
		
		int x, y;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		numbers = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
			
		for(int i = 0; i < N; i++) {
			numbers[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		
		int plus = Integer.parseInt(st.nextToken());
		int minus = Integer.parseInt(st.nextToken());
		int mul = Integer.parseInt(st.nextToken());
		int div = Integer.parseInt(st.nextToken());
		
		operater(1, plus, minus, mul, div, numbers[0]);
		
		System.out.println(max_value);
		System.out.println(min_value);
		
	}
	
	static public void operater(int n, int pl, int mi, int mu, int di, int number) {
		if (n == N) {
			max_value = Math.max(max_value, number);
			min_value = Math.min(min_value, number);
			return;
		}
		
		if(pl > 0) {
			operater(n + 1, pl - 1, mi, mu, di, number + numbers[n]);
		}
		if(mi > 0) {
			operater(n + 1, pl, mi - 1, mu, di, number - numbers[n]);
		}
		if(mu > 0) {
			operater(n + 1, pl, mi, mu - 1, di, number * numbers[n]);
		}
		if(di > 0) {
			operater(n + 1, pl, mi, mu, di - 1, number / numbers[n]);
		}
	}
}
