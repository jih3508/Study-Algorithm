package SILVERⅣ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NUMBER18258 {

	static int[] queue = new int[2000000];
	static int front = 0;
	static int back = -1;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		String commend;
		Integer value;
		StringBuffer sb = new StringBuffer();
		while(N-- > 0) {
			st = new StringTokenizer(br.readLine());
			commend = st.nextToken();
			switch(commend) {
				case "push":
					push(Integer.parseInt(st.nextToken()));
					break;
				case "pop":
					sb.append(pop()).append("\n");
					break;
				case "size":
					sb.append(size()).append("\n");
					break;
				case "empty":
					sb.append(empty()).append("\n");
					break;
				case "front":
					sb.append(front()).append("\n");
					break;
				case "back":
					sb.append(back()).append("\n");
					break;
			}
			
		}
		System.out.println(sb);	
	}
	
	static void push(int value) {	
		back++;
		queue[back] = value;
	}
	
	static int pop() {
		if(front > back) {
			return -1;
		}
		else {
			int value = queue[front];
			front++;
			return value;
		}
	}
	
	static int size() {
		return back - front + 1;
	}
	
	static int empty() {
		return front > back? 1 : 0;
	}
	
	static int front() {
		return front > back? -1 : queue[front];
	}
	
	static int back() {
		return front > back?  -1 : queue[back]; 
	}
}
