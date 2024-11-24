package SILVERⅡ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NUMBER11722 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[N];
        // 모든 dp 배열 1로 초기화
        Arrays.fill(dp, 1);
        for (int i = 1; i < N; i++) {
            for (int j = 0; j < i; j++) {
                // 이전 값들과 비교해서 큰 값이면 이전 저장 되는 것과 수열 개수 비교
                if(nums[i] < nums[j]){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        // dp 배열중 가장 길게 저장 된 결과 값을 가져온다.
        System.out.println(Arrays.stream(dp).max().getAsInt());

    }
}
