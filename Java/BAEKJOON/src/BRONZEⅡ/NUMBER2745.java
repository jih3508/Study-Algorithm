package BRONZEⅡ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NUMBER2745 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String N = st.nextToken();
        int B  = Integer.parseInt(st.nextToken());

        // B로 진법 변환
        System.out.println(Integer.parseInt(N, B));

    }
}
