package TestCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int Y = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		System.out.println(M * 2 - Y);
	}
}
