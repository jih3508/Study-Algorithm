package BRONZE��;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NUMBER18301 {
	
	public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int n1 = Integer.parseInt(st.nextToken());
    	int n2 = Integer.parseInt(st.nextToken());
    	int n12 = Integer.parseInt(st.nextToken());
    	
    	System.out.println(Math.abs((n1 + 1) * (n2 +1)/(n12 + 1) -1));
     } 
}
