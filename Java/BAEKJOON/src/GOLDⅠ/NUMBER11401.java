package GOLD¥°;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NUMBER11401 {

static long P = 1000000007;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		StringTokenizer st = new StringTokenizer(br.readLine());
		long N = Integer.parseInt(st.nextToken());
		long K = Integer.parseInt(st.nextToken());
		
		System.out.println(factorial(N)  * FIT(factorial(N - K) * factorial(K) % P, P - 2)  % P );
	}
	
	public static long factorial(long n) {
		
		long result = 1L;
		
		while(n > 1) {
			result = (result * n) % P;
			n--;
		}
		return result;
	}
	
	// base: ¹Ø, expo: Áö¼ö
	public static long FIT(long base, long expo) {
		
		
		if(expo == 1) return base % P;
		
		long result = FIT(base, expo / 2);
		
		result = result * result % P;
		
		if(expo % 2 == 1) return result * base % P;
		else return result;
	}
}
