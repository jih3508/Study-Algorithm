package BRONZEⅡ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NUMBER17389 {

public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String S = br.readLine();
		int result = 0;
		int i = 0;
		
		for(int index = 0; index < N; index++) {
			if(S.charAt(index) == 'O') {
				result += index + i++ + 1;
			}else {
				i = 0;
			}
		}
		
		System.out.println(result);
		
	}
}
