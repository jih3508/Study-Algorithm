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
		// ������������ ����ϱ� ���ؼ� �迭 ����
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
		
		// ��� a1 <= a2 <= a3 ó�� �ϱ� ���ؼ� �ε��� a1 ���� �����ϵ��� �Ѵ�. 
		for(int i = x; i < N; i++) {
			result[k] = array[i];
			NM(k + 1, i);
		}
	}

}
