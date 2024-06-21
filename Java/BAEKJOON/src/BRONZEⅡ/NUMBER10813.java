package BRONZEⅡ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class NUMBER10813 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] basket = new int[N];
        for(int i = 1; i <= N; i++){
            basket[i - 1] = i;
        }

        int i, j, tmp;
        for(int m = 0; m < M; m++){
            st = new StringTokenizer(br.readLine());
            i = Integer.parseInt(st.nextToken()) - 1;
            j = Integer.parseInt(st.nextToken()) - 1;
            tmp = basket[i];
            basket[i] = basket[j];
            basket[j] = tmp;
        }

        System.out.println(Arrays.stream(basket)
                                 .mapToObj(String::valueOf)
                                 .collect(Collectors.joining(" ")));

    }
}
