package Medium;

import java.util.Arrays;

public class DecodeWays {

	 public int numDecodings(String s) {
		 
		 if(s.charAt(0) == '0') return 0;
		 
		 int lenth = s.length();
		 int[] dp = new int[lenth + 1];
		 
		 Arrays.fill(dp, 0); // 0으로 초기화
		 
		 dp[0] = 1;
		 dp[1] = 1;
		 
		 
		 int nowNum;
		 
		 
		 for(int i = 2; i <= lenth; i ++) {
			 
			 nowNum = Integer.parseInt(s.substring(i-2, i));
			 
			 if(s.charAt(i-1) != '0'){
				 dp[i] += dp[i-1];
			 }
			 
			 if(10<= nowNum && nowNum <= 26) {
				 dp[i] += dp[i-2];
			 }
			 
			 //System.out.println(nowNum);
			 
			 
		 }

		 System.out.println(Arrays.toString(dp));
		 return dp[lenth];
	 }
	
	public static void main(String[] args) {
		DecodeWays decodeWays  = new DecodeWays();
		System.out.println(decodeWays.numDecodings("12"));
		System.out.println(decodeWays.numDecodings("226"));
		System.out.println(decodeWays.numDecodings("06"));
		System.out.println(decodeWays.numDecodings("10"));

	}

}
