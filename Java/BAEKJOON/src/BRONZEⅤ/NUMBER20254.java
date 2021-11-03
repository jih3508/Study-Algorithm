package BRONZE¥´;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NUMBER20254 {

	public static void main(String[] args) throws IOException{

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int Ur = Integer.parseInt(st.nextToken());
    	int Tr = Integer.parseInt(st.nextToken());
    	int Uo = Integer.parseInt(st.nextToken());
    	int To = Integer.parseInt(st.nextToken());
    	
    	System.out.println(56 * Ur + 24 * Tr + 14 * Uo + 6 * To);
    	
     }
}
