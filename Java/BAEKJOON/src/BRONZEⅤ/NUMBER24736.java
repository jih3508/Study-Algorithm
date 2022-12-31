package BRONZEⅤ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NUMBER24736 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] jumsu = {6, 3, 2, 1, 2};
		int[] gradles = {0, 0};
		StringTokenizer st;
		for(int i = 0; i < 2; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 5; j++) {
				gradles[i] += Integer.parseInt(st.nextToken()) * jumsu[j];
			}
		}
		System.out.println(gradles[0] + " " + gradles[1]);
		
	}
}
