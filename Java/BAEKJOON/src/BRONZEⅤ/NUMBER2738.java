package BRONZE��;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NUMBER2738 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st  = new StringTokenizer(br.readLine());
	    int N = Integer.parseInt(st.nextToken());
	    int M = Integer.parseInt(st.nextToken());
	    
	    int[][] A = new int[N][M];
	    int[][] B = new int[N][M];
	    
	    for(int i =0 ; i < N; i++) {
	    	st = new StringTokenizer(br.readLine());
	    	for(int j = 0; j < M; j++) {
	    		A[i][j] = Integer.parseInt(st.nextToken());
	    	}
	    }
	    
	    for(int i =0 ; i < N; i++) {
	    	st = new StringTokenizer(br.readLine());
	    	for(int j = 0; j < M; j++) {
	    		B[i][j] = Integer.parseInt(st.nextToken());
	    	}
	    }
	    
	    StringBuilder sb = new StringBuilder();
	    for(int i =0 ; i < N; i++) {
	    	for(int j = 0; j < M; j++) {
	    		sb.append((A[i][j] + B[i][j]) + " ");
	    	}
	    	sb.append("\n");
	    }
	    
	    System.out.println(sb.toString());
	}

}
