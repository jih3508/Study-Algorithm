package TestCode;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
     static StringBuilder sb = new StringBuilder();
     static int count = 0;
     
     public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	HashMap<Integer, Integer> map = new HashMap<>();
    	int n = Integer.parseInt(br.readLine());
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int[] array= new int[n];
    	int i, num;
    	for(i = 0; i < n; i++) {
    		num = Integer.parseInt(st.nextToken());
    		array[i] = num;
    	}
    	int[] sort = array.clone();
    	Arrays.sort(sort);
    	
    	int count = 0;
    	for(i = 0; i<n; i++) {
    		if(!map.containsKey(sort[i])) {
    			map.put(sort[i], count);
    			count++;
    		}
    	}
    	StringBuilder sb = new StringBuilder();
    	for(i = 0; i < n; i++) {
    		num = map.get(array[i]);
    		sb.append(num).append(" ");
    	}
    	System.out.println(sb.toString());
    	
     }  
}