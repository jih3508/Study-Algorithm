package BRONZEⅢ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NUMBER30802 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        double S = Double.parseDouble(st.nextToken());
        double M = Double.parseDouble(st.nextToken());
        double L = Double.parseDouble(st.nextToken());
        double XL = Double.parseDouble(st.nextToken());
        double XXL = Double.parseDouble(st.nextToken());
        double XXXL = Double.parseDouble(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int P =Integer.parseInt(st.nextToken());

        System.out.println((int) (Math.ceil(S / T)
                + Math.ceil(M / T)
                + Math.ceil(L / T)
                + Math.ceil(XL / T)
                + Math.ceil(XXL / T)
                + Math.ceil(XXXL / T)));

        System.out.println(String.format("%d %d", N / P, N % P));

    }
}
