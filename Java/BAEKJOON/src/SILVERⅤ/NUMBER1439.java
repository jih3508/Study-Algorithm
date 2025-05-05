package SILVERⅤ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NUMBER1439 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		String S = br.readLine();
		int[] count = {0, 0};
		count[Integer.parseInt(S.substring(0, 1))]++;
		for(int i = 1; i < S.length(); i++) {
			if(S.charAt(i - 1) != S.charAt(i)) {
				count[Integer.parseInt(S.substring(i, i+1))]++;
			}
		}
		System.out.println(Arrays.stream(count).min().getAsInt());
		
	}
}
