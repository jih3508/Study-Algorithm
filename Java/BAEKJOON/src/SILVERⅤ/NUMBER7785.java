package SILVERⅤ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class NUMBER7785 {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        // 현재 회사에 있는 사람들의 이름을 저장할 HashSet
        Set<String> names = new HashSet<>();

        for (int i = 0; i < n; i++) {
            // 각 로그를 읽어서 이름과 상태(enter/leave)를 파싱
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();

            // "enter"면 사람을 회사에 추가, "leave"면 회사에서 제거
            if (st.nextToken().equals("enter")) {
                names.add(name);
            }else{
                names.remove(name);
            }
        }

        // 현재 회사에 있는 사람들을 역순(사전순 역순)으로 정렬하여 출력
        names.stream()
                .collect(Collectors.toList())
                .stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

    }
}
