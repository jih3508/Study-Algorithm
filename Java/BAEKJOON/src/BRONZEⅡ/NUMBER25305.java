package BRONZE¥±;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class NUMBER25305 {

	public static void main(String[] args) throws IOException{

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int N = Integer.valueOf(st.nextToken());
    	int k = Integer.valueOf(st.nextToken());
    	
    	st = new StringTokenizer(br.readLine());
    	int[] x = new int[N];
    	for(int i = 0; i < N; i++) {
    		x[i] = Integer.valueOf(st.nextToken());
    	}
    	
    	Integer[] tmp = Arrays.stream(x).boxed().toArray(Integer[]::new);
    	Arrays.sort(tmp, Comparator.reverseOrder());
    	
    	System.out.println(tmp[k - 1]);
    	
     }
}
