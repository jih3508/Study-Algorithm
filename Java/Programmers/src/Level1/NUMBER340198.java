package Level1;

import java.util.Arrays;
import java.util.Comparator;

/*
 * - 공원
 * - url: https://school.programmers.co.kr/learn/courses/30/lessons/340198
 */
public class NUMBER340198 {

    public int solution(int[] mats, String[][] park) {

        // 공원의 행과 열 크기를 저장
        int row = park.length;
        int col = park[0].length;

        // dp 배열: 각 위치에서 가능한 최대 정사각형 크기를 저장할 배열
        // (i,j) 위치에서 왼쪽 상단으로 확장할 수 있는 최대 정사각형의 한 변 길이
        // 패딩을 위해 크기를 1씩 더 크게 설정
        int[][] dp = new int[row+1][col+1];

        // 공원에서 가능한 최대 정사각형의 크기
        int maxValue = 0;

        // 모든 위치를 순회하며 dp 배열 채우기
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                // 현재 위치에 사람이 없는 경우 ("-1")
                if(park[i][j].equals("-1")){
                    // dp[i+1][j+1]은 현재 위치에서의 최대 정사각형 크기
                    // 왼쪽(dp[i+1][j]), 위쪽(dp[i][j+1]), 왼쪽 위 대각선(dp[i][j]) 중 최소값에 1을 더함
                    // 이는 현재 위치를 포함하는 최대 정사각형의 크기를 계산하는 방법
                    dp[i+1][j+1] = Math.min(dp[i+1][j], dp[i][j+1]);
                    dp[i+1][j+1] = Math.min(dp[i+1][j+1], dp[i][j]) + 1;
                } else {
                    // 사람이 있는 경우 돗자리를 깔 수 없으므로 0으로 설정
                    dp[i+1][j+1] = 0;
                }
                // 최대 정사각형 크기 업데이트
                maxValue = Math.max(maxValue, dp[i+1][j+1]);
            }
        }

        // 돗자리 크기를 내림차순으로 정렬
        mats = Arrays.stream(mats)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        // 결과값 초기화 (-1은 아무 돗자리도 깔 수 없는 경우)
        int result = -1;

        // 내림차순으로 정렬된 돗자리 배열을 순회하며
        // 공원에서 가능한 최대 정사각형 크기보다 작거나 같은
        // 첫 번째 돗자리 크기를 찾음
        for(int mat : mats){
            if(maxValue >= mat){
                result = mat; // 해당 크기의 돗자리를 깔 수 있음
                break;        // 가장 큰 돗자리를 찾았으므로 반복문 종료
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] mats = new int[] {5,3,2};
        String[][] park = new String[][] {{"A", "A", "-1", "B", "B", "B", "B", "-1"}, {"A", "A", "-1", "B", "B", "B", "B", "-1"}, {"-1", "-1", "-1", "-1", "-1", "-1", "-1", "-1"}, {"D", "D", "-1", "-1", "-1", "-1", "E", "-1"}, {"D", "D", "-1", "-1", "-1", "-1", "-1", "F"}, {"D", "D", "-1", "-1", "-1", "-1", "E", "-1"}};
        NUMBER340198 obj = new NUMBER340198();
        System.out.println(obj.solution(mats, park));
    }
}
