package SILVER¥³;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NUMBER11163 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int i = 2;
		while (N != 1) {
			if (N % i == 0) {
				System.out.println(i);
				N /= i;
			}else {
				i++;
			}
		}
	}

}
