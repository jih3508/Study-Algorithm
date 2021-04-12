package TestCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
<<<<<<< HEAD
		int a = Integer.parseInt(br.readLine()); 
		int b = Integer.parseInt(br.readLine());
		System.out.println(a+b);
=======
		String sr = br.readLine();
		int n = 0;
		for (int i = sr.length() -1 ; i>=0; i--) {
			int data;
			
			switch (sr.charAt(i)) {
			case 'A':
				data = 10;
				break;
			case 'B':
				data = 11;
				break;
			case 'C':
				data = 12;
				break;
			case 'D':
				data = 13;
				break;
			case 'E':
				data = 14;
				break;
			case 'F':
				data = 15;
				break;
			default:
				data = sr.charAt(i) - '0';
			}
			
			n += Math.pow(16, sr.length()-i-1) * data;
		}
		System.out.println(n);
		
>>>>>>> 715bb386ca3e50bdb1d86ae01fa78a8e61fa779c
	}
}
