package SILVERⅢ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class NUMBER16165 {

    public static void main(String[] args) throws IOException {

        Map<String, List<String>> group = new HashMap<>(); // 아이돌 group
        Map<String, String> idol = new HashMap<>(); // 아이돌 소속

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int numberMember; // 인원 수
        String GroupName; // 아이돌 그룹 명
        String idolName; // 아이돌 이름

        // 아이돌 그룹 세팅 작업
        for (int i = 0; i < N; i++){
            GroupName = br.readLine();
            numberMember = Integer.parseInt(br.readLine());
            group.put(GroupName, new ArrayList<String>()); // 그룹 초기화
            for(int j = 0; j < numberMember; j++){
                idolName = br.readLine();
                group.get(GroupName).add(idolName); // 그룹 맴버 추가
                idol.put(idolName, GroupName); // 아이돌 소속 그룹 추가

            }
            group.get(GroupName).sort(Comparator.naturalOrder());
        }

        String keyword; // 퀴즈 제시어
        for(int i = 0; i < M; i++){
            keyword = br.readLine();
            // 1 일때 소속 그룹 출력 나머지는 그룹 맴버 출력
            if(br.readLine().equals("1")){
                System.out.println(idol.get(keyword));
            }else{
                group.get(keyword).stream().forEach(System.out::println);
            }
        }

    }
}
