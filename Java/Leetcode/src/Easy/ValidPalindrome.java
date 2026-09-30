package Easy;

/**
 * 문제: Valid Palindrome
 * url: https://leetcode.com/problems/valid-palindrome/description/
 */
public class ValidPalindrome {

    public boolean isPalindrome(String s) {

        // 소문자 통일이 먼저, 필터링이 나중 — 순서를 뒤집으면 [^a-z0-9]가 대문자를 전부 지워 버린다
        String replaceString = s.toLowerCase().replaceAll("[^a-z0-9]","");
        int length = replaceString.length();


        // 절반(내림)만 돈다 — 양 끝에서 안쪽으로 짝지어 비교하니 나머지 절반은 중복 비교.
        // 홀수 길이의 가운데 글자는 자기 자신과 짝이라 건너뛰어도 안전하다
        for (int i = 0; i < length / 2; i++) {
            // 앞에서 i번째의 짝은 뒤에서 i번째 — 인덱스가 0부터라 -1이 붙는다
            if(replaceString.charAt(i) != replaceString.charAt(length - i - 1)){
                return false;
            }
        }

        // 불일치가 없었거나 비교할 쌍 자체가 없으면(빈 문자열·1글자) 회문으로 본다
        return true;
    }

    public static void main(String[] args) {
        ValidPalindrome solution = new ValidPalindrome();
        System.out.println(solution.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(solution.isPalindrome("race a car"));
        System.out.println(solution.isPalindrome(" "));
        System.out.println(solution.isPalindrome("0P"));

    }

}
