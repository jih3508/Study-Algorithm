package SILVERⅣ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NUMBER4134 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수 입력

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            long N = Long.parseLong(br.readLine());
            sb.append(nextPrime(N)).append("\n"); // 결과를 StringBuilder에 누적
        }

        // 출력은 마지막에 한 번만 (System.out.println 반복 호출 대신 성능 개선)
        System.out.print(sb);
    }

    /**
     * N 이상의 소수 중 가장 작은 소수를 반환한다.
     * 소수 판별: 2부터 sqrt(N)까지 나누어 떨어지는 수가 없으면 소수
     */
    public static long nextPrime(long N) {
        // 0, 1은 소수가 아니므로 가장 작은 소수인 2 반환
        if (N <= 1) return 2;

        while (true) {
            if (isPrime(N)) return N;
            N++;
        }
    }

    /**
     * N이 소수인지 판별한다.
     * 기존 코드에서 소수 판별 로직을 별도 메서드로 분리 (단일 책임 원칙)
     */
    private static boolean isPrime(long N) {
        for (long i = 2; i <= Math.sqrt(N); i++) {
            if (N % i == 0) return false;
        }
        return true;
    }
}
