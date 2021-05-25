package TestCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		BigInteger A = new BigInteger(br.readLine());
		BigInteger B = new BigInteger(br.readLine());
		
		
		System.out.println(A.add(B).divide(new BigInteger("2")));
		System.out.println(A.subtract(B).divide(new BigInteger("2")));

		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
				
		System.out.println((a+b)/2);
		System.out.println((a-b)/2);

	}
}
