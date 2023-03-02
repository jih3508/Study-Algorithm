package BRONZE¥³;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NUMBER1264 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[]  Vowel = {'a', 'e', 'i', 'o', 'u'};
		while(true) {
			int count = 0;
			String sentence = br.readLine().toLowerCase();
			if(sentence.equals("#")) {
				break;
			}
			for(int i = 0; i < sentence.length(); i++) {
				 for(int j = 0; j < Vowel.length; j++) {
					 count += Vowel[j] == sentence.charAt(i)? 1: 0;
				 }
			}
			System.out.println(count);
		}
	}
}
