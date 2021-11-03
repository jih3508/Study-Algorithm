package BRONZE¥´;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NUMBER20492 {

	public static void main(String[] args) throws IOException{

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int N = Integer.parseInt(br.readLine());
    	int a = (int) ((double) N * 22.0 / 100.0);
    	int b = (int) (double) (((double)N * 2.0 /10.0) * 22.0 / 100.0);
    	  	
    	System.out.println((N - a) + " " + (N - b));
     }
}
