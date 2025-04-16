package SILVERⅤ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.StringTokenizer;

public class NUMBER25206 {

    // 등급에 따른 과목평점 정의
    static Map<String, Float> grades = Map.of(
            "A+", 4.5f,
            "A0", 4.0f,
            "B+", 3.5f,
            "B0", 3.0f,
            "C+", 2.5f,
            "C0", 2.0f,
            "D+", 1.5f,
            "D0", 1.0f,
            "F", 0.0f
    );

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

        float sum = 0; // (학점 × 과목평점)의 총합을 저장할 변수
        float avg = 0; // 총 학점을 저장할 변수

        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();
            float credit = Float.parseFloat(st.nextToken()); // 학점
            String grade = st.nextToken(); // 등급

            // P/F 과목 중 P인 경우 계산에서 제외
            if(!grade.equals("P")){
                sum += credit * grades.get(grade);
                avg += credit;
            }

        }

        // 전공평점 계산 = (학점 × 과목평점)의 총합 / 총 학점
        System.out.println(sum / avg);

    }
}
