package BRONZEⅠ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NUMBER1934 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int A, B;
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			System.out.println(A * B / Euclid(A, B));
						
		}
		
	}
	
	public static int Euclid(int x, int y) {
		if (x % y == 0) {
			return y;
		}else {
			return Euclid(y, x % y);
		}
		
	}
}
