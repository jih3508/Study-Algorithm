package GOLDⅤ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class NUMBER2212 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int K = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		Integer[] sensor = new Integer[N];
		for(int i = 0; i < N; i++) {
			sensor[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(sensor, Collections.reverseOrder());
		Integer[] distances = new Integer[N - 1];
		for(int i = 0; i < N - 1; i++) {
			distances[i] = sensor[i] - sensor[i + 1];
		}
		Arrays.sort(distances, Collections.reverseOrder());
		int sum = 0;
		for(int i = K - 1; i < N - 1; i++) {
			sum += distances[i];
		}
		System.out.println(sum);
		
	}
}
