package SILVERⅣ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NUMBER2485 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

        int N = Integer.parseInt(br.readLine());

        int[] streetTrees = new int[N];

        for (int i = 0; i < N; i++) {
            streetTrees[i] = Integer.parseInt(br.readLine());
        }

        int[] difference = new int[N - 1];

        for (int i = 0; i < N - 1; i++) {
            difference[i] = Math.abs(streetTrees[i] - streetTrees[i + 1]);
        }

        int gcd = difference[0];
        int sum = gcd;
        int size = difference.length;

        for (int i = 1; i < N - 1; i++) {
            gcd = GCD(gcd, difference[i]);
            sum += difference[i];
        }

        System.out.println( (sum / gcd) - size);


    }

    public static int GCD(int x, int y) {
        int r;
        while(x % y != 0) {
            r = x % y;
            x = y;
            y = r;
        }

        return y;
    }
}
