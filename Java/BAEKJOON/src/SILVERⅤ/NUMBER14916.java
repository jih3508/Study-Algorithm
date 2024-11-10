package SILVERⅤ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NUMBER14916 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer N = Integer.parseInt(br.readLine());
        int count = 0;

        while (N > 0){
            if(N % 5 == 0){
                count += N / 5;
                break;
            }else{
                count++;
                N -= 2;
            }
        }

        System.out.println(N >= 0? count : -1);
    }
}
