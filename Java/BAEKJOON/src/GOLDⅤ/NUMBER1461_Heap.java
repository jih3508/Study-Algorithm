package GOLDⅤ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class NUMBER1461_Heap {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		PriorityQueue<Integer> left = new PriorityQueue<Integer>();
		PriorityQueue<Integer> right = new PriorityQueue<Integer>();
		int book, index;
		int max_move = 0;
		
		// 좌우에 위치에 따라서 heap에 저장
		for(int i = 0; i < N; i++) {
			book = Integer.parseInt(st.nextToken());
			if(book < 0) {
				left.add(book);
			}else {
				right.add(-book);
			}
			max_move = Math.max(max_move, Math.abs(book));
		}
		
		index = 0;
		int move = 0;
		while(!left.isEmpty()) {
			book = left.poll();
			if(index % M == 0) {
				move += -book * 2;
			}
			index++;
		}
		
		index = 0;
		while(!right.isEmpty()) {
			book = right.poll();
			if(index % M == 0) {
				move += -book * 2;
			}
			index++;
		}
		
		System.out.println(move - max_move);
	}

}
