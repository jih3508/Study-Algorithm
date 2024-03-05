package TestCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N;
		String[] mbtis;
		int T = Integer.parseInt(br.readLine());
		for (int t = 0; t < T; t++) {
			N = Integer.parseInt(br.readLine());
			mbtis = new String[N];
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				mbtis[i] = st.nextToken();
			}
			if(N > 32) {
				System.out.println(0);
			}else {
				int result = 12;
				for(int i = 0; i < N; i++) {
					for(int j = i + 1; j < N; j++) {
						for(int k = j + 1; k < N; k++) {
							result = Math.min(result, 
									distance(new String[]{mbtis[i], mbtis[j], mbtis[k]}));
						}
					}
				}
				System.out.println(result);
			}
			
		}
		
	}
	
	public static int distance(String[] mbti) {
		int dist = 0;
		for(int i = 0; i < 4; i++) {
			dist += mbti[0].charAt(i) != mbti[1].charAt(i)? 1:0;
			dist += mbti[0].charAt(i) != mbti[2].charAt(i)? 1:0;
			dist += mbti[1].charAt(i) != mbti[2].charAt(i)? 1:0;
		}
		
		return dist;
	} 
	
}