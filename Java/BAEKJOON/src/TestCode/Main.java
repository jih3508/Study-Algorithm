package TestCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.ArrayList;

import java.util.StringTokenizer;


public class Main {
	
	public static void main(String[] args) throws IOException {
    	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int i = 2;
		while (N != 1) {
			if (N % i == 0) {
				System.out.println(i);
				N /= i;
			}else {
				i++;
			}
		}
			
    }
}