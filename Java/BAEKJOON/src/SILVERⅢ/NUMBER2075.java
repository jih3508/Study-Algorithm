package SILVERⅢ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class NUMBER2075 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

        int N = Integer.parseInt(br.readLine());

        // 최소 힙(PriorityQueue) 생성 - 가장 작은 값이 루트에 위치
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        // 첫 번째 행의 N개 숫자를 힙에 추가
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int j = 0; j < N; j++) {
            heap.offer(Integer.parseInt(st.nextToken()));
        }

        // 나머지 N-1개 행을 처리
        for (int i = 0; i < N - 1; i++) {
            st = new StringTokenizer(br.readLine());  // 새로운 행 읽기
            for (int j = 0; j < N; j++) {
                // 새로운 숫자를 힙에 추가
                heap.offer(Integer.parseInt(st.nextToken()));
                // 힙에서 가장 작은 값(최솟값) 제거
                // 이렇게 하면 힙의 크기가 N을 유지하면서 가장 큰 N개의 값만 남게 됨
                heap.poll();
            }
        }

        // 힙의 루트(최솟값)가 전체에서 N번째로 큰 수가 됨
        System.out.println(heap.peek());
    }
}
