package TestCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
    	
		int point[][] = new int[3][3];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(Math.pow((double)n, 2) * Math.PI);
		System.out.println(Math.pow((double)n, 2) * 2.0);
    }
}