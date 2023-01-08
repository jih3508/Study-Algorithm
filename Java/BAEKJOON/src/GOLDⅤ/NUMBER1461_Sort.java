package GOLDⅤ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class NUMBER1461_Sort {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		List<Integer> right = new ArrayList<>();
		List<Integer> left = new ArrayList<>();
		int book;
		int max = 0; // 최대거리
		for(int i = 0; i < N; i++) {
			book = Integer.parseInt(st.nextToken());
			// 음수는 양수로 변환
			if(book < 0) {
				left.add(-book);
			}else {
				right.add(book);
			}
			max = Math.max(max, Math.abs(book));
		}
				
		Collections.sort(left, Collections.reverseOrder());
		Collections.sort(right, Collections.reverseOrder());
		
		// 각 거리 합 구하기
		int sum = 0;
		for(int i = 0; i < left.size(); i+=M) {
			sum += left.get(i) * 2;
		}
		
		for(int i = 0; i < right.size(); i+=M) {
			sum += right.get(i) * 2;
		}
		System.out.println(sum - max);
	}

}
