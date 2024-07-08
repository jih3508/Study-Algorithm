package BRONZEⅡ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NUMBER5585 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int change = 1000 - Integer.parseInt(br.readLine());
		int[] moneys = {500, 100, 50, 10, 5, 1};
		int count = 0;
		for(int money : moneys) {
			count += change / money;
			change %= money;
		}
		System.out.println(count);
	}

}
