package BRONZEⅤ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NUMBER4101 {

public static void main(String[] args) throws IOException {
		
		int x, y;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		while(true) {	
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			if(x ==0 && y == 0) break;
			if (x > y) {
				sb.append("Yes\n");
			}else {
				sb.append("No\n");
			}
		}
		System.out.println(sb);
	}
}
