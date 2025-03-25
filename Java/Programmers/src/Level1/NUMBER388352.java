package Level1;

import java.util.*;

public class NUMBER388352 {

    int size;
    int result;
    int n;
    int[][] q;
    int[] ans;

    public int solution(int n, int[][] q, int[] ans) {
        this.size = ans.length;
        this.n = n;
        this.q = q;
        this.ans = ans;
        this.result = 0;

        recursive(1, new HashSet<>());
        return this.result;
    }

    public void recursive(int index, Set<Integer> arr){

        if(arr.size() == 5){
            boolean flag = true;
            for(int i = 0; i < this.size; i++){
                int count = 0;
                for(int j = 0; j < 5; j++){
                    count += arr.contains(this.q[i][j])? 1:0;
                }

                if(count != this.ans[i]){
                    flag = false;
                    break;
                }
            }

            if(flag){
                this.result++;
            }
            return;
        }else{
            for(int i = index; i < this.n; i++){
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
