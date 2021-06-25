package TestCode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
    	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int i = 0;
		while (i*(i+1)/2 < n) {
			i++;
		}
		int k = n - i*(i-1)/2;
		i++;
		if ((i-1)%2 == 0) {
			System.out.println(k + "/" + (i-k));
		}else {
			System.out.println((i-k) + "/" + k);
		}
    }
}