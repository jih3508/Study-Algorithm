package BRONZE¥°;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NUMBER4344 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int c = Integer.parseInt(br.readLine());
		int n, x, num, count;
		float sum, avg;
		int array[];
		
		for(int i =0; i<c; i++) {
			st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			sum = 0;
			array = new int[n];
			for (x = 0; x<n; x++) {
				num = Integer.parseInt(st.nextToken());
				sum += num;
				array[x] = num;
			}
			avg = sum / (float) n;
			count = 0;
			for (x = 0; x<n; x++) {
				if (array[x] > avg) {
					count++;
				}
			}
			count = count * 100;
			System.out.println(String.format("%.3f%%", (float) count/ (float) n));
		}	
	}

}
