package SILVERⅣ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class NUMBER1920_Map {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Map<Integer, Integer> A = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            A.put(Integer.parseInt(st.nextToken()), 1);
        }

        // M개의 배열 선언
        int M = Integer.parseInt(br.readLine());
        int[] array = new int[M];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        for(int num : array){
            System.out.println(A.getOrDefault(num, 0));
        }

    }
}
