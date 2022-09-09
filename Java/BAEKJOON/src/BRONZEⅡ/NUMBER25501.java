package BRONZE¥±;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NUMBER25501 {
	
	static int count;
	static String sentence;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
	    
		for(int i = 0; i < n; i++) {
			sentence = br.readLine();
			count = 0;
			System.out.println(isPalindrome(0, sentence.length() - 1) + " " + count);
		}
	}
	
	public static int isPalindrome(int r, int l) {
		count++;
		if (r >= l) {
			return 1;
		}else if(sentence.charAt(r) != sentence.charAt(l)) {
			return 0;
		}else {
			return isPalindrome(r + 1, l - 1);
		}
		
	}
}
