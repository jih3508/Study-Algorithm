package SILVERⅢ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NUMBER13305 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] roads = new int[N - 1];
		int[] costs = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N - 1; i++) {
			roads[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N ; i++) {
			costs[i] = Integer.parseInt(st.nextToken());
		}
		
		// 처음에는 무조건 기름은 넣어야 하기때문에 맨앞에 비용과 거리로 설정한다.
		long total_cost = (long) roads[0] * costs[0];
		int cost = costs[0];
		for(int i = 1; i < N - 1; i++) {
			// 이전 가격이랑 비교해서 싼것 위주로 기름을 넣는다.
			if (costs[i] < cost) cost = costs[i];
			total_cost += (long) roads[i] * cost;
		}
		System.out.println(total_cost);
	}
}
