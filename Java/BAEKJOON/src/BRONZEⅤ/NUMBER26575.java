package BRONZE¥´;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NUMBER26575 {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		double f, dogs, pounds;
		while(N-- > 0) {
			st = new StringTokenizer(br.readLine());
			f = Double.parseDouble(st.nextToken());
			dogs = Double.parseDouble(st.nextToken());
			pounds = Double.parseDouble(st.nextToken());
			
			System.out.println("$" + String.format("%.2f", f * dogs * pounds));
		}
	}

}
