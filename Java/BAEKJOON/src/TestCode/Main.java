package TestCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
    	
		int point[][] = new int[3][3];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int a, b;	
		for(int i = 0; i<3; i++) {
			st = new StringTokenizer(br.readLine());
			point[i][0] = Integer.parseInt(st.nextToken());
			point[i][1] = Integer.parseInt(st.nextToken());
		}
		System.out.println((point[0][0] ^ point[1][0] ^ point[2][0]) + " " + (point[0][1] ^ point[1][1] ^ point[2][1]));
    }
}