package Medium;

import java.util.Arrays;

public class MinimumNumberOfPushesToTypeWordII {

    public int minimumPushes(String word) {

        // 알파벳 빈도수를 저장할 배열 초기화 (26개의 알파벳)
        int[] count = new int[26];
        Arrays.fill(count, 0);

        // 입력 문자열의 각 문자에 대한 빈도수 계산
        for(char alphabet : word.toCharArray()){
            count[alphabet - 'a']++; // 'a'를 빼서 인덱스로 변환 (a=0, b=1, ...)
        }

        // 빈도수 배열을 오름차순으로 정렬
        Arrays.sort(count);

        // 최소 푸시 횟수 계산
        int result = 0;
        for(int i = 0; i < 26; i++){
            // 빈도수가 높은 문자부터 처리 (뒤에서부터 접근)
            // i/8 + 1은 몇 번째 키 위치인지 계산 (첫 8개는 1번 누름, 다음 8개는 2번 누름, ...)
            result += count[26 - i - 1] * (i / 8 + 1);
        }

        // 총 푸시 횟수 반환
        return result;

    }

    public static void main(String[] args) {
        MinimumNumberOfPushesToTypeWordII obj = new MinimumNumberOfPushesToTypeWordII();
        System.out.println(obj.minimumPushes("abcde"));
        System.out.println(obj.minimumPushes("xyzxyzxyzxyz"));
        System.out.println(obj.minimumPushes("aabbccddeeffgghhiiiiii"));
    }

}
