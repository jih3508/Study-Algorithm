package BRONZEⅠ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NUMBER27961 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long N = Long.parseLong(br.readLine());
        int count = 0;

        if(N > 0){
            count = 1;
            Long K = 1l;
            while(K < N){
                K *= 2;
                count++;
            }
        }

        System.out.println(count);

    }
}
