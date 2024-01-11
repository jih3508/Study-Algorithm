package SILVERⅣ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NUMBER18110 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int trimmedNum = (int) Math.round((float) N * 0.15); // 절사 평균 기준 값

        int[] solved = new int[N];

        for(int i = 0; i < N; i ++){
            solved[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(solved);

        float sum = 0;

        for(int i = trimmedNum; i < N - trimmedNum; i ++){
            sum += solved[i];
        }

        System.out.println( Math.round(sum / (float) (N - trimmedNum * 2) ));

    }
}
