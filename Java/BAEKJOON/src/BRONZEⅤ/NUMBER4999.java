package BRONZEⅤ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NUMBER4999 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String string1 = br.readLine();
		String string2 = br.readLine();
		
		System.out.println(string1.lastIndexOf('a') >= string2.lastIndexOf('a') ? "go" : "no" );
		
	}
}
