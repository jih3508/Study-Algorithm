package TestCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
    	
		int point[][] = new int[3][3];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int number = 1;
		for(int i = 1; i <= n; i++) {
			number *= i;
		}
		System.out.println(number);
    }
	
}