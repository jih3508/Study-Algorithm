package BRONZEⅢ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NUMBER2525 {
	public static void main(String[] args) throws IOException{

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int hour = Integer.valueOf(st.nextToken());
    	int minite = Integer.valueOf(st.nextToken());
    	int c = Integer.valueOf(br.readLine());
    	
    	hour = (hour + (minite + c) / 60) % 24;
    	minite = (minite + c) % 60;
    	System.out.println(hour + " " + minite);
    	    	
     }
}
