package SILVERⅣ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NUMBER3036 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] numbers = new int[size];
		for(int i = 0; i < size; i++) {
			numbers[i] = Integer.parseInt(st.nextToken());
		}
		
		int basic_number = numbers[0];
		for(int i = 1; i < size; i++) {
			int gcd = GCD(basic_number, numbers[i]);
			System.out.println((basic_number / gcd) + "/" + (numbers[i] / gcd));
		}
		
	}
	
	// 최대 공약수 구하는 함수
	public static int GCD(int x, int y) {
		int r;
		while(x % y != 0) {
			r = x % y;
			x = y;
			y = r;
		}
		
		return y;
	}
}
