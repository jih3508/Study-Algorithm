package SILVER¥²;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NUMBER14425 {

	public static void main(String[] args) throws IOException{

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int N = Integer.valueOf(st.nextToken());
    	int M = Integer.valueOf(st.nextToken());
    	
    	String[] S = new String[N];
    	for(int i = 0; i < N; i++) {
    		S[i] = br.readLine();
    	}
    	
    	int count = 0;
    	for(int i = 0; i < M; i++) {
    		String s = br.readLine();
    		for(int j = 0; j < N; j++) {
        		if(S[j].equals(s)) {
        			count += 1;
        			break;
        		}
        	}
    	}
    	
    	System.out.println(count);
     }
}
