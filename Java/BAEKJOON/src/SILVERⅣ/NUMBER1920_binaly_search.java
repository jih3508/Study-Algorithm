package SILVERⅣ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NUMBER1920_binaly_search {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // A 배열 선언
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A);

        // M개의 배열 선언
        int M = Integer.parseInt(br.readLine());
        int[] array = new int[M];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        int start, end, mid; // 시작점, 끝점, 중간점 변수
        int isInNum; // A 배열안에 존재하는지 확인 하는 변수

        for(int num : array) {
            // 이분탐색전 초기 설정
            start = 0;
            end = N - 1;
            isInNum = 0;

            // 이분 탐색
            while(start <= end) {
                mid = (start + end) / 2; // 중간값 계산

                // 찾을 경우 true로 변환하고 탐색 종
                if (A[mid] == num) {
                    isInNum =  1;
                    break;
                }else if(A[mid] < num) {
                    start = mid + 1;
                }else {
                    end = mid - 1;
                }
            }
            System.out.println(isInNum);
        }

    }
}
