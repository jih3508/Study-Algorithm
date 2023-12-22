package BRONZE��;

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
		minlenth = Math.min(N, M); // N, M �ּ� ����
		int worldLenth = N + M;
		
		// A, B  ���ڿ� ���� (���ڿ� �� ���ڷ� ��ȯ �۾�)
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
		
		// A, B ���ڿ� ��ġ��
		AB = new int[worldLenth];
		for(int i = 0; i < minlenth; i++) {
			AB[2*i] = A[i]; //Ȧ�� ��ġ
			AB[2*i + 1] = B[i]; // ¦�� ��ġ �۾�
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
	 * ������ ���ĺ� ���� �ִ°�
	 */
	public static void restAlphabet(int[] arr, int start, int end) {
		//Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
		for(int i = start; i < end; i++) {
			AB[minlenth * 2 + i - start] = arr[i];
		}
		//System.out.println();
	}
}
