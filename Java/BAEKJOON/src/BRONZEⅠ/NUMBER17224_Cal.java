package BRONZEⅠ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NUMBER17224_Cal {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int sub1, sub2;
        int easy = 0;
        int hard = 0;

        for(int i = 0; i <N; i++){
            st = new StringTokenizer(br.readLine());
            sub1 = Integer.parseInt(st.nextToken());
            sub2 = Integer.parseInt(st.nextToken());

            if (L >= sub2){
                hard++;
            } else if (L >= sub1) {
                easy++;
            }
        }

        // hard 문제
        int result = Math.min(K, hard) * 140;

        // easy 문제
        if(hard < K) {
            result += Math.min(K - hard, easy) * 100;
        }

        System.out.println(result);
    }
}
