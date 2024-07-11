package Level2;

import java.util.StringTokenizer;

public class NUMBER12939 {

    public String solution(String s) {
        StringTokenizer st = new StringTokenizer(s);
        int maxNum = Integer.MIN_VALUE; // 최대값 저장할 변수
        int minNum = Integer.MAX_VALUE; // 최소값 저장할 변수

        /*
         * 끝에 숫자가 없을때까지 진행
         */
        while(st.hasMoreTokens()){
            int num = Integer.parseInt(st.nextToken());
            maxNum = Math.max(maxNum, num);
            minNum = Math.min(minNum, num);
        }

        return String.format("%d %d", minNum, maxNum);
    }

    public static void main(String[] args) {

        NUMBER12939 obj = new NUMBER12939();
        System.out.println(obj.solution("1 2 3 4"));
        System.out.println(obj.solution("-1 -2 -3 -4"));
        System.out.println(obj.solution("-1 -1"));

    }
}
