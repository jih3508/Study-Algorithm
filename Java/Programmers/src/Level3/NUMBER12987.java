package Level3;

import java.util.*;

/**
 * 문제: 숫자게임
 * url: https://school.programmers.co.kr/learn/courses/30/lessons/12987
 */

public class NUMBER12987 {

    public int solution(int[] A, int[] B) {

        int count = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        int AIndex = 0;
        int BIndex = 0;

        while(AIndex < A.length && BIndex < B.length){
            if(A[AIndex] < B[BIndex]){
                AIndex++;
                count++;
            }
            BIndex++;
        }

        return count;
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
