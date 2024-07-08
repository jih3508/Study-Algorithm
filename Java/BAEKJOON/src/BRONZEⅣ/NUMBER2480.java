package BRONZEⅣ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NUMBER2480 {
	
	public static void main(String[] args) throws IOException{

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int A = Integer.valueOf(st.nextToken());
    	int B = Integer.valueOf(st.nextToken());
    	int C = Integer.valueOf(st.nextToken());
    	
   
    	int[] dice = new int[7];
    	dice[A] += 1;
    	dice[B] += 1;
    	dice[C] += 1;
    	int hap;
    	int result = 0;
    	
    	for(int i = 1; i < 7; i++) {
    		if(dice[i] == 3) {
    			result = 10000 + i * 1000;
    			break;
    		}else if(dice[i] == 2) {
    			hap = 1000 + i * 100;
    		}else if(dice[i] == 1) {
    			hap = i * 100;
    		}else {
    			continue;
    		}
    		
    		result = hap > result? hap : result;
    	}
    	
    	System.out.println(result);
    	 	    	
     } 

}
