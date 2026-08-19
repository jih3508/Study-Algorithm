package Level2;

/**
 * 문제: 방문 길이
 * url: https://school.programmers.co.kr/learn/courses/30/lessons/49994
 */

import java.util.*;

/**
 * 게임 캐릭터 이동 문제 - solution 함수 (Java)
 *
 * - 캐릭터는 (0, 0)에서 시작
 * - 좌표평면 경계: -5 ~ 5 (x, y 모두)
 * - 경계를 넘는 명령어는 무시
 * - 이미 지나간 구간(길)은 다시 세지 않고, "처음 걸어본 길의 길이"만 카운트
 */
public class NUMBER49994 {

    // 좌표평면 경계값
    private static final int BOUNDARY_MIN = -5;
    private static final int BOUNDARY_MAX = 5;

    private static  final Map<Character,int[]> MOVE = new HashMap<>();

    static {
        MOVE.put('U', new int[]{0, 1});
        MOVE.put('D', new int[]{0, -1});
        MOVE.put('R', new int[]{1, 0});
        MOVE.put('L', new int[]{-1, 0});
    }
    public int solution(String dirs) {

        int x = 0;
        int y = 0;

        // 지나간 구간(간선)을 저장하는 집합.
        Set<String> visitedEdges = new HashSet<>();

        for(char dir : dirs.toCharArray()){
           int fx = x + MOVE.get(dir)[0];
           int fy = y + MOVE.get(dir)[1];

            // 경계를 벗어나는 이동은 무시
           if(isWithinBoundary(fx, fy)){
               // 현재 위치 -> 다음 위치 구간을 기록
               // "A|B"와 "B|A"를 모두 넣어 방향에 상관없이 같은 길로 취급
               visitedEdges.add(String.format("(%d,%d),(%d,%d)", x, y, fx, fy));
               visitedEdges.add(String.format("(%d,%d),(%d,%d)", fx, fy, x, y));

               // 위치갱신
               x = fx;
               y = fy;
           }

        }

        // 두 개씩(정방향/역방향) 저장했으므로 실제 간선 개수는 절반
        return visitedEdges.size() /2 ;
    }

    /**
     * 좌표가 경계(-5 ~ 5) 안에 있는지 확인한다.
     */
    public boolean isWithinBoundary(int x, int y){
        return x >= BOUNDARY_MIN && x <= BOUNDARY_MAX
                && y >= BOUNDARY_MIN && y <= BOUNDARY_MAX;
    }

    // 간단한 동작 확인용 테스트
    public static void main(String[] args) {
        NUMBER49994 sol = new NUMBER49994();
        System.out.println(sol.solution("ULURRDLLU")); // 7
        System.out.println(sol.solution("LULLLLLLU")); // 7
    }


}
