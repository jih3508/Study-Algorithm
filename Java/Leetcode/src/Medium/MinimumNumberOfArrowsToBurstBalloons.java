package Medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class MinimumNumberOfArrowsToBurstBalloons {

    public int findMinArrowShots(int[][] points) {

        int size = points.length;

        // 끝 지점으로 정렬
        Arrays.sort(points, Comparator.comparingInt(point -> point[1]));

        int count = 1;
        int arrow = points[0][1];
        for (int i = 1; i < size; i++) {
            // 끝 지점이 시작 지점 작을때
            if(arrow < points[i][0]){
                count++; // 개수 증가
                arrow = points[i][1]; // 다시 끝지점으로 위치 지정
            }
        }

        return count;
    }

    public static void main(String[] args) {
        MinimumNumberOfArrowsToBurstBalloons obj = new MinimumNumberOfArrowsToBurstBalloons();
        int[][] points = new int[][] {{10,16},{2,8},{1,6},{7,12}};
        System.out.println(obj.findMinArrowShots(points));
        points = new int[][] {{1,2},{3,4},{5,6},{7,8}};
        System.out.println(obj.findMinArrowShots(points));
        points = new int[][] {{1,2},{2,3},{3,4},{4,5}};
        System.out.println(obj.findMinArrowShots(points));
        points = new int[][] {{3,9},{7,12},{3,8},{6,8},{9,10},{2,9},{0,9},{3,9},{0,6},{2,8}};
        System.out.println(obj.findMinArrowShots(points));
        points = new int[][] {{60051528,100384399},{12805732,32854561},{78409503,93939522},{13258270,86621638},{9959708,87446423},{73226340,104744489},{747796,90448519},{17142618,85144863},{50122846,89616297},{90892921,151136476}};
        System.out.println(obj.findMinArrowShots(points));
    }

}