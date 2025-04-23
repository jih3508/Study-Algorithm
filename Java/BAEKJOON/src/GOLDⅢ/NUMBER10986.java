package GOLDⅢ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NUMBER10986 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] divided = new int[M];
		
		int prefix_sum = 0;
		st = new StringTokenizer(br.readLine());
		for(int i = 0; st.hasMoreElements(); i++) {
			prefix_sum =(prefix_sum + Integer.parseInt(st.nextToken())) % M;
			divided[prefix_sum]++;
		}
		
		// ���� Integer ���� ������ Ŭ�� �־ LongŸ������ �����Ѵ�.
		long count = divided[0];
		
		for(int i : divided) {
			count += (long)  i * (i - 1) / 2;
 		}
		System.out.println(count);
	}
}
