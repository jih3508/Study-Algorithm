package SILVERⅤ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NUMBER24313 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a1 = Long.parseLong(st.nextToken());
        long a2 = Long.parseLong(st.nextToken());
        long c = Long.parseLong(br.readLine());
        long n0 = Long.parseLong(br.readLine());

        System.out.println((a1 * n0 + a2 <= c * n0) && a1 <= c? 1 : 0  );

    }
}
