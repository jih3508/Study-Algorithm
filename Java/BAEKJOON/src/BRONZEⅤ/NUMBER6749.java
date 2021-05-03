package BRONZE¥´;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NUMBER6749 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int Y = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		
		System.out.println(M * 2 - Y);
	}	
}
