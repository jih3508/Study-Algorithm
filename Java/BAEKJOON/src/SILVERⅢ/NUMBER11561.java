package SILVERⅢ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NUMBER11561 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    long T = Long.parseLong(br.readLine());
    for (int i = 0; i < T; i++) {
      long N = Long.parseLong(br.readLine());
      long start = 0;
      // 10 ^ 16승 부터 수열 합구하면 Long 타입 벗아나서 N보다 범위 좁혀야 한다.
      // 수열의 계산 따르면 답은 (2 * N) ^ 0.5 안에 있어서 end를 (2 * N) ^ 0.5로 한다.
      long end = (long) Math.sqrt((2*N + 1));
      long result = 0; // 결과를 저장하는 변수
      while (start <= end) {
        long mid = (start + end) / 2;
        // 이전 징검다리 이동한 수에서 최소 한칸더 움직인다면 N 수열의 합으로 체크 한다.
        long count = mid * (mid + 1) / 2;
        if(count <= N){
          start = mid + 1;
          // 이전 mid가 범위가 더 작아 질수 있으로 이전 result과 비교해서 최대 값을 넣는다.
          result = Math.max(result, mid);
        }else{
          end = mid - 1;
        }
      }

      System.out.println(result);
    }
  }

}
