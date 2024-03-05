package BRONZEⅡ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NUMBER10539 {

public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		int[] result = new int[n];
		for(int i = 0; i <n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		result[0] = arr[0];
		for(int i = 1; i <n; i++) {
			int sum = 0;
			for(int j = 0; j < i ; j++) {
			 sum += result[j];
			}
			result[i] = arr[i] *(i + 1) - sum;
		}
		
		StringBuilder sb = new StringBuilder();
		Arrays.stream(result).forEach(num -> sb.append(num).append(" "));
		System.out.println(sb.toString().trim());
	}

}
