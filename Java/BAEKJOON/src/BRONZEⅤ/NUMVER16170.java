package BRONZE¥´;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.StringTokenizer;

public class NUMVER16170 {
	
	 public static void main(String[] args) throws IOException{
	    	LocalDateTime now = LocalDateTime.now();
	    	now.minusHours(9);
	    	System.out.println(now.getYear());
	    	System.out.println(now.getMonthValue());
	    	System.out.println(now.getDayOfMonth());
	     }  
}
