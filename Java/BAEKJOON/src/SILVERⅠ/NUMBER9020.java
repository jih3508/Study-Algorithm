package SILVER¥°;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NUMBER9020 {

	public static void main(String[] args) throws IOException {
    	
		int a, b;
		boolean[] array = new boolean[10000 + 1];
		Arrays.fill(array, true);
		array[1] = false;
		for (int i = 2; i < 10000 + 1; i++) {
			for (int j = i * 2; j <10000 + 1; j+=i) {
				array[j] = false;
			}
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int num1, num2;
		
		for(int i = 0; i< T; i++) {
			num1 = 0; num2= 0;
			b = Integer.parseInt(br.readLine());
			for(a = 2; a < b/2 + 1; a++) {
				if(array[a] && array[b-a]) {
					num1 = a;
					num2 = b-a;
				}
			}
			System.out.println(num1 + " " + num2);
		}
		
    }
}
