package SILVERⅤ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 최소공배수
 * url: https://www.acmicpc.net/problem/13241
 */
public class NUMBER13241 {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Integer.parseInt(st.nextToken());
        long B = Integer.parseInt(st.nextToken());

        System.out.println(LCM(A,B));

    }

    public static long GCD(long x, long y) {
        long r;
        while(x % y != 0) {
            r = x  % y;
            x = y;
            y = r;
        }
        return y;
    }

    public static long LCM(long x, long y) {
        return x * y / GCD(x, y);
    }
}
