package BRONZEⅤ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NUMBER6810 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] array = {1, 3};
		int[] code = {9, 7, 8, 0, 9, 2, 1, 4, 1, 8, 0, 0, 0};
		for(int i = 0; i < 3; i++) {
			code[i + 10] = Integer.parseInt(br.readLine());
		}
		int sum = 0;
		for(int i = 0; i < code.length; i++) {
			sum += code[i] * array[i % 2];
		}
		System.out.println("The 1-3-sum is " + sum);
		
	}
}
