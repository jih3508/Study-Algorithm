package BRONZEⅢ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NUMBER2903 {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        long N = Long.parseLong(br.readLine());

        System.out.println((long)Math.pow(Math.pow(2, N) + 1, 2));
    }
}
