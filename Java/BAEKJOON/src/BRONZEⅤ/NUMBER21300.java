package BRONZEⅤ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NUMBER21300 {
	
	public static void main(String[] args) throws IOException{

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int n = 0;
    	for(int i = 0; i< 6; i++) {
    		n += Integer.parseInt(st.nextToken()) * 5;
    	}
    	  	
    	System.out.println(n);
     } 
}
