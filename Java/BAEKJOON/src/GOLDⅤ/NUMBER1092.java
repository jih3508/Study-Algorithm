package GOLDⅤ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class NUMBER1092 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		Integer[] cranes = new Integer[N];
		for(int i = 0; i < N; i++) {
			cranes[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(cranes, Collections.reverseOrder());
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		Integer[] boxs = new Integer[M]; // collection 함수 사용하기 위해서 객체형으로 선언
		for(int i = 0; i < M; i++) {
			boxs[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(boxs, Collections.reverseOrder());
		//
		if(boxs[0] > cranes[0]) {
			System.out.println(-1);
			System.exit(0);
		}
		int[] position = new int[N]; // 각 크레인이 현재 옮겨야 하는 박스의 번호(0부터 시작)
		boolean[] checked = new boolean[M]; // 박스 옮겨는지 체크
		int count = 0;
		int result = 0;
		while (true){
			if( count == M) break;
			// 이번 타임에 각 크레인 실을수 있는 박스 조사 
			for(int i = 0; i < N; i++) {
				while (position[i] < M) {
					if(!checked[position[i]] && cranes[i] >= boxs[position[i]]) {
						count++;
						checked[position[i]] = true;
						position[i]++;
						break;
					}
					position[i]++;
				}
			}
			result++;
		}
		System.out.println(result);
	}

}
