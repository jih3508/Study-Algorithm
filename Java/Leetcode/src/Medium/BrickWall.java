package Medium;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 554. Brick Wall
 * https://leetcode.com/problems/brick-wall/description/
 */
public class BrickWall {

    public int leastBricks(List<List<Integer>> wall) {

        int size = wall.size(); // 벽의 총 행 수
        Map<Integer, Integer> map = new HashMap<>(); // 벽돌 경계의 위치와 그 빈도수를 저장하는 맵
        int maxCount = 0; // 가장 많이 등장하는 벽돌 경계선의 수

        for (int i = 0; i < size; i++) {
            List<Integer> row = wall.get(i); // 현재 행의 벽돌 배열을 가져옴
            int length = 0; // 현재까지의 누적 길이
            for (int j = 0; j < row.size() - 1; j++) { // 마지막 벽돌은 벽의 끝이므로 제외
                length += row.get(j); // 현재 벽돌의 길이를 누적
                int value = map.getOrDefault(length, 0) + 1; // 현재 경계 위치의 빈도수를 증가
                map.put(length, value); // 맵에 업데이트된 빈도수 저장
                maxCount = Math.max(maxCount, value); // 최대 빈도수 갱신
            }
        }

        return size - maxCount; // 벽의 전체 행 수에서 최대 경계선을 뺀 값이 최소로 가로지르는 벽돌 수
    }

    public static void main(String[] args) {
        BrickWall br = new BrickWall();
        List<List<Integer>> wall = List.of(List.of(1,2,2,1),
                List.of(3,1,2),
                List.of(1,3,2),
                List.of(2, 4),
                List.of(3,1,2),
                List.of(1,3,1,1));

        System.out.println(br.leastBricks(wall));
        wall =  List.of(List.of(1), List.of(1), List.of(1));
        System.out.println(br.leastBricks(wall));
    }
}
