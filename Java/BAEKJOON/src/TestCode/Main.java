package TestCode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int temp = n;
		int count = 1;
		n = (n % 10) * 10 + (n / 10 + n % 10) % 10;
		while(temp != n) {
			count++;
			n = (n % 10) * 10 + (n / 10 + n % 10) % 10; 
		}
		System.out.println(count);
	}
}