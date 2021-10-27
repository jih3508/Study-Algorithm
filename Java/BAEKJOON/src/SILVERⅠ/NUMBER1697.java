package SILVER¥°;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class NUMBER1697 {
	static int MAX =(int) Math.pow(10, 5);

    public static void main(String[] args) throws IOException{
   	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   	StringTokenizer st = new StringTokenizer(br.readLine());
   	int n = Integer.parseInt(st.nextToken());
   	int k = Integer.parseInt(st.nextToken());
   	System.out.println(bfs(n, k));
    }  
    
    static int bfs(int n, int k) {
   	 int[] array = new int[MAX * 2 + 1];
   	 Arrays.fill(array, 0);
   	 Queue<Integer> queue = new LinkedList<Integer>();
   	 queue.add(n);
   	 int num, i;
   	 int[] num_array = new int[3];
   	 while(!queue.isEmpty()) {
   		 num = queue.poll();
   		 if(num==k) {
   			 return array[k];
   		 }
   		 num_array[0] = num-1;
   		 num_array[1] = num+1;
   		 num_array[2] = num * 2;
   		 for(i = 0; i<3; i++) {
   			 if (0<= num_array[i] && num_array[i] <= MAX && array[num_array[i]] == 0) {
   				 array[num_array[i]] = array[num] + 1;
   				 queue.add(num_array[i]);
   			 }
   		 }
   	 }
   	 return 0;
    }
}
