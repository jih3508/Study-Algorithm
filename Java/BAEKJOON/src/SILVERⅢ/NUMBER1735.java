package SILVERⅢ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NUMBER1735 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 첫 번째 분수 A1/B1 입력 받기
        int a1 = Integer.parseInt(st.nextToken()); // 첫 번째 분수의 분자
        int b1 = Integer.parseInt(st.nextToken()); // 첫 번째 분수의 분모

        // 두 번째 분수 A2/B2 입력 받기
        st = new StringTokenizer(br.readLine());
        int a2 = Integer.parseInt(st.nextToken()); // 두 번째 분수의 분자
        int b2 = Integer.parseInt(st.nextToken()); // 두 번째 분수의 분모

        // 두 분수의 합 계산
        // A1/B1 + A2/B2 = (A1*B2 + A2*B1) / (B1*B2)
        int a3 = a1 * b2 + a2 * b1; // 합의 분자
        int b3 = b1 * b2;            // 합의 분모

        // 기약분수로 만들기 위해 최대공약수(GCD) 구하기
        int gcd = GCD(a3, b3);

        // 분자와 분모를 최대공약수로 나누어 기약분수 출력
        System.out.println(String.format("%d %d", a3 / gcd, b3 / gcd));

    }

    /**
     * 유클리드 호제법을 이용한 최대공약수(GCD) 계산
     * @param x 첫 번째 수
     * @param y 두 번째 수
     * @return x와 y의 최대공약수
     */
    public static int GCD(int x, int y) {
        int r;
        while(x % y != 0 && y != 0) {
            r = x  % y;
            x = y;
            y = r;
        }
        return y;
    }
}
