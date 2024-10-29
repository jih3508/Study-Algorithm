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
		// ó���� �� �ڿ� ���̶� ���ϱ����ؼ� ���� �κп� ù��° �ε��� ���� ��
		sequense[0] = array[0];
		int start, end, mid;
		int size = 0; // sequense�� ���� �迭 ������
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
