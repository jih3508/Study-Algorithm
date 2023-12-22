package BRONZEⅠ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NUMBER17269 {

	static int[] alp = {3, 2, 1, 2, 4, 3, 1, 3, 1, 1, 3, 1, 3, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};
	static int[] AB;
	static int minlenth;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		minlenth = Math.min(N, M); // N, M 최소 길이
		int worldLenth = N + M;
		
		// A, B  문자열 세팅 (문자열 → 숫자로 변환 작업)
		st = new StringTokenizer(br.readLine());
		int[] A = new int[N];
		int[] B = new int[M];
		String str = st.nextToken();
		for(int i = 0; i < N; i++) {
			A[i] = alp[str.charAt(i) - 'A'];
		}
		str = st.nextToken();
		for(int i = 0; i < M; i++) {
			B[i] = alp[str.charAt(i) - 'A'];
		}
		
		// A, B 문자열 합치기
		AB = new int[worldLenth];
		for(int i = 0; i < minlenth; i++) {
			AB[2*i] = A[i]; //홀수 위치
			AB[2*i + 1] = B[i]; // 짝수 위치 작업
		}
		
		restAlphabet(N > M ? A : B , minlenth, N > M ? N : M);
		//Arrays.stream(AB).forEach(x -> System.out.print(x + " "));
		for(int i = 0; i < worldLenth - 2; i++) {
			for(int j = 0; j < worldLenth - i - 1; j++) {
				AB[j] = (AB[j] + AB[j + 1]) % 10;
			}
		}
		//System.out.println();
		System.out.println((AB[0] == 0 ? AB[1] : AB[0] * 10 + AB[1]) + "%");
		
	}
	
	/**
	 * 나머지 알파벳 집어 넣는것
	 */
	public static void restAlphabet(int[] arr, int start, int end) {
		//Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
		for(int i = start; i < end; i++) {
			AB[minlenth * 2 + i - start] = arr[i];
		}
		//System.out.println();
	}
}
