package Medium;


import java.util.Arrays;

public class QueriesOnNumberOfPointsInsideACircle {

    public int[] countPoints(int[][] points, int[][] queries) {
        int querySize = queries.length; // 쿼리 길이
        int[] result = new int[querySize]; // 반환 배열

        int count;
        for(int i = 0; i < querySize; i++){
            count = 0; // count 0으로 초기화
            for(int[] point : points){
                // 원 포함 되는 경우 (x1, y1) (x2, y2) 거리가 원의 반지름 보다 작을때
                // (x1 - x2) ^ 2 + (y1 - y2) ^ 2 <= r ^2
                count += Math.pow(point[0] - queries[i][0], 2) + Math.pow(point[1] - queries[i][1], 2) <= Math.pow(queries[i][2], 2) ? 1 : 0;
            }

            result[i] = count;
        }
        return result;
    }

    public static void main(String[] args) {
        QueriesOnNumberOfPointsInsideACircle solution = new QueriesOnNumberOfPointsInsideACircle();
        int[][] points = {{1,1},{2,2},{3,3},{4,4},{5,5}};
        int[][] queries = {{1,2,2},{2,2,2},{4,3,2},{4,3,3}};
        System.out.println(Arrays.toString(solution.countPoints(points, queries)));

//
    }
}
