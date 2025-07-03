package SILVERⅢ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class NUMBER2477 {

	public static void main(String[] args) throws IOException{

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int K = Integer.parseInt(br.readLine());
    	int[] max_width = {0, 0};
    	int[] max_height = {0, 0};
    	int[] total = new int[6];
    	
    	StringTokenizer st;
    	
    	for(int i = 0; i < 6; i++) {
    		st = new StringTokenizer(br.readLine());
    		int dir = Integer.parseInt(st.nextToken());
    		int length = Integer.parseInt(st.nextToken());
    		if(dir == 1 || dir == 2) {
    			if(length > max_width[1]) {
    				max_width[0] = i;
    				max_width[1] = length;
    			}
    			
    		}
    		
    		if(dir == 3 || dir == 4) {
    			if(length > max_height[1]) {
    				max_height[0] = i;
    				max_height[1] = length;
    			}
    		}
    		total[i] = length;
    	}
    	
    	Set<Integer> check = new HashSet<>();
    	check.add((max_width[0] + 5) % 6);
    	check.add((max_width[0] + 1) % 6);
    	check.add((max_height[0] + 5) % 6);
    	check.add((max_height[0] + 1) % 6);
    	
    	int S = 1;
    	
    	for(int i = 0; i < 6; i++) {
    		if(!check.contains(i)) {
    			S *= total[i];
    		}
    	}
    	
    	System.out.println(((max_height[1] * max_width[1]) - S) * K);
     }
}
