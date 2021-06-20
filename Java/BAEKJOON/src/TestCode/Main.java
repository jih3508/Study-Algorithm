package TestCode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
    public static void main(String[] args) {
    	
		int[] result = new int[10001];
		int value;
		String nums;
		for(int i = 1; i<10001; i++) {
			value = i;
			nums = String.valueOf(i);
			for(int j = 0; j<nums.length(); j++) {
				value += Character.getNumericValue(nums.charAt(j));
			}
			if(value < 10001) {
				result[value] = 1;
			}	
		}
		
		for(int i = 1; i<10001; i++) {
			if (result[i] == 0) {
				System.out.println(i);
			}
		}
    }
}