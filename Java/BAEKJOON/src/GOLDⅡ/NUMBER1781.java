package GOLD¥±;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class NUMBER1781 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] array = new int[N][2];
		StringTokenizer st;
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			array[i][0] = Integer.parseInt(st.nextToken());
			array[i][1] = Integer.parseInt(st.nextToken());	
		}
		Arrays.sort(array, (x, y) -> {
			if(x[0] == y[0]) {
				return Integer.compare(x[1], y[1]);
			}else {
				return Integer.compare(x[0], y[0]);
			}
		});
		PriorityQueue<Integer> heap = new PriorityQueue<>();
		for(int i = 0; i < N; i++) {
			heap.add(array[i][1]);
			if(array[i][0] < heap.size()) {
				heap.poll();
			}
		}
		System.out.println(heap.stream().reduce(0, (a, b) -> a + b));

	}

}
