package BRONZEⅤ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NUMBER3003 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A;
		int[] peaces = {1, 1, 2, 2, 2, 8};
		for (int i = 0; i<peaces.length; i++) {
			A = Integer.parseInt(st.nextToken());
			System.out.print(peaces[i] - A + " ");
		}
	}
}
