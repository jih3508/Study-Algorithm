package SILVER¥±;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NUMBER11729 {

	static StringBuilder sb = new StringBuilder();
    static int count = 0;
    
    public static void main(String[] args) throws IOException{
   	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   	hanoiTop(Integer.parseInt(br.readLine()), 1, 2, 3);
   	System.out.println(count);
   	System.out.println(sb.toString());
    }
    
    public static void hanoiTop(int n, int a, int b, int c) {
   	 if (n == 1) {
   		 sb.append(a + " " + c).append("\n");
   		 count +=1;
   		 return;
   	 }
   	 hanoiTop(n - 1, a, c, b);
   	 sb.append(a + " " + c).append("\n");
   	 count +=1;
   	 hanoiTop(n - 1, b, a, c);
    }
}
