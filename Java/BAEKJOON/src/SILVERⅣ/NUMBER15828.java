package SILVERⅣ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NUMBER15828 {

public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] queue = new int[N];
		int front = 0;
		int back = -1;
		int value;
		while((value = Integer.parseInt(br.readLine())) != -1) {
			if (value == 0) {
				queue[front % N] = 0;
				front++;
			}else {
				if(front + N - 1 > back) {
					back++;
					queue[back % N] = value;
				}
			}
		}
		
		if(front > back) {
			System.out.println("empty");
		}else {
			StringBuilder sb = new StringBuilder();
			for(int i = front; i <= back; i++) {
				sb.append(queue[i % N]).append(" ");
			}
			System.out.println(sb);
		}
		
	}
}
