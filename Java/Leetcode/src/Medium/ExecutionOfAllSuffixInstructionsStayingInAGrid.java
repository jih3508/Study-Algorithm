package Medium;

import java.util.Arrays;

public class ExecutionOfAllSuffixInstructionsStayingInAGrid {

    public int[] executeInstructions(int n, int[] startPos, String s) {

        int size = s.length(); // 명령 문자열의 길이
        int[] counts = new int[size]; // 결과 배열 초기화

        for (int i = 0; i < size; i++) {

            // 현재 명령의 시작점부터 끝까지 명령을 슬라이싱
            String moveStr = s.substring(i,size);
            int x = startPos[0]; // 로봇의 현재 x 위치
            int y = startPos[1]; // 로봇의 현재 y 위치
            int count = 0; // 실행 가능한 명령의 개수

            for (int j = 0; j < moveStr.length(); j++) {
                int fx = x; // 이동 후의 x 위치
                int fy = y; // 이동 후의 y 위치

                // 현재 명령에 따라 위치 계산
                switch (moveStr.charAt(j)) {
                    case 'L': // 왼쪽으로 이동
                        fy = y - 1;
                        break;
                    case 'R': // 오른쪽으로 이동
                        fy = y + 1;
                        break;
                    case 'U': // 위로 이동
                        fx = x - 1;
                        break;
                    case 'D': // 아래로 이동
                        fx = x + 1;
                        break;
                }

                // 이동 후 위치가 격자 내에 있는지 확인
                if(0 <= fx && fx < n && 0 <= fy && fy < n){
                    // 현재 위칭 갱신
                    x = fx;
                    y = fy;
                    count++; // 실행 가능한 명령 개수 증가
                // 격자를 벗어나면 명령 실행 중단
                }else{
                    break;
                }

            }
            counts[i] = count;
        }
        return counts;
    }

    public static void main(String[] args) {
        ExecutionOfAllSuffixInstructionsStayingInAGrid obj = new ExecutionOfAllSuffixInstructionsStayingInAGrid();

        System.out.println(Arrays.toString(obj.executeInstructions(3, new int[] {0, 1},"RRDDLU")));
        System.out.println(Arrays.toString(obj.executeInstructions(2, new int[] {1, 1},"LURD")));
        System.out.println(Arrays.toString(obj.executeInstructions(1, new int[] {0, 0},"LRUD")));
    }

}
