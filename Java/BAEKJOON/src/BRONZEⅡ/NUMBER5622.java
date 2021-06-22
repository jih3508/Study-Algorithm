package BRONZE¥±;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NUMBER5622 {
	public static void main(String[] args) throws IOException {
    	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		int count = 0;
		for(int i=0; i< word.length(); i++) {
			switch(word.charAt(i)) {
			case 'A': case 'B': case 'C':
				count += 3;
				break;
			case 'D': case 'E': case 'F':
				count += 4;
				break;
			case 'G': case 'H': case 'I':
				count += 5;
				break;
			case 'J': case 'K': case 'L':
				count += 6;
				break;
			case 'M': case 'N': case 'O':
				count += 7;
				break;
			case 'P': case 'Q': case 'R': case 'S':
				count += 8;
				break;
			case 'T': case 'U': case 'V':
				count += 9;
				break;
			case 'W': case 'X': case 'Y': case 'Z':
				count += 10;
				break;
			default:
			}
		}
		System.out.println(count);
    }

}
