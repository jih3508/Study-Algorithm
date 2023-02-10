package SILVERⅠ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NUMBER1946 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int[][] gradles;
		int N, top, count;
		while(T-- > 0) {
			N = Integer.parseInt(br.readLine());
			gradles = new int[N][2];
			for(int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				gradles[i][0] = Integer.parseInt(st.nextToken());
				gradles[i][1] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(gradles, (o1, o2) -> o1[0] == o2[0]? o1[1] - o2[1] : o1[0] - o2[0]);
			top = gradles[0][1];
			count = 1;
			for(int i = 1; i < N; i++) {
				if(gradles[i][1] < top) {
					count++;
					top = gradles[i][1];
				}
			}
			System.out.println(count);
		}
	}

}
