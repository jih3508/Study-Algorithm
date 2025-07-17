package Medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LetterTilePossibilities {

    // 중복을 제거하기 위한 HashSet (만들어진 모든 문자열을 저장)
    Set<String> strings;
    // 타일의 글자들을 저장하는 배열
    char[] alphabet;
    // 타일의 총 개수
    int size;

    public int numTilePossibilities(String tiles) {

        this.strings = new HashSet<>(); // 중복 제거를 위한 HashSet 초기화
        this.alphabet = tiles.toCharArray(); // 문자열을 문자 배열로 변환
        this.size = tiles.length(); // 타일의 개수 저장
        boolean[] visited = new boolean[size]; // 각 타일의 사용 여부를 추적하는 배열
        Arrays.fill(visited, false); // 모든 타일을 미사용 상태로 초기화

        backtracking("", visited); // 빈 문자열부터 시작해서 백트래킹 수행
        this.strings.remove(""); // 빈 문자열은 제외 (문제에서 비어있지 않은 시퀀스를 요구)

        return this.strings.size(); // 만들어진 유니크한 문자열의 개수 반환
    }

    /**
     * 백트래킹을 통해 모든 가능한 문자열 조합을 생성
     * @param str 현재까지 만들어진 문자열
     * @param visited 각 타일의 사용 여부를 나타내는 배열
     */
    public void backtracking(String str, boolean[] visited) {
        // 현재 문자열의 길이가 타일 개수를 초과하면 종료
        // (실제로는 이 조건에 도달하지 않음 - 안전장치)
        if (str.length() > this.size) {
            return;
        }

        // 현재 만들어진 문자열을 결과 세트에 추가
        // HashSet이므로 중복은 자동으로 제거됨
        this.strings.add(str);

        // 모든 타일을 순회하면서 사용 가능한 타일로 문자열을 확장
        for (int i = 0; i < size; i++) {
            // 아직 사용하지 않은 타일인 경우
            if (!visited[i]) {
                str += this.alphabet[i]; // 현재 타일의 글자를 문자열에 추가
                visited[i] = true; // 해당 타일을 사용됨으로 표시

                this.backtracking(str, visited); // 재귀적으로 더 긴 문자열 탐색

                // 백트래킹: 이전 상태로 되돌리기
                str = str.substring(0, str.length() - 1); // 마지막 글자 제거
                visited[i] = false; // 타일을 다시 미사용 상태로 변경
            }
        }
    }

    public static void main(String[] args) {
        LetterTilePossibilities obj = new LetterTilePossibilities();
        System.out.println(obj.numTilePossibilities("AAB"));
        System.out.println(obj.numTilePossibilities("AAABBC"));
        System.out.println(obj.numTilePossibilities("V"));
    }
}
