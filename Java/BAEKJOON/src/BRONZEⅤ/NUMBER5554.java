package BRONZEⅤ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NUMBER5554 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		for(int i = 0; i< 4; i++) {
			sum += Integer.parseInt(br.readLine());
		}
		System.out.println(sum / 60);
		System.out.println(sum % 60);
	}
}
