package BRONZEⅢ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NUMBER13225 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

        int C = Integer.parseInt(br.readLine());

        for (int i = 0; i < C; i++) {
            int N = Integer.parseInt(br.readLine());

            int result = 0;

            for (int num = 1; num <= Math.sqrt(N); num++) {
                if(N % num == 0){
                    result += num != N / num ? 2 : 1;
                }

            }

            System.out.println(String.format("%d %d", N, result));
        }

    }
}
