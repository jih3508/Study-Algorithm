package BRONZEⅠ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NUMBER1110 {
	
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
