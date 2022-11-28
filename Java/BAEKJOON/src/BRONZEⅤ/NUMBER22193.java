package BRONZE¥´;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class NUMBER22193 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		BigInteger N = new BigInteger(br.readLine());
		
		System.out.println(N.multiply(new BigInteger(br.readLine())));
	}

}
