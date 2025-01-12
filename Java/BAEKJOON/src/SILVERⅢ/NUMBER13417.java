package SILVERⅢ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class NUMBER13417 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++){
            int N = Integer.parseInt(br.readLine());
            Deque<Character> deque = new ArrayDeque<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            deque.add(st.nextToken().charAt(0));
            for (int j = 0; j < N - 1; j++) {
                char alpha = st.nextToken().charAt(0);
                // 문자 크기 비교
                // Character에서 덧쌤 뺄샘 할때 ASCII 코드 값으로 변환 해서 계산
                // 두 문자 뺄쌤해서 0이하이면 크기가 작으므로 앞에 붙인다.
                if(alpha - deque.peekFirst() <= 0){
                    deque.addFirst(alpha);
                }else{
                    deque.addLast(alpha);
                }
            }
            StringBuilder sb = new StringBuilder();
            deque.stream().forEach(data -> sb.append(data));
            System.out.println(sb.toString());
        }

    }
}
