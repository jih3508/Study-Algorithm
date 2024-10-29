package GOLDⅡ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NUMBER1300 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long N = Long.parseLong(br.readLine());
		long K = Long.parseLong(br.readLine());
		
		long start = 1;
		long end = N * N;
		long mid, count, i;
		while(start <= end) {
			mid = (start + end) / 2;
			count = 0;
			for(i = 1; i <= N; i++) {
				count += Math.min(mid / i, N);
			}
			
			if(count >= K) {
				end = mid -1;
			}else {
				start = mid + 1;
			}
		}
		System.out.println(start);
	}

}
