package BRONZEⅠ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NUMBER14626 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String original = br.readLine();
        for (int i = 0; i <= 9; i++) {
            String ISBN = original.replace("*", String.valueOf(i));

            int sum = 0;
            for (int j = 0; j < 13; j++) {
                int digit = ISBN.charAt(j) - '0';
                sum += j % 2 == 0? digit : digit * 3;
            }

            if (sum % 10 == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
