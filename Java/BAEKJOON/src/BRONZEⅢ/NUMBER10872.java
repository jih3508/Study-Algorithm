package BRONZEⅢ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NUMBER10872 {
	
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
