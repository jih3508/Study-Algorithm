package Level2;

import java.io.IOException;
import java.util.*;
/*
 * 문제: H-Index
 * url: https://school.programmers.co.kr/learn/courses/30/lessons/77484
 */
public class NUMBER42747 {

    public int solution(int[] citations) {

        // 인용 횟수를 오름차순으로 정렬한다.
        // 예: [3, 0, 6, 1, 5] -> [0, 1, 3, 5, 6]
        Arrays.sort(citations);

        int n = citations.length;
        int result = 0;

        // 정렬된 배열에서 인덱스 i(0-based)를 기준으로 보면,
        // citations[i]부터 citations[n-1]까지의 (n - i)편은
        // 모두 citations[i] 이상 인용된 논문이다.
        //
        // 즉, "citations[i] 이상 인용된 논문이 (n - i)편 존재한다"는 뜻이므로,
        // 이 지점에서 만들 수 있는 h 후보는
        //   min(citations[i], n - i)
        // 가 된다. (citations[i]가 매우 크더라도 실제로 그만큼 인용된
        //   논문 편수는 n - i를 넘을 수 없기 때문)
        //
        // 이 후보값들 중 최댓값이 H-Index다.
        for (int i = 0; i < n; i++) {  // 마지막 인덱스(n-1)도 포함해야 함
            int papersCitedAtLeastThisMuch = n - i;
            int candidate = Math.min(citations[i], papersCitedAtLeastThisMuch);
            result = Math.max(result, candidate);
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        NUMBER42747 solution = new NUMBER42747();
        System.out.println(solution.solution(new int[] {3, 0, 6, 1, 5}));
    }
}
