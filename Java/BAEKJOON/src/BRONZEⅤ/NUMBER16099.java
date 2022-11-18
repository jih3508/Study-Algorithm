package BRONZE¥´;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NUMBER16099 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		long lv, wv, le, we;
		while(N-- > 0) {
			st = new StringTokenizer(br.readLine());
			lv = Long.parseLong(st.nextToken());
			wv = Long.parseLong(st.nextToken());
			le = Long.parseLong(st.nextToken());
			we = Long.parseLong(st.nextToken());
			if(lv * wv == le * we) {
				System.out.println("Tie");
			}else if(lv * wv > le * we) {
				System.out.println("TelecomParisTech");
			}else {
				System.out.println("Eurecom");
			}
			
		}
	}

}
