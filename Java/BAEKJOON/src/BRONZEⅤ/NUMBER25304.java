package BRONZEⅤ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class NUMBER25304 {

	public static void main(String[] args) throws IOException{

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BigInteger X = new BigInteger(br.readLine());
    	int N =  Integer.valueOf(br.readLine());
    	for(int i = 0; i < N; i++) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		BigInteger a = new BigInteger(st.nextToken());
    		a = a.multiply(new BigInteger(st.nextToken()));
    		X = X.subtract(a);
    	}
    	System.out.println("0".equals(X.toString())? "Yes" : "No");
     }
}
