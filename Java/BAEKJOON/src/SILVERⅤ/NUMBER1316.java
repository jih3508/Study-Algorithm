package SILVERⅤ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;

public class NUMBER1316 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word, subword;
		int n = Integer.parseInt(br.readLine());
		int k;
		boolean flag;
		int count = 0;
		Set<Character> set;
		
		for(int i =0 ; i<n; i++) {
			word = br.readLine();
			k = 0;
			flag = true;
			for(int j=0; j < word.length()-1; j++) {
				if(word.charAt(j) != word.charAt(j+1) && word.substring(j+1).contains(word.substring(j, j+1))) {
					flag = false;
					break;
				}
			}
			if(flag) {
				count++;
			}
		}
		System.out.println(count);
	}

}
