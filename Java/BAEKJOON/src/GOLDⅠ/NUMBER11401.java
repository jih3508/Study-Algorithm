package GOLDⅠ;

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

		/*
		 * 분자: N
		 * 분모: (K! * (N-K)!) mod p
		 * N! * 분모의 역원((K! * (N-K)!)
		 */
		System.out.println(factorial(N)  * FIT(factorial(N - K) * factorial(K) % P, P - 2)  % P );
	}

	// 팩토리얼 함수
	public static long factorial(long n) {
		
		long result = 1L;
		
		while(n > 1) {
			result = (result * n) % P;
			n--;
		}
		return result;
	}

	/*
	 * 역원 구하는 함수
	 * base : 밑,   expo = 지수 (exponent)
	 * 거듭 제곱을 분할 정복 방식으로 푼다.
	 */
	public static long FIT(long base, long expo) {
		
		
		if(expo == 1) return base % P;
		
		long result = FIT(base, expo / 2);
		
		result = result * result % P;
		
		if(expo % 2 == 1) return result * base % P;
		else return result;
	}
}
