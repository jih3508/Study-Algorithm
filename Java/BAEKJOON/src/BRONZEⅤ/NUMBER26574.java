package BRONZEⅤ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NUMBER26574 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int x;
		for(int i = 0; i < n; i++) {
			x = Integer.parseInt(br.readLine());
			System.out.println(x + "" + x);
			
		}
	}
}
