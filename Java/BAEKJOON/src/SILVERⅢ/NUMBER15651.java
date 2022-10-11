package SILVER¥²;

import java.io.IOException;
import java.util.Scanner;

public class NUMBER15651 {
	
	static int N, M;
	static int[] array;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		array = new int[M];
		NM( 0);
		System.out.println(sb);
		
	}
	
	public static void NM(int depth) {
		if(depth == M) {
			for(int i = 0; i < M; i++) {
				sb.append(array[i] + " ");
			}
			sb.append("\n");
		}else {
			for(int i = 1; i <= N; i++) {
				array[depth] = i;
				NM(depth + 1);
			}
		}
		
	}

}
