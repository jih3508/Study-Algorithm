package BRONZE¥´;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NUMBER27433 {

	public static void main(String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		System.out.println(fatorial(N));

	}
	
	public static long fatorial(int x) {
		if(x == 0) return 1;
		return x * fatorial(x - 1);
	}
}
