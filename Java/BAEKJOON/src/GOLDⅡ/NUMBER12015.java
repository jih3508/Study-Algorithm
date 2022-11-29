package GOLDⅡ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NUMBER12015 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] array = new int[N];
		int[] sequense = new int[N];
		
		for(int i = 0; i < N; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		// 처음에 맨 뒤에 값이랑 비교하기위해서 수열 부분에 첫번째 인덱스 값이 옴
		sequense[0] = array[0];
		int start, end, mid;
		int size = 0; // sequense의 현재 배열 사이즈
		for(int i = 1; i < N; i++) {
			if (sequense[size] < array[i]) {
				size++;
				sequense[size] = array[i];
			}else {
				start = 0;
				end = size;
				while(start <= end) {
					mid = (start + end) / 2;
					if (sequense[mid] >= array[i]) {
						end = mid - 1;
					}else {
						start = mid + 1;
					}
				}				
				sequense[start] = array[i];
			}
		}
		
		System.out.println(size + 1);	
	}

}
