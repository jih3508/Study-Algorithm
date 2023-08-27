package BRONZE¥±;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NUMBER15969 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] grade = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; st.hasMoreTokens(); i++) {
			grade[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(
				Arrays.stream(grade).max().getAsInt() -
				Arrays.stream(grade).min().getAsInt());
	}

}
