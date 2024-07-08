package BRONZEⅣ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NUMBER2083 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		while(true) {
			st = new StringTokenizer(br.readLine());
			String name= st.nextToken();
			int age = Integer.parseInt(st.nextToken());
			int weight = Integer.parseInt(st.nextToken());
			if(name.equals("#") && age == 0 && weight == 0 ) {
				break;
			}
			System.out.println(name + " " +
					(age > 17 || weight >= 80? "Senior" : "Junior"));
		}
	}
}
