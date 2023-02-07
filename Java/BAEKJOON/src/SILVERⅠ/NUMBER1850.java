package SILVERⅠ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NUMBER1850 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < gcd(A, B); i++) {
			sb.append("1");
		}
		System.out.println(sb);
		
	}
	
	public static long gcd(long x, long y) {
		if(y == 0) {
			return x;
		}
		return gcd(y, x % y);
	}

}
