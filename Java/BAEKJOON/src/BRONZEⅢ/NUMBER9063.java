package BRONZEⅢ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
 * 대지
 * url: https://www.acmicpc.net/problem/9063
 */
public class NUMBER9063 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        int N = Integer.parseInt(br.readLine());

        // 모든 옥구슬 위치 중에서 x, y 좌표의 최솟값과 최댓값을 찾기 위한 변수들
        int minX = Integer.MAX_VALUE;  // x좌표의 최솟값 (서쪽 경계)
        int minY = Integer.MAX_VALUE;  // y좌표의 최솟값 (남쪽 경계)

        int maxX = Integer.MIN_VALUE;  // x좌표의 최댓값 (동쪽 경계)
        int maxY = Integer.MIN_VALUE;  // y좌표의 최댓값 (북쪽 경계)

        // N개의 옥구슬 위치를 하나씩 입력받아 처리
        for (int i = 0; i < N; i++) {
            int[] locations = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int x = locations[0];
            int y = locations[1];

            // 현재 점의 x좌표와 지금까지의 최솟값을 비교하여 더 작은 값으로 갱신
            minX = Math.min(minX, x);
            // 현재 점의 y좌표와 지금까지의 최솟값을 비교하여 더 작은 값으로 갱신
            minY = Math.min(minY, y);
            // 현재 점의 x좌표와 지금까지의 최댓값을 비교하여 더 큰 값으로 갱신
            maxX = Math.max(maxX, x);
            // 현재 점의 y좌표와 지금까지의 최댓값을 비교하여 더 큰 값으로 갱신
            maxY = Math.max(maxY, y);
        }

        // 모든 옥구슬을 포함하는 가장 작은 직사각형의 넓이 계산
        // 넓이 = 가로 × 세로
        System.out.println((maxX - minX) * (maxY - minY));
    }
}
