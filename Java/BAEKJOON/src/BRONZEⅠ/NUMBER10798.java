package BRONZEⅠ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class NUMBER10798 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        // 2차원 리스트 생성 (세로로 읽은 문자들을 저장할 리스트)
        List<List<String>> str = new ArrayList<>();
        str.add(new ArrayList<>());   // 첫 번째 열을 위한 리스트 초기화

        // 5줄의 입력을 처리
        for (int i = 0; i < 5; i++) {
            String line = br.readLine();   // 한 줄 읽기

            // 각 줄의 문자를 세로로 저장
            for (int j = 0; j < line.length(); j++) {
                // 필요한 경우 새로운 열(리스트) 추가
                if(str.size() < (j + 1)) {
                    str.add(new ArrayList<>());
                }
                // j번째 열에 현재 문자 추가
                str.get(j).add(String.valueOf(line.charAt(j)));
            }
        }

        // 결과를 저장할 StringBuilder 생성
        StringBuilder sb = new StringBuilder();

        // 모든 열(세로로 읽은 문자들)을 순서대로 연결
        for (int i = 0; i < str.size(); i++) {
            // 각 열의 문자들을 공백 없이 연결하여 StringBuilder에 추가
            sb.append(String.join("", str.get(i)));
        }

        System.out.println(sb.toString());

    }
}
