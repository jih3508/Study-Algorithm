package Easy;

public class FirstUniqueCharacterInAString {

    public int firstUniqChar(String s) {

        // 소문자 26개로 범위가 고정 → HashMap 대신 배열.
        // 해싱·박싱 비용이 없고 공간도 O(1)
        int[] counter = new int[26];

        // 1차 순회: 전체 빈도를 먼저 다 세야 한다.
        // 뒤에 같은 문자가 또 나올 수 있어서 한 번의 순회로는 판단 불가
        for (char alpha : s.toCharArray()) {
            counter[alpha - 'a']++;
        }

        // 2차 순회는 counter가 아니라 s를 기준으로 돈다.
        // 원래 순서대로 보니까 처음 만난 빈도 1 문자가 곧 정답 → 바로 return
        for (int i = 0; i < s.length(); i++) {
            if (counter[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        // 끝까지 못 찾았으면 모든 문자가 2번 이상 등장한 경우
        return -1;
    }

    public static void main(String[] args) {

        FirstUniqueCharacterInAString solution = new FirstUniqueCharacterInAString();
        System.out.println(solution.firstUniqChar("leetcode"));
        System.out.println(solution.firstUniqChar("loveleetcode"));
        System.out.println(solution.firstUniqChar("aabb"));
    }

}
