package BRONZEⅤ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NUMBER9086 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String string;
		while(N-- > 0) {
			string = br.readLine();
			// char + char �� int �߰��� ���ڿ��� ���ؾ� �Ѵ�.
			System.out.println(string.charAt(0) + "" + string.charAt(string.length() - 1));
		}
		
	}
}
