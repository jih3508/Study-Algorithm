package SILVERⅣ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NUMBER2485 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] positions = new int[n];

        for (int i = 0; i < n; i++) {
            positions[i] = Integer.parseInt(br.readLine());
        }

        // 연속된 가로수들 사이의 거리 계산
        int[] gaps = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            gaps[i] = Math.abs(positions[i + 1] - positions[i]);
        }

        // 모든 간격의 최대공약수 계산
        int gcd = gaps[0];
        int totalDistance = gaps[0];

        for (int i = 1; i < gaps.length; i++) {
            gcd = GCD(gcd, gaps[i]);
            totalDistance += gaps[i];
        }

        // 필요한 가로수 개수 = (총 거리 / 최소 간격) - 기존 간격 개수
        System.out.println((totalDistance / gcd) - gaps.length);

        br.close();


    }

    public static int GCD(int x, int y) {
        int r;
        while(x % y != 0) {
            r = x % y;
            x = y;
            y = r;
        }

        return y;
    }
}
