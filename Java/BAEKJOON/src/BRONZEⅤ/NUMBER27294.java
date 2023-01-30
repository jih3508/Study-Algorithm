package BRONZE¥´;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NUMBER27294 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		
		if(S == 0 && (12 <= T && T <= 16)) {
			System.out.println(320);
		}else {
			System.out.println(280);
		}
	}
}
