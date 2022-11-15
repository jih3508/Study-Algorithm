package SILVER¥²;

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
		
		long km = (long) roads[0] * costs[0];
		int cost = costs[0];
		for(int i = 1; i < N - 1; i++) {
			if (costs[i] < cost) cost = costs[i];
			km += (long) roads[i] * cost;
		}
		System.out.println(km);
	}
}
