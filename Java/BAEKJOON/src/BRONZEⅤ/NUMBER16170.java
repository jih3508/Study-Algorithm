package BRONZEⅤ;

import java.io.IOException;
import java.time.LocalDateTime;

public class NUMBER16170 {
	
	 public static void main(String[] args) throws IOException{
	    	LocalDateTime now = LocalDateTime.now();
	    	now.minusHours(9);
	    	System.out.println(now.getYear());
	    	System.out.println(now.getMonthValue());
	    	System.out.println(now.getDayOfMonth());
	     }  
}
