/*
 * 문제: 로또의 최고 순위와 최저 순위
 * url: https://school.programmers.co.kr/learn/courses/30/lessons/77484
 */

package Level1;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class NUMBER77484 {

    public int[] solution(int[] lottos, int[] winNums) {

        // 당첨번호를 set으로 초기화
        Set<Integer> winNumsSet = Arrays.stream(winNums).boxed().collect(Collectors.toSet());

        int unknownCount = 0; // 알아볼 수 없는 번호(0)의 개수
        int matchCount = 0;   // 실제로 당첨 번호와 일치하는 번호의 개수

        for(int lotto : lottos) {

            // 구매 번호가 0일때 최고 점수+1 해주기
            if(lotto == 0){
                unknownCount++;
            // 구매 번호가 0이 아닐때 당첨번호 있으면 최고, 최저 점수 추가
            }else if(winNumsSet.contains(lotto)){
                matchCount++;

            }
        }

        // 최고 순위: 알아볼 수 없는 번호(0)를 전부 맞춘 것으로 가정
        int bestRank = calculateRankByCorrectCount(matchCount + unknownCount);
        // 최저 순위: 알아볼 수 없는 번호(0)를 전부 틀린 것으로 가정
        int worstRank = calculateRankByCorrectCount(matchCount);

        return new int[] { bestRank, worstRank };


    }

    /**
     * 맞은 번호 개수를 로또 등수로 환산하는 함수
     * 6개 일치 -> 1등, 5개 -> 2등, 4개 -> 3등, 3개 -> 4등, 2개 -> 5등, 그 외 -> 6등(낙첨)
     */
    public int calculateRankByCorrectCount(int num){
        return switch (num){
            case 6 -> 1;
            case 5 -> 2;
            case 4 -> 3;
            case 3 -> 4;
            case 2 -> 5;
            default -> 6;
        };
    }

    public static void main(String[] args) throws IOException {
        NUMBER77484 solution = new NUMBER77484();
        System.out.println(Arrays.toString(solution.solution(new int[] {44, 1, 0, 0, 31, 25}, new int[] {31, 10, 45, 1, 6, 19})));
        System.out.println(Arrays.toString(solution.solution(new int[] {0, 0, 0, 0, 0, 0}, new int[] {38, 19, 20, 40, 15, 25})));
        System.out.println(Arrays.toString(solution.solution(new int[] {45, 4, 35, 20, 3, 9}, new int[] {20, 9, 3, 45, 4, 35})));
    }

}
