package Medium;


import java.util.HashMap;
import java.util.Map;

public class MinimumAmountOfTimeToCollectGarbage {

    public int garbageCollection(String[] garbage, int[] travel) {

        // 각 쓰레기 유형(M, P, G)의 마지막 위치를 저장하는 Map
        Map<Character, Integer> lastInfo = new HashMap<>();
        int totalTime = 0;

        // 쓰레기 정보를 순회하며 총 쓰레기 수를 계산하고 마지막 위치 갱신
        for (int i = 0; i < garbage.length; i++) {
            String garbages = garbage[i];
            totalTime += garbages.length(); // 쓰레기 수 추가
            for (char g : garbages.toCharArray()) {
                lastInfo.put(g, i); // 쓰레기의 마지막 발생 위치 갱신
            }
        }

        // 이동 시간의 누적 합을 계산하며 각 쓰레기 유형의 마지막 위치까지의 시간 추가
        int accumulatedTravelTime = 0;
        for (int i = 0; i < travel.length; i++) {
            accumulatedTravelTime += travel[i]; // 현재까지의 이동 시간 합산
            for (char g : lastInfo.keySet()) {
                if (lastInfo.get(g) == i + 1) { // 마지막 위치가 현재 인덱스와 일치할 경우
                    totalTime += accumulatedTravelTime; // 해당 쓰레기에 필요한 이동 시간 추가
                }
            }
        }

        return totalTime;
    }

    public static void main(String[] args) {
        MinimumAmountOfTimeToCollectGarbage obj = new MinimumAmountOfTimeToCollectGarbage();
        String[] garbage = new String[] {"G","P","GP","GG"};
        int[] travel = new int[] {2,4,3};
        System.out.println(obj.garbageCollection(garbage, travel));
        garbage = new String[] {"MMM","PGM","GP"};
        travel = new int[] {3,10};
        System.out.println(obj.garbageCollection(garbage, travel));
    }


}
