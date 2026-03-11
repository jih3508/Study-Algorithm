package BRONZEⅤ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NUMBER30214 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

        StringTokenizer st = new StringTokenizer(br.readLine());

        float S1 = Float.parseFloat(st.nextToken());
        float S2 = Float.parseFloat(st.nextToken());

        System.out.println(S1 >= (S2 / 2)? "E" : "H");

    }
}
