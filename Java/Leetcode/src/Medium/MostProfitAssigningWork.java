package Medium;

// difficulty = [2,4,6,8,10], profit = [10,20,30,40,50], worker = [4,5,6,7]
// difficulty = [85,47,57], profit = [24,66,99], worker = [40,25,25]

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MostProfitAssigningWork {

    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {

        int size = difficulty.length;
        int[][] jobs = new int[size][2];
        for (int i = 0; i < size; i++) {
            jobs[i][0] = difficulty[i];
            jobs[i][1] = profit[i];
        }
        Arrays.sort(jobs, (a1, a2) -> a1[0] - a2[0]);

        size = profit.length;
        Arrays.sort(worker);
        int result = 0;
        int i = 0;
        int maxValue = 0;
        for(int work : worker){
           while(i < size && jobs[i][0] <= work){
               maxValue = Math.max(maxValue, jobs[i][1]);
               i++;
           }
           result += maxValue;
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
