package SILVER¥³;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class NUMBER1021 {

public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		LinkedList<Integer> queue = new LinkedList<Integer>();
		for(int i = 0; i < N; i++) {
			queue.offer(i + 1);
		}
		st = new StringTokenizer(br.readLine());
		int count = 0;
		int num;
		boolean flag;
		while(M-- > 0) {
			num = Integer.parseInt(st.nextToken());
			flag = queue.indexOf(num) > queue.size() / 2;
			while(queue.getFirst() != num) {
				if(flag) {
					queue.offerFirst(queue.pollLast());					
				}else {
					queue.offerLast(queue.pollFirst());
				}
				count++;
			}
			queue.pollFirst();
		}
		System.out.println(count);
	}
}
