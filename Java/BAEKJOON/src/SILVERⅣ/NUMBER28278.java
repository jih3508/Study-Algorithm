package SILVERⅣ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class NUMBER28278 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>(); // 스택 초기화

        StringBuilder log = new StringBuilder(); // 결과 출력
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch (st.nextToken()){
                // 정수 X를 스택에 넣는다.
                case "1":
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                // 스택에 정수가 있다면 맨 위의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
                case "2":
                    log.append(stack.isEmpty()? -1 : stack.pop()).append("\n");
                    break;
                // 스택에 들어있는 정수의 개수를 출력한다
                case "3":
                    log.append(stack.size()).append("\n");
                    break;
                // 스택이 비어있으면 1, 아니면 0을 출력한다.
                case "4":
                    log.append(stack.isEmpty()? 1 : 0).append("\n");
                    break;
                // 스택에 정수가 있다면 맨 위의 정수를 출력한다. 없다면 -1을 대신 출력한다.
                case "5":
                    log.append(stack.isEmpty()? -1 : stack.peek()).append("\n");
                    break;
            }
        }

        System.out.println(log.toString());

    }
}
