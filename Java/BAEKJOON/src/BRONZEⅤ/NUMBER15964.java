package BRONZEⅤ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class NUMBER15964 {
	
	public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	BigInteger A = new BigInteger(st.nextToken());
    	BigInteger B = new BigInteger(st.nextToken());
    	BigInteger add = A.add(B);
    	BigInteger sub = A.subtract(B);
    	System.out.println(add.multiply(sub));
     }  

}
