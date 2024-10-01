package Medium;

// difficulty = [2,4,6,8,10], profit = [10,20,30,40,50], worker = [4,5,6,7]
// difficulty = [85,47,57], profit = [24,66,99], worker = [40,25,25]

import java.util.Arrays;

public class MostProfitAssigningWork {

    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int result = 0; // 결과 반환할 변수
        try {
            int size = difficulty.length;
            // difficulty, profit 하나의 배열로 재 정의
            int[][] jobs = new int[size][2];
            for (int i = 0; i < size; i++) {
                jobs[i][0] = difficulty[i];
                jobs[i][1] = profit[i];
            }
            // difficulty 기준으로 정렬
            Arrays.sort(jobs, (a1, a2) -> a1[0] - a2[0]);

            size = profit.length;
            // worker  정렬
            Arrays.sort(worker);
            result = 0;
            int i = 0;
            int maxValue = 0; // 이전 profit보다 작을수 있어서 worker 들이 최대 받을수 있는 값을 저장 하기 위한 변수 이다.
            for(int work : worker){
                // two point
                // worker가 joibs 다 탐색 안하고 이전 탐색부터 시작해서 최대 할수 있는 난이도까지 간다.
                while(i < size && jobs[i][0] <= work){
                    // 만약 이전 난이도 보다 profit이 적을 수 있어서 이전 profit이랑 비교해서 현재 difficulty까지 최대 값을 저장한다.
                    maxValue = Math.max(maxValue, jobs[i][1]);
                    i++;
                }
                // 최대 할수 있는 작업 탐색 끝나면 worker가 최대 받을 수 있는 값을 추가 한다.
                result += maxValue;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return result;
    }

    public static void main(String[] args) {

        MostProfitAssigningWork obj = new MostProfitAssigningWork();
        int[] difficulty = {2,4,6,8,10} ;
        int[] profit = {10,20,30,40,50};
        int[] worker = {4,5,6,7};
        System.out.println(obj.maxProfitAssignment(difficulty, profit, worker)); // 100
        difficulty = new int[] {85,47,57} ;
        profit = new int[] {24,66,99};
        worker = new int[] {4,5,6,7};
        System.out.println(obj.maxProfitAssignment(difficulty, profit, worker)); // 0
        difficulty = new int[] {13,37,58};
        profit = new int[] {4,90,96};
        worker = new int[] {34,73,45};
        System.out.println(obj.maxProfitAssignment(difficulty, profit, worker)); // 190
        difficulty = new int[] {68,35,52,47,86} ;
        profit = new int[] {67,17,1,81,3};
        worker = new int[] {92,10,85,84,82};
        System.out.println(obj.maxProfitAssignment(difficulty, profit, worker));

    }
}
