package TestCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
    	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int a = 0;
		int b = 1;
		int c = a + b;
		for(int i = 2; i<=n; i++) {
			a = b;
			b = c;
			c = a + b;
		}
		System.out.println(n == 0 ? a : b);
    }
	
}