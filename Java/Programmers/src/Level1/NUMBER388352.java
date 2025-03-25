package Level1;

import java.util.*;

/*
 * 비밀 코드 해독
 * https://school.programmers.co.kr/learn/courses/30/lessons/388352
 */

public class NUMBER388352 {

    int size; // 입력한 정수 개수
    int result; // 가능한 비밀 코드 개수
    int n;
    int[][] q;
    int[] ans;

    public int solution(int n, int[][] q, int[] ans) {
        // init
        this.size = ans.length;
        this.n = n;
        this.q = q;
        this.ans = ans;
        this.result = 0;

        recursive(1, new HashSet<>());
        return this.result;
    }

    public void recursive(int index, Set<Integer> arr){
        // 비밀코드 5개 만들었을때
        if(arr.size() == 5){
            boolean flag = true; // 전체 입력한 정수와 일치한 개수가 맞는지 확인 하는 변수
            for(int i = 0; i < this.size; i++){
                int count = 0;
                for(int j = 0; j < 5; j++){
                    count += arr.contains(this.q[i][j])? 1:0;
                }

                // 비밀 코드하고 q[i]번째와 ans[i]개수와 일치 하지 않않으면 바로 종료
                if(count != this.ans[i]){
                    flag = false;
                    break;
                }
            }

            // 전체 탐색 했을때 모두다 일치 했을때
            if(flag){
                this.result++;
            }
            return;
        }else{
            // 오름 차순으로 이전 저장 한것 +1 부터 해서 n까지 하나씩 집어 넣음
            for(int i = index; i <= this.n; i++){
                arr.add(i);
                recursive(i + 1, arr);
                arr.remove(i);
            }
        }
    }

    public static void main(String[] args) {
        NUMBER388352 obj = new NUMBER388352();
        int[][] q = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {3, 7, 8, 9, 10}, {2, 5, 7, 9, 10}, {3, 4, 5, 6, 7}};
        int[] ans = {2, 3, 4, 3, 3};
        System.out.println(obj.solution(10, q, ans));

        q = new int[][] {{2, 3, 9, 12, 13}, {1, 4, 6, 7, 9}, {1, 2, 8, 10, 12}, {6, 7, 11, 13, 15}, {1, 4, 10, 11, 14}};
        ans = new int[] {2, 1, 3, 0, 1};
        System.out.println(obj.solution(15, q, ans));

    }
}
