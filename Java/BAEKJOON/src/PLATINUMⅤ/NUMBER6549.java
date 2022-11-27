package PLATINUMⅤ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NUMBER6549 {

static long[] heights;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		StringTokenizer st;
		while (true){
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			if(N == 0) break;
			heights = new long[N];
			for(int i = 0; i < N; i++) {
				heights[i] = Long.parseLong(st.nextToken());
			}
			System.out.println(solution(0, N - 1));
		}
	}
	
	public static long solution(int l, int r) {
		if(l == r) return heights[l];
		
		int mid = (r + l) /2;
		int lmid = mid;
		int rmid = mid + 1;
		long area = Math.max(solution(l, lmid), solution(rmid, r));
		long height = Math.min(heights[lmid], heights[rmid]);
		area = Math.max(area, height * 2);
		while(l < lmid || rmid < r) {
			// 넓이 큰 순서대로 탐색한다.
			if(rmid < r && ((lmid <= l) || (heights[lmid - 1] < heights[rmid + 1]))) {
				rmid++;
				height = Math.min(height, heights[rmid]);
			}else {
				lmid--;
				height = Math.min(height, heights[lmid]);
			}
			area = Math.max(area, height * (long) (rmid - lmid + 1));
		}
		return area;
	}
}
