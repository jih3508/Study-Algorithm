package BRONZEⅢ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/*
 * 알고리즘 수업 - 알고리즘의 수행 시간 3
 * url: https://www.acmicpc.net/problem/24264
 */
public class NUMBER24264 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        BigInteger n = new BigInteger(br.readLine());
        System.out.println(n.multiply(n));
        System.out.println(2);

    }
}
