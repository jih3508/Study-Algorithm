package GOLDⅡ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class NUMBER1655 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> lheap = new PriorityQueue<Integer>(); // 작은 값 저장할 힙
		PriorityQueue<Integer> rheap = new PriorityQueue<Integer>(); // 큰 값 저장할 힙
		int num;
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < N; i++) {
			num = Integer.parseInt(br.readLine());
			lheap.add(-1 * num);
			// 길이가 안맞을때 왼쪽 힙 큰 값을 오르쪽 힙에 추가한다.
			if (lheap.size() - 1 > rheap.size()) {
				rheap.add(-1 * lheap.poll());
			}
			// 왼쪽 힙과 오른쪽 힙이 안맞을때 맞추는 작업
			if (!rheap.isEmpty() && (-1 * lheap.peek() > rheap.peek())) {
				rheap.add(-1 * lheap.poll());
				lheap.add(-1 * rheap.poll());
			}
			
			sb.append(-1 * lheap.peek()).append("\n");
		}
		System.out.println(sb);
	}

}
