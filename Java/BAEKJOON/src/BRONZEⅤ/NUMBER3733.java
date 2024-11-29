package BRONZEⅤ;

import java.io.IOException;
import java.util.Scanner;

public class NUMBER3733 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N, S;
		while(sc.hasNext()) {
			N = sc.nextInt();
			S = sc.nextInt();
			System.out.println(S / (N + 1));
		}
		
	}
}
