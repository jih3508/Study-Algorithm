package Level2;

import java.util.*;

/**
 * 뉴스 클러스터링
 * url: https://school.programmers.co.kr/learn/courses/30/lessons/17677
 */
public class NUMBER17677 {

    public int solution(String str1, String str2) {

        // 두 글자 쌍을 (원소 -> 등장 횟수)로 집계한 다중집합으로 변환
        // 기존 List + contains/remove 방식은 원소당 O(N) 탐색이 발생해 전체 O(N^2)
        Map<String, Integer> multiset1 = toMultiset(str1);
        Map<String, Integer> multiset2 = toMultiset(str2);

        // 두 다중집합에 등장하는 모든 원소 '종류'를 모아 한 번만 순회
        Set<String> keys = new HashSet<>(multiset1.keySet());
        keys.addAll(multiset2.keySet());

        int intersectionCount = 0;
        int unionCount = 0;

        for (String key : keys) {
            int count1 = multiset1.getOrDefault(key, 0);
            int count2 = multiset2.getOrDefault(key, 0);

            // 다중집합 교집합은 개수의 min, 합집합은 개수의 max
            // (기존 코드의 unionCount 누적 로직을 정의 그대로 단순화)
            intersectionCount += Math.min(count1, count2);
            unionCount += Math.max(count1, count2);
        }

        // 두 집합이 모두 공집합이면 나눗셈이 정의되지 않으므로 J(A, B) = 1
        if (unionCount == 0) {
            return 65536;
        }

        // 반드시 곱셈을 먼저 수행 (먼저 나누면 정수 나눗셈으로 0이 됨)
        // 최댓값 65536 * 999 = 65,470,464 < 2^31 이므로 int 오버플로 없음
        return 65536 * intersectionCount / unionCount;
    }

    /**
     * 문자열을 두 글자 단위로 끊어 다중집합(원소 -> 개수)으로 변환한다.
     * - 대소문자를 구분하지 않으므로 소문자로 통일
     * - 두 글자가 모두 영문자인 쌍만 유효 원소로 인정
     */
    private Map<String, Integer> toMultiset(String str) {

        String lower = str.toLowerCase();
        Map<String, Integer> multiset = new HashMap<>();

        // i + 1 까지 접근하므로 length() - 1 미만까지만 순회
        for (int i = 0; i < lower.length() - 1; i++) {

            String pair = lower.substring(i, i + 2);

            // 기존 코드는 replaceAll 결과(suStr)로 검사하고 원본 substring을 담아
            // 검사 대상과 저장 대상이 어긋나 있었음 -> 동일한 값을 검사·저장하도록 통일
            if (isAlphabetPair(pair)) {
                multiset.merge(pair, 1, Integer::sum);
            }
        }

        return multiset;
    }

    /**
     * 글자 쌍이 모두 a~z 인지 확인한다.
     * 정규식(replaceAll)은 호출마다 패턴 컴파일 비용이 있어 단순 문자 비교로 대체
     */
    private boolean isAlphabetPair(String pair) {
        char first = pair.charAt(0);
        char second = pair.charAt(1);

        return first >= 'a' && first <= 'z'
                && second >= 'a' && second <= 'z';
    }

    public static void main(String[] args) {

        NUMBER17677 sol = new NUMBER17677();

        System.out.println(sol.solution("FRANCE", "french"));
        System.out.println(sol.solution("handshake", "shake hands"));
        System.out.println(sol.solution("aa1+aa2", "AAAA12"));
        System.out.println(sol.solution("E=M*C^2", "e=m*c^2"));

    }
}
