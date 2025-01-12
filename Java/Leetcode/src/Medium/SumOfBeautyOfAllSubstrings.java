package Medium;

import java.util.Arrays;
import java.util.Map;

public class SumOfBeautyOfAllSubstrings {

    public int beautySum(String s) {

        int result = 0; // 결과값을 저장할 변수

        int size = s.length(); // 문자열의 길이

        // 부분 문자열의 시작 위치를 지정하는 루프
        for (int start = 0; start < size; start++) {
            // 각 문자(a~z)의 빈도수를 저장할 배열
            int[] info = new int[26];

            // 부분 문자열의 끝 위치를 지정하는 루프
            for (int end = start; end < size; end++) {
                // 현재 문자의 빈도수를 증가
                ++info[s.charAt(end) - 'a'];

                // 빈도수의 최대값과 최소값을 저장할 변수 초기화
                int maxValue = 0;
                int minVale = 500;

                // 현재까지의 빈도수 배열을 탐색
                for (int cnt : info) {
                    if (cnt > 0) { // 빈도수가 0이 아닌 경우만 계산
                        maxValue = Math.max(maxValue, cnt); // 최대 빈도수 갱신
                        minVale = Math.min(minVale, cnt);  // 최소 빈도수 갱신
                    }
                }

                // 최대값과 최소값의 차이를 결과에 추가
                result += Math.max(maxValue - minVale, 0);
            }
        }

        // 모든 부분 문자열의 아름다움의 합 반환
        return result;
    }


    public static void main(String[] args) {
        SumOfBeautyOfAllSubstrings obj = new SumOfBeautyOfAllSubstrings();
        System.out.println(obj.beautySum("aabcb"));
        System.out.println(obj.beautySum("aabcbaa"));
    }
}
