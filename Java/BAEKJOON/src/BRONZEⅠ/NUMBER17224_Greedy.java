package BRONZEⅠ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class NUMBER17224_Greedy {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int sub1, sub2;

        int[][] tests = new int[N][2];
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            sub1 = Integer.parseInt(st.nextToken());
            sub2 = Integer.parseInt(st.nextToken());
            tests[i][0] = sub1;
            tests[i][1] = sub2;
        }

        //배열 어려문제 위주로 오름 차순 정렬
        Arrays.sort(tests, Comparator.comparing((int[] test) -> test[1]));

        int result = 0; // 결과 값 변수
        // 문제 풀때 마다 최대 문제 푸는 수를 차감한다.
        for(int[] test: tests){
            // 최대 풀수 있는 문제가 초과 되면 반복문에서 빠져 나온다.
            if(K == 0) break;
                // 어려운 문제 풀수 있는 경우
            else if(L >= test[1]){
                result += 140;
                K--;
                // 어려운 문제를 못풀 경우 쉬운 문제 풀 수 있는 경우
            }else if(L >= test[0]){
                result += 100;
                K--;
            }
        }

        System.out.println(result);
    }
}
