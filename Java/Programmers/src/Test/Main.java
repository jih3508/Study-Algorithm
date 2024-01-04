package Test;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[][] line = {{2, -1, 4}, {-2, -1, 4}, {0, -1, 1}, {5, -8, -12}, {5, 8, 12}};
		Solution solution = new Solution();
		System.out.println(Arrays.toString(solution.solution(line)));

	}

}
