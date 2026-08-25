package Level3;

import java.util.*;

/**
 * 문제: 숫자게임
 * url: https://school.programmers.co.kr/learn/courses/30/lessons/12987
 */

public class NUMBER12987 {

    public int solution(int[] A, int[] B) {

        int[] sortedA = A.clone();
        int[] sortedB = B.clone();
        Arrays.sort(sortedA);
        Arrays.sort(sortedB);

        int winCount = 0; // B팀이 획득하는 승점(승리 횟수)
        int aIndex = 0;    // 아직 이기지 못한 A 후보 중 가장 작은 값의 인덱스

        for (int bIndex = 0; bIndex < sortedB.length && aIndex < sortedA.length; bIndex++) {
            // 현재 B 값이 남아있는 A 최소값보다 크면 승리
            if (sortedB[bIndex] > sortedA[aIndex]) {
                winCount++;
                aIndex++; // 이긴 A는 소모(다음 매칭에서 제외)
            }
            // 이기지 못했다면 해당 B는 버리고 다음 B로 넘어감 (aIndex는 그대로 유지)
        }

        return winCount;
    }


    public static void main(String[] args) {
        NUMBER12987 solution = new NUMBER12987();

        int[] A = {5,1,3,7};
        int[] B = {2,2,6,8};
        System.out.println(solution.solution(A, B));

        A = new int[] {2,2,2,2};
        B = new int[] {1,1,1,1};
        System.out.println(solution.solution(A, B));
    }
}
