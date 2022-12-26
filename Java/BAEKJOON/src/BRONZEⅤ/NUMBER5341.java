package BRONZEⅤ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NUMBER5341 {
	
	public static void main(String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;
		while(true) {
			n = Integer.parseInt(br.readLine());
			if(n == 0) break;
			else System.out.println(n * (n + 1) / 2);
		}
	}
}
