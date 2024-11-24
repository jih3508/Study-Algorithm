package BRONZEⅤ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NUMBER27219 {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N /5; i++) {
			sb.append("V");
		}
		for(int i = 0; i < N % 5; i++) {
			sb.append("I");
		}
		System.out.println(sb);
	}

}
