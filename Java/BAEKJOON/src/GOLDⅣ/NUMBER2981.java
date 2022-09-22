package GOLD¥³;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NUMBER2981 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		long[] array = new long[size];
		for(int i = 0; i < size; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
		long[] re_array = new long[size - 1];
		Arrays.sort(array);
		
		
		for(int i = 0; i < size-1; i ++) {
			re_array[i] = array[i + 1] - array[i];
		}
		
		long gcd = re_array[0];
		for(int i = 1; i < size - 1; i++) {
			gcd = GCD(re_array[i], gcd);
		}
		
		Set<Long> data = new HashSet<Long>();
		
		for(long i = 1; i <= (int) Math.sqrt((double) gcd); i ++) {
			if(gcd % i == 0) {
				data.add(i);
				data.add(gcd / i);
			}
		}
		data.remove(1l);
		Long[] result = data.toArray(new Long[0]);
		Arrays.sort(result);
		
		StringBuffer sb = new StringBuffer();
		
		Arrays.stream(result).forEach(num -> {
			sb.append(num + " ");
		});
		System.out.println(sb.toString().trim());
		br.close();

	}
	
	public static long GCD(long x, long y) {
		long r;
		while(x % y != 0){
			r = x % y;
			x = y;
			y = r;
		}
		return y;
	}
}
