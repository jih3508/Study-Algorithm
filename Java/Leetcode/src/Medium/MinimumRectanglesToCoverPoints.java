package Medium;

import java.util.Arrays;

public class MinimumRectanglesToCoverPoints {
    public int minRectanglesToCoverPoints(int[][] points, int w) {

        // points 정렬
        Arrays.sort(points, (o1, o2) -> o1[0] - o2[0]);

        int startLocation = points[0][0]; // x축 왼쪽 위치
        int count = 1; // 사각형 개수
        for (int[] point : points){
            // x축 위치가 사각형 범위에 벗어 날때
            // 개수 +1 증가와 x축 시작 위치를 현재 x축 위치로 지정한다.
            if(point[0] > startLocation + w ){
                count++;
                startLocation = point[0];
            }

        }

        return count;
    }

    public static void main(String[] args) {
        MinimumRectanglesToCoverPoints solution = new MinimumRectanglesToCoverPoints();
        int[][] points = {{2,1},{1,0},{1,4},{1,8},{3,5},{4,6}};
        System.out.println(solution.minRectanglesToCoverPoints(points, 1));

        points = new int[][] {{0,0},{1,1},{2,2},{3,3},{4,4},{5,5},{6,6}};
        System.out.println(solution.minRectanglesToCoverPoints(points, 2));

        points = new int[][] {{2,3},{1,2}};
        System.out.println(solution.minRectanglesToCoverPoints(points, 0));

        points = new int[][] {{1,7},{9,9},{8,6}};
        System.out.println(solution.minRectanglesToCoverPoints(points, 1));
    }
}
