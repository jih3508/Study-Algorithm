package Level2;

import java.util.Arrays;

/*
 * 문제: 이빈 변환 반복하기
 * url: https://school.programmers.co.kr/learn/courses/30/lessons/70129
 */
public class NUMBER70129 {

    public int[] solution(String s) {
        int[] answer = {0, 0}; // 이진 변환 횟수, 0이 제거 된 횟수

        while (!s.equals("1")){
            answer[0]++;

            String after = s;
            after = after.replaceAll("0", ""); // 문자 0을 제거
            answer[1] += s.length() - after.length(); // 기존 문자열과 0을 제거 차이 추가하기
            s = Integer.toBinaryString(after.length()); // 문자 길이를 이진수로 변환
        }

        return answer;
    }

    public static void main(String[] args) {
        NUMBER70129 obj = new NUMBER70129();
        System.out.println(Arrays.toString(obj.solution("110010101001")));
        System.out.println(Arrays.toString(obj.solution("01110")));
        System.out.println(Arrays.toString(obj.solution("1111111")));

    }
}
