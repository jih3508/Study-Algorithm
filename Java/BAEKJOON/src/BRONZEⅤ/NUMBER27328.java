package BRONZEⅤ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NUMBER27328 {
	
public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		
		if(A < B) {
			System.out.println(-1);
		}else if(A == B) {
			System.out.println(0);
		}else {
			System.out.println(1);
		}
	}

}
