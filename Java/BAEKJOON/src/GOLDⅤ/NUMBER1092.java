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
		Integer[] boxs = new Integer[M]; // collection �Լ� ����ϱ� ���ؼ� ��ü������ ����
		for(int i = 0; i < M; i++) {
			boxs[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(boxs, Collections.reverseOrder());
		//
		if(boxs[0] > cranes[0]) {
			System.out.println(-1);
			System.exit(0);
		}
		int[] position = new int[N]; // �� ũ������ ���� �Űܾ� �ϴ� �ڽ��� ��ȣ(0���� ����)
		boolean[] checked = new boolean[M]; // �ڽ� �Űܴ��� üũ
		int count = 0;
		int result = 0;
		while (true){
			if( count == M) break;
			// �̹� Ÿ�ӿ� �� ũ���� ������ �ִ� �ڽ� ���� 
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
