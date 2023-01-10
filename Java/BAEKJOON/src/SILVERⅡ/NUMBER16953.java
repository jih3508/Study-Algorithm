package SILVERⅡ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class NUMBER16953 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		Queue<long[]> queue = new LinkedList<long[]>();
		long[] data = {A, 1};
		queue.add(data);
		long num, move;
		long result = -1;
		
		while(! queue.isEmpty()) {
			data = queue.poll();
			num = data[0];
			move = data[1];
			// B까지 연산 했을경우
			if(num == B) {
				result =  move;
				break;
			}
			
			if(num * 2 <= B) {
				data = new long[2];
				data[0] = num * 2;
				data[1] = move + 1;
				queue.add(data);
			}
			
			if(num * 10 + 1 <= B) {
				data = new long[2];
				data[0] = num * 10 + 1;
				data[1] = move + 1;
				queue.add(data);
			}
		
		}
		
		System.out.println(result);
	}
}
