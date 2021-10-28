package BRONZE¥´;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NUMBER17496 {

	public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     	StringTokenizer st = new StringTokenizer(br.readLine());
     	
     	int N = Integer.parseInt(st.nextToken());
     	int T = Integer.parseInt(st.nextToken());
     	int C = Integer.parseInt(st.nextToken());
     	int P = Integer.parseInt(st.nextToken());
     	
     	System.out.println(((N - 1) / T) * C * P);
     }
}
