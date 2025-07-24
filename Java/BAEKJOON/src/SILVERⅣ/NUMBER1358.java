package SILVERⅣ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NUMBER1358 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()); 
	    float W = Float.parseFloat(st.nextToken());
	    float H = Float.parseFloat(st.nextToken());
	    float X = Float.parseFloat(st.nextToken());
	    float Y = Float.parseFloat(st.nextToken());
	    float P = Float.parseFloat(st.nextToken());
	    float R = H / 2;

	    
	    int count = 0;
	    
		for(int t = 0; t < P; t++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			if(Math.pow(X - x, 2) + Math.pow(Y + R - y, 2) <= Math.pow(R, 2)) {
				count++;
			}else if(Math.pow(X + W - x, 2) + Math.pow(Y + R - y, 2) <= Math.pow(R, 2)) {
				count++;
			}else if( x >= X &&  x <= (X + W) && y >= Y && y <= (Y + H)) {
				count++;
			}
		}
		
		System.out.println(count);	    
	}
}
