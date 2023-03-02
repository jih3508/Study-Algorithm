package SILVERⅠ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NUMBER2529 {

	static String max_value = String.valueOf(Long.MIN_VALUE);
	static String min_value =String.valueOf(Long.MAX_VALUE);
	static int N;
	static boolean[] visited = new boolean[10];
	static String[] inequality;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		inequality = new String[N];
		for (int i = 0; i < N; i++) {
			inequality[i] = st.nextToken();
		}
		for(int i = 0; i <= 9; i++) {
			visited[i] = true;
			make_inequality(0, String.valueOf(i));
			visited[i] = false;
		}
		System.out.println(max_value);
		System.out.println(min_value);
	}
	
	public static void make_inequality(int depth, String number) {
		if (N == depth) {
			
			if(Long.parseLong(number) > Long.parseLong(max_value)) {
				max_value = number;
			}
			if(Long.parseLong(number) < Long.parseLong(min_value)) {
				min_value = number;
			}
			return;
		}
		for(int i = 0; i <=9; i++) {
			if(visited[i] == false && ((inequality[depth].equals("<") && i > Integer.parseInt(String.valueOf(number.charAt(depth))))
					|| (inequality[depth].equals(">") && i < Integer.parseInt(String.valueOf(number.charAt(depth)))))) {
				visited[i] = true;
				make_inequality(depth + 1, number + i);
				visited[i] = false;
			}
			
		}
	}

}
