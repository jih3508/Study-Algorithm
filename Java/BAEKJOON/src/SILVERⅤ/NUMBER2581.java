package SILVER¥´;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class NUMBER2581 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> prime_number = new ArrayList<Integer>();
		ArrayList<Integer> array = new ArrayList<Integer>();
		boolean flag;
		
		if (M < 2) M = 2;
		for (int i=2; i<M; i++) {
			flag = true;
			for(Integer num: prime_number) {
				if (i % num == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				prime_number.add(i);
			}
		}
		
		for (int i=M; i<=N; i++) {
			flag = true;
			for(Integer num: prime_number) {
				if (i % num == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				prime_number.add(i);
				array.add(i);
			}
		}
		if( array.size() <1) {
			System.out.println(-1);
		}else {
			System.out.println(array.stream().reduce(0,(num1, num2)->num1+num2));
			System.out.println(array.get(0));
		}
	}

}
