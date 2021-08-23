package SILVER��;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NUMBER1002 {

	public static void main(String[] args) throws IOException {
    	
		int point[][] = new int[3][3];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int x1, y1, r1, x2, y2, r2;
		double[] round = new double[3]; 
		double r;
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			x1 = Integer.parseInt(st.nextToken());
			y1 = Integer.parseInt(st.nextToken());
			r1 = Integer.parseInt(st.nextToken());
			x2 = Integer.parseInt(st.nextToken());
			y2 = Integer.parseInt(st.nextToken());
			r2 = Integer.parseInt(st.nextToken());
			System.out.println(tangent_point(x1, y1, r1, x2, y2, r2));
		}
    }
	
	public static int tangent_point(int x1, int y1, int r1, int x2, int y2, int r2) {
		int distance_pow = (int)(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));	// ������ �Ÿ� distance�� ���� 
		 
		// case 1 : ������ �����鼭 �������� ���� ���
		if(x1 == x2 && y1 == y2 && r1 == r2) {
			return -1;
		}
		
		// case 2-1 : �� ���� ������ �պ��� ������ �Ÿ��� �� �� �� 
		else if(distance_pow > Math.pow(r1 + r2, 2)) {
			return 0;
		}
 
		// case 2-2 : �� �ȿ� ���� ������ �������� ���� �� 
		else if(distance_pow < Math.pow(r2 - r1, 2)) {
			return 0;
		}
		
		// case 3-1 : ������ �� 
		else if(distance_pow == Math.pow(r2 - r1, 2)) {
			return 1;
		}
        
		// case 3-2 : ������ �� 
		else if(distance_pow == Math.pow(r1 + r2, 2)) {
			return 1;
		}
		
		else {
			return 2;
		}
	}
}
