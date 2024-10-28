package SILVERⅢ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NUMBER1072 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 범위가 Integer 넘어서 Long 타입으로 해야함
        long X = Long.parseLong(st.nextToken());
        long Y = Long.parseLong(st.nextToken());
        long Z = Y * 100 / X;

        long start = 0;
        long end = X;

        long nowRate; // 이긴 횟수 증가후 승률
        long result = X;// 결과
        // 이분탐색
        // 확율 올라가는것이 최소 될때까지 탐색
        while (start <= end) {
            long mid = (start + end) / 2;
            nowRate = (Y + mid) * 100 / (X + mid);
            // nowRate가 Z보다 크면 end값을 줄인다.
            if(nowRate > Z){
                end = mid - 1;
                result = mid;
            }else{
                start = mid + 1;
            }
            //System.out.println("Start: " + start + ", End: " + end + ", MID: " + mid + ", Rate: " + nowRate);
        }
        // Z가 99퍼이면 더이상 올라갈수 없음
        System.out.println(Z >= 99? -1 : result);
    }
}
