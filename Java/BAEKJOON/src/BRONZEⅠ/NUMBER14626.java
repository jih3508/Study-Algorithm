package BRONZEⅠ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NUMBER14626 {

    /**
     * ISBN-13 체크기호 복원 문제
     * - 홀수 자리(1,3,5...): × 1, 짝수 자리(2,4,6...): × 3
     * - 가중합이 10의 배수가 되는 숫자를 찾아 출력
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String original = br.readLine(); // 손상된 ISBN 입력 (예: 9788968322*73)

        for (int i = 0; i <= 9; i++) {
            // '*'를 0~9 숫자로 순서대로 대체
            String ISBN = original.replace("*", String.valueOf(i));

            // ISBN-13 가중합 계산
            // 인덱스 기준: 짝수 인덱스(0,2,4...) × 1, 홀수 인덱스(1,3,5...) × 3
            int sum = 0;
            for (int j = 0; j < 13; j++) {
                int digit = ISBN.charAt(j) - '0'; // 문자 → 숫자 변환
                sum += (j % 2 == 0) ? digit : digit * 3;
            }

            // 가중합이 10의 배수이면 유효한 ISBN → 해당 숫자 출력 후 종료
            if (sum % 10 == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
