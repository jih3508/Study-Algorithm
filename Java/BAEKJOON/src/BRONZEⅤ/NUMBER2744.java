package BRONZE¥´;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NUMBER2744 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String string = br.readLine();
		StringBuilder result = new StringBuilder();
		for(int i = 0; i < string.length(); i++) {
			char tmp = string.charAt(i);
			if(tmp >= 97 && tmp < 122) {
				result.append((char)(tmp - 32));
			}else {
				result.append((char)(tmp + 32));
			}
		}
		System.out.println(result.toString());
	}
}
