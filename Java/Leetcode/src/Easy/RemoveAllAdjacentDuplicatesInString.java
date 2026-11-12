package Easy;


public class RemoveAllAdjacentDuplicatesInString {

    // 인접한 같은 글자 쌍을 더 이상 없을 때까지 지운 결과를 반환
    // s: 소문자로 이루어진 원본 문자열
    public String removeDuplicates(String s) {
        // StringBuilder를 스택으로 사용: 끝이 top
        // 박싱이 없고, 남은 내용이 곧 정답 문자열이라 재조립이 필요 없음
        StringBuilder stack = new StringBuilder();

        for (char alpha : s.toCharArray()) {
            int top = stack.length() - 1;
            // top >= 0 체크가 빈 스택 확인 역할
            // char끼리는 원시 타입이라 ==로 비교해도 안전
            if (top >= 0 && stack.charAt(top) == alpha) {
                // 끝 글자 삭제는 뒤로 밀 글자가 없어서 O(1)
                stack.deleteCharAt(top);
            } else {
                stack.append(alpha);
            }
        }

        return stack.toString();
    }

    public static void main(String[] args) {
        RemoveAllAdjacentDuplicatesInString solution = new RemoveAllAdjacentDuplicatesInString();

        System.out.println(solution.removeDuplicates("abbaca"));
        System.out.println(solution.removeDuplicates("azxxzy"));
    }

}
