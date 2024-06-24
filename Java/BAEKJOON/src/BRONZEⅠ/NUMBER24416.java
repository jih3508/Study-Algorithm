package BRONZEⅠ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NUMBER24416 {

	static int count1 = 1;
	static int count2 = 0;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		fib(N);
		fibonacci(N);
		System.out.println(count1 + " " + count2 );
		
	}
	
	public static int fib(int n) {		
		if(n <= 2) return 1;
		count1++;
		return fib(n - 1) + fib(n - 2);
	}
	
	public static int fibonacci(int n) {
		int[] f = new int[n+1];
		f[1] = 1;
		f[2] = 1;
		for(int i = 3; i <= n; i++) {
			count2++;
			f[i] = f[i-1] + f[i-2];
		}
		return f[n];
	}
}
