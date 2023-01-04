package SILVERⅢ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NUMBER15657 {

	static int[] array, result;
	static int N, M;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		array = new int[N];
		result = new int[M];
		for(int i = 0; i < N; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		// 내림차순으로 출력하기 위해서 배열 정렬
		Arrays.sort(array);
		
		NM(0, 0);
		System.out.println(sb);
	}
	
	public static void NM(int k, int x) {
		if (k == M) {
			for(int i = 0; i < M; i++) {
				sb.append(result[i]).append(" ");
			}
			sb.append("\n");
			return ;
		} 
		
		// 출력 a1 <= a2 <= a3 처리 하기 위해서 인덱스 a1 부터 시작하도록 한다. 
		for(int i = x; i < N; i++) {
			result[k] = array[i];
			NM(k + 1, i);
		}
	}

}
