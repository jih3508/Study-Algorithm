package GOLDⅡ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class NUMBER1655 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> lheap = new PriorityQueue<Integer>(); // ���� �� ������ ��
		PriorityQueue<Integer> rheap = new PriorityQueue<Integer>(); // ū �� ������ ��
		int num;
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < N; i++) {
			num = Integer.parseInt(br.readLine());
			lheap.add(-1 * num);
			// ���̰� �ȸ����� ���� �� ū ���� ������ ���� �߰��Ѵ�.
			if (lheap.size() - 1 > rheap.size()) {
				rheap.add(-1 * lheap.poll());
			}
			// ���� ���� ������ ���� �ȸ����� ���ߴ� �۾�
			if (!rheap.isEmpty() && (-1 * lheap.peek() > rheap.peek())) {
				rheap.add(-1 * lheap.poll());
				lheap.add(-1 * rheap.poll());
			}
			
			sb.append(-1 * lheap.peek()).append("\n");
		}
		System.out.println(sb);
	}

}
