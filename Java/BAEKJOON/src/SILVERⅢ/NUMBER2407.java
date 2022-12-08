package SILVER¥²;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class NUMBER2407 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BigInteger N = new BigInteger(st.nextToken());
		BigInteger M = new BigInteger(st.nextToken());

		System.out.println(factorial(N).divide(factorial(N.subtract(M)).multiply(factorial(M))));
		
	}
	
	public static BigInteger factorial(BigInteger n) {
		if (n.intValue() == 1) return new BigInteger("1");
		return factorial(n.subtract(new BigInteger("1"))).multiply(n);
	}
}
