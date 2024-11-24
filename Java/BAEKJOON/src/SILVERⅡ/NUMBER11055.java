package SILVERⅡ;

import java.io.*;
import java.util.*;
public class NUMBER11055 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] dp = new int[N];
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
            dp[i] = A[i];
        }

        for (int i = 1; i < N; i++) {
            for (int j = 0; j < i; j++) {
                // 이전 값들과 비교해서 큰 값이면 이전 저장 되는 것과 수열 개수 비교
                if(A[i] > A[j]){
                    dp[i] = Math.max(dp[i], A[i] + dp[j]);
                }
            }
        }

        // dp 배열중 가장 길게 저장 된 결과 값을 가져온다.
        System.out.println(Arrays.stream(dp).max().getAsInt());

    }
}
