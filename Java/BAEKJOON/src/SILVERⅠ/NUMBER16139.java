package SILVER¥°;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NUMBER16139 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		int n = S.length();
		int[][] dic = new int[26][n+1];
		int ord = 'a';
		dic[S.charAt(0) - ord][1] = 1;
		for(int i = 1; i < n; i++) {
			for(int j = 0; j < 26; j++) {
				dic[j][i + 1] = dic[j][i] + (S.charAt(i) == j + 'a'? 1: 0);
			}
		}
		
		StringTokenizer st;
		char ch;
		int start, end;
		
		n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			ch = st.nextToken().charAt(0);
			start = Integer.parseInt(st.nextToken());
			end = Integer.parseInt(st.nextToken());
			sb.append(dic[ch - 'a'][end + 1] - dic[ch - 'a'][start] + "\n");
		}
		System.out.println(sb);
	
	}
}
