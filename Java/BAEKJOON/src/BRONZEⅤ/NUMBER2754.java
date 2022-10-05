package BRONZE¥´;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NUMBER2754 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String gradle = br.readLine();
		float result = 0;
		switch (gradle) {
		case "A+":
			result = (float) 4.3;
			break;
		case "A0":
			result = (float) 4.0;
			break;
		case "A-":
			result = (float) 3.7;
			break;
		case "B+":
			result = (float) 3.3;
			break;
		case "B0":
			result = (float) 3.0;
			break;
		case "B-":
			result = (float) 2.7;
			break;
		case "C+":
			result = (float) 2.3;
			break;
		case "C0":
			result = (float) 2.0;
			break;
		case "C-":
			result = (float) 1.7;
			break;
		case "D+":
			result = (float) 1.3;
			break;
		case "D0":
			result = (float) 1.0;
			break;
		case "D-":
			result = (float) 0.7;
			break;
		case "F":
			result = (float) 0.0;
			break;
		default:
			break;
		}
	
	System.out.println(result);	
	}
}
