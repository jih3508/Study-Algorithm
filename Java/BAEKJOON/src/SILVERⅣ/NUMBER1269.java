package SILVERⅣ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class NUMBER1269 {

	public static void main(String[] args) throws IOException{

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int N = Integer.valueOf(st.nextToken());
    	int M = Integer.valueOf(st.nextToken());
    	
    	Set<Integer> A = new HashSet<>();
    	Set<Integer> B = new HashSet<>();
    	
    	st = new StringTokenizer(br.readLine());
    	for(int i = 0; i < N; i++) {
    		A.add(Integer.valueOf(st.nextToken()));
    	}
    	
    	st = new StringTokenizer(br.readLine());
    	for(int i = 0; i < M; i++) {
    		B.add(Integer.valueOf(st.nextToken()));
    	}
    	
    	int count = N + M;
    	
    	for (Integer num : A) {
	
    		if(B.contains(num)) {
    			count -= 2;
			}
		}
    	
    	System.out.println(count);
     
     }
}
