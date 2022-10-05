package SILVER¥±;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NUMBER2004 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long n = Long.parseLong(st.nextToken());
		long m = Long.parseLong(st.nextToken());
		
		long cnt2 = count2(n) - count2(m) - count2(n-m);
		long cnt5 = count5(n) - count5(m) - count5(n-m);
		
		System.out.println(Math.min(cnt2, cnt5));
		
	}
	
	public static long count2(long num) {
		long result = 0;
		
		for(long i = 2; i <= num; i *= 2) {
			result += num/i;
		}
		
		return result;
	}
	
	public static long count5(long num) {
		long result = 0;
		
		for(long i = 5; i <= num; i *= 5) {
			result += num/i;
		}
		
		return result;
	}
}
