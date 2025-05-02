package TestCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			int C = Integer.parseInt(br.readLine());

			int quarter = C / 25;
			C %= 25;

			int dime = C / 10;
			C %= 10;

			int nickel = C / 5;
			C %=  5;

			int penny = C;

			System.out.println(String.format("%d %d %d %d", quarter, dime, nickel, penny));
		}

	}
}