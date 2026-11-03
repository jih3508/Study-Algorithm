package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Twins {

    // 남은 동전 합보다 엄격하게 큰 합을 만드는 최소 동전 개수를 출력한다.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] a = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
            sum += a[i];
        }

        // 큰 동전부터 가져가야 같은 합을 가장 적은 개수로 만들 수 있다
        Arrays.sort(a);

        int temp = 0;
        int count = 0;
        for (int i = n - 1; i >= 0; i--) {
            temp += a[i];
            count++;
            // 내 합 > 남은 합(sum - temp)을 정리한 식, 동률은 실패라 >를 쓴다
            if (temp * 2 > sum) {
                break;
            }
        }

        System.out.println(count);
    }
}