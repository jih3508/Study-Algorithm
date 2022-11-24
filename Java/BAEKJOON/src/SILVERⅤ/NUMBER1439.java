package SILVER¥´;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NUMBER1439 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		String result = S.substring(0, 1);
		for(int i = 1; i < S.length(); i++) {
			if(S.charAt(i) != result.charAt(result.length() - 1)) {
				result += S.substring(i, i + 1);
			}
		}
		
		int[] count = new int[2];
		for(int i = 0; i < result.length(); i++) {
			count[Integer.parseInt(result.substring(i, i + 1))]++;
		}
		System.out.println(Arrays.stream(count).min().getAsInt());
		
	}
}
