package GOLDⅤ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NUMBER9251 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] X = br.readLine().toCharArray();
		char[] Y = br.readLine().toCharArray();
		
		int xLegth = X.length;
		int yLegth = Y.length;
		
		int[][] dp =  new int[xLegth + 1][yLegth + 1];
		Arrays.stream(dp).forEach(array -> Arrays.setAll(array, x -> 0));
		
		for(int i = 1; i <= xLegth; i++) {
			for(int j = 1; j <= yLegth; j++) {
				if(X[i - 1] == Y[j - 1]) {
					dp[i][j] = dp[i-1][j-1] + 1;
				}else {
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		
		System.out.println(dp[xLegth][yLegth]);
	}
	
}
