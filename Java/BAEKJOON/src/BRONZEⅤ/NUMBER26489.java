package BRONZE¥´;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NUMBER26489 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int count = 0;
		while(true) {
			str = br.readLine();
			if(str == null) break;
			count++;
		}
		System.out.println(count);
	}
}
