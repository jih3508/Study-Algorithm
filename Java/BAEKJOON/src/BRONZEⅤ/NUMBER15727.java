package BRONZEⅤ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NUMBER15727 {

	public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(br.readLine());
    	System.out.println(n / 5 + (n % 5 == 0 ? 0 : 1) );
     }  
}
