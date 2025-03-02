package Level1;

import java.util.*;
/*
 * 개인정보 수집 유효기간
 * https://school.programmers.co.kr/learn/courses/30/lessons/150370
 */
public class NUMBER150370 {

    public int[] solution(String today, String[] terms, String[] privacies) {

        Map<String, Long> termInfo = new HashMap<>();

        // 약관 정보 저장
        Arrays.stream(terms).forEach(term -> {
            String[] data = term.split(" ");
            termInfo.put(data[0], Long.parseLong(data[1]));
        });

        // 오늘 날짜를 일수로 변환
        long todayToDay = dateToDays(today);
        int size = privacies.length;
        List<Integer> answer = new LinkedList<>();

        for (int i = 0; i < size; i++) {
            String[] data = privacies[i].split(" ");
            long days = dateToDays(data[0]) + termInfo.get(data[1]) * 28l;
            // 약관이 오늘까지 이면 answer에 추가
            if(todayToDay >= days){
                answer.add(i + 1);
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    /*
     * 일자를 일자로 변환
     * year * 12 * 28 + month * 28 + day
     */
    public long dateToDays(String date){
        String[] arrayDate = date.split("\\.");
        long year = Long.parseLong(arrayDate[0]);
        long month = Long.parseLong(arrayDate[1]);
        long day = Long.parseLong(arrayDate[2]);

        return( year * 12l * 28l) + (month * 28l) + day;
    }

    public static void main(String[] args) {
        NUMBER150370 obj = new NUMBER150370();
        String today = "2022.05.19";
        String[] terms = new String[] {"A 6", "B 12", "C 3"};
        String[] privacies = new String[] {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        System.out.println(Arrays.toString(obj.solution(today, terms, privacies)));
        today = "2020.01.01";
        terms = new String[] {"Z 3", "D 5"};
        privacies = new String[] {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};
        System.out.println(Arrays.toString(obj.solution(today, terms, privacies)));
    }
}
