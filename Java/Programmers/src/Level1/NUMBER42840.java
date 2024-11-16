package Level1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NUMBER42840 {

    public int[] solution(int[] answers) {
        List<Integer> result = new ArrayList<>();
        int size = answers.length;

        // 1번, 2번, 3번 학생의 답안지
        int[] number1 = {1, 2, 3, 4, 5};
        int[] number2 = {2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5};
        int[] number3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        // 1번, 2번, 3번 학생의 정답의 개수
        int[] count = { 0, 0, 0};

        // 맞은 개수
        for (int i = 0; i < size; i++) {
            count[0] += number1[i % number1.length] == answers[i] ? 1 : 0;
            count[1] += number2[i % number2.length] == answers[i] ? 1 : 0;
            count[2] += number3[i % number3.length] == answers[i] ? 1 : 0;
        }

        // 1,2 3 번에서 많이 맞은 개수 구하기
        int maxValue = Arrays.stream(count).max().getAsInt();

        // 많이 맞은 개수인 사람 구하기
        for (int i = 0; i < 3; i++) {
            if(count[i] == maxValue){
                result.add(i + 1);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) throws IOException {
        NUMBER42840 solution = new NUMBER42840();
        int[] answer = {1,2,3,4,5};
        System.out.println(Arrays.toString(solution.solution(answer)));
        answer = new int[] {1,3,2,4,2};
        System.out.println(Arrays.toString(solution.solution(answer)));
    }
}
