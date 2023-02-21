package BRONZE¥´;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class NUMBER27434 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		BigInteger result = new BigInteger("1");
		for(int i = 1; i <= n / 2; i++) {
			result = result.multiply(BigInteger.valueOf(i*(n - i + 1)));
		}
		if(n % 2 != 0) result = result.multiply(BigInteger.valueOf(n/2 + 1)); 
		System.out.println(result);
	}
}
