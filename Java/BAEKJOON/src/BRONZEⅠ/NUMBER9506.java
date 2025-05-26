package BRONZEⅠ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NUMBER9506 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        int N;

        // -1이 입력될 때까지 반복
        while(true){
            // 한 줄씩 정수를 읽어옴
            N = Integer.parseInt(br.readLine());

            // -1이면 입력 종료
            if(N == -1) break;

            // N의 약수들을 저장할 리스트 (자신 제외)
            List<Integer> numbers = new ArrayList<>();

            // 1부터 N/2까지 반복하여 약수를 찾음
            // N/2를 넘는 수는 N의 약수가 될 수 없음 (N 자신 제외)
            for (int i = 1; i <= N / 2; i++) {
                // i가 N의 약수인지 확인 (나머지가 0이면 약수)
                if (N % i == 0) {
                    numbers.add(i);
                }
            }

            // 약수들의 합을 계산 (Stream의 reduce 사용)
            int hap = numbers.stream().reduce(0, (x, y) -> x + y);

            // 완전수 여부에 따라 출력 형식 결정
            // N과 약수들의 합이 같으면 완전수
            System.out.println(N + (N == hap?
                    // 완전수인 경우: "N = 약수1 + 약수2 + ..." 형태로 출력
                    " = " + String.join(" + ", numbers.stream()
                            .map(String::valueOf)  // 정수를 문자열로 변환
                            .collect(Collectors.toList()))
                    // 완전수가 아닌 경우
                    : " is NOT perfect."));
        }
    }
}
