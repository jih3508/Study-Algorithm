package BRONZEⅢ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NUMBER14215 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] lengths = new int[st.countTokens()];
        for (int i = 0; i < lengths.length; i++) {
            lengths[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(lengths);

        if(lengths[0] + lengths[1] > lengths[2]){
            System.out.println(lengths[0] + lengths[1] + lengths[2]);
        }else{
            System.out.println((lengths[0] + lengths[1]) * 2 - 1);
        }

    }
}
