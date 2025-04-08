package BRONZEⅤ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class NUMBER7891 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		BigInteger a;
		StringTokenizer st;
		while(N-- > 0) {
			st = new StringTokenizer(br.readLine());
			a = new BigInteger(st.nextToken());
			System.out.println(a.add(new BigInteger(st.nextToken())));
		}

	}

}
