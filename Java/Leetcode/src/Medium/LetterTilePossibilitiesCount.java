package Medium;

public class LetterTilePossibilitiesCount {

    /**
     * 타일 문제 해결을 위한 클래스 - 빈도수 카운팅 방식
     * 문자의 빈도수를 이용해서 가능한 시퀀스의 개수를 계산합니다.
     * 이 방식은 중복 문자를 효율적으로 처리하고 HashSet을 사용하지 않아도 됩니다.
     */

    int result; // 가능한 시퀀스의 총 개수를 저장하는 변수

    public int numTilePossibilities(String tiles) {

        this.result = 0; // 결과 카운터 초기화

        // 각 알파벳 문자의 빈도수를 저장하는 배열 (A-Z: 26개)
        int[] count = new int[26];

        // 입력된 타일의 각 문자 빈도수를 계산
        for(char c : tiles.toCharArray()) {
            count[c - 'A']++; // 'A'를 0번 인덱스로 하는 문자 카운팅
        }

        // 빈도수 배열을 바탕으로 가능한 시퀀스 개수 계산
        counter(count);

        return this.result;
    }

    /**
     * 재귀적으로 가능한 모든 문자열 시퀀스의 개수를 계산
     * 각 문자를 하나씩 선택하여 시퀀스를 만들고, 만들어진 시퀀스마다 카운트를 증가시킵니다.
     *
     * @param count 각 알파벳 문자의 현재 사용 가능한 개수를 나타내는 배열
     */
    public void counter(int[] count){

        // 26개의 알파벳을 모두 확인 (A-Z)
        for (int i = 0; i < 26; i++){

            // 현재 문자(i번째 알파벳)가 사용 가능한 경우 (개수가 0보다 큰 경우)
            if (count[i] > 0){
                count[i]--; // 해당 문자를 하나 사용 (빈도수 감소)
                this.result++; // 새로운 시퀀스가 만들어졌으므로 결과 카운트 증가

                // 현재 문자를 사용한 상태에서 더 긴 시퀀스를 만들기 위해 재귀 호출
                counter(count);

                // 백트래킹: 해당 문자의 사용을 되돌림 (빈도수 복원)
                count[i]++;
            }
        }
    }

    public static void main(String[] args) {
        LetterTilePossibilitiesCount obj = new LetterTilePossibilitiesCount();
        System.out.println(obj.numTilePossibilities("AAB"));
        System.out.println(obj.numTilePossibilities("AAABBC"));
        System.out.println(obj.numTilePossibilities("V"));
    }
}
