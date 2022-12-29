package BRONZEⅤ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class NUMBER25372 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(br.readLine());
    	
    	for(int i = 0; i < n; i++) {
    		String text = br.readLine();
    		int len = text.length();
    		String answer = len >=6 && len <= 9? "yes" : "no";
    		System.out.println(answer);
    	}

	}

}
