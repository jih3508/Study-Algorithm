package BRONZEⅢ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NUMBER2566 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] array = new int[9][9];
		StringTokenizer st;
		for(int i = 0; i < 9; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 9; j++) {
				array[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int x = 0, y = 0;
		int max_value = 0;
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				if(max_value < array[i][j]) {
					max_value = array[i][j];
					x = i;
					y = j;
				}
			}
		}
		
		System.out.println(max_value);
		System.out.println((x + 1) + " " + (y + 1));
		
	}
}
