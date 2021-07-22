package BRONZE¥²;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class NUMBER3009 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BigInteger A = new BigInteger(st.nextToken());
		A = A.add(new BigInteger(st.nextToken()));
		System.out.println(A.add(new BigInteger(st.nextToken())));
	}
}
