package BRONZEⅤ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NUMBER26209 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 8; i++) {
			sum += Integer.parseInt(st.nextToken());
		}
		System.out.println(sum < 9 ? 'S' : 'F');
	}
}
