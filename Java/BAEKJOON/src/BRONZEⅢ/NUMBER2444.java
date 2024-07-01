package BRONZEⅢ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NUMBER2444 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        // 증가 영역
        for(int i = 0; i < N ; i++){
            for(int j = 0; j < N - i - 1; j++){
                sb.append(" ");
            }


            for(int j = 0; j < (i * 2 + 1); j++){
                sb.append("*");
            }
            sb.append("\n");
        }

        // 감소 영역
        for(int i = N - 2; i >=  0; i--){
            for(int j = 0; j < Math.abs(N - i - 1); j++){
                sb.append(" ");
            }


            for(int j = 0; j < (i * 2 + 1); j++){
                sb.append("*");
            }
            sb.append("\n");
        }


        System.out.println(sb.toString());
    }
}
