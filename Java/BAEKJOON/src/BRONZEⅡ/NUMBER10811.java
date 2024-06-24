package BRONZEⅡ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class NUMBER10811 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] array = new int[N];

        // 1 ~ 5까지 값 채움
        for(int i = 1; i <= N; i++){
            array[i - 1] = i;
        }

        int i, j;
        int[] tmp; // 임시로 담을 배열
        for(int k = 0; k < M; k++){
            st = new StringTokenizer(br.readLine());
            i = Integer.parseInt(st.nextToken()) - 1;
            j = Integer.parseInt(st.nextToken()) - 1;
            tmp = new int[j - i + 1];

            // 역순 데이터 담기
            for(int x = j; x >= i; x--){
                tmp[j - x] = array[x];
            }

            // 역순 데이터 변경
            for(int x = 0; x <= (j - i); x++){
                array[x + i] = tmp[x];
            }
        }

        System.out.println(Arrays.stream(array).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
    }

}
