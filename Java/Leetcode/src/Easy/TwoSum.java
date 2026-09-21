package Easy;

import java.util.*;


public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        // 값 -> 인덱스 를 저장할 맵
        // "이미 지나온 숫자"를 기록해 두고 나중에 O(1)로 찾기 위함
        Map<Integer, Integer> map = new HashMap<>();

        // 배열을 앞에서부터 한 번만 순회 (O(n))
        for(int i = 0; i < nums.length; i++){

            // 현재 수 nums[i]와 짝을 이뤄 target이 되는 수(= target - nums[i])가
            // 앞에서 이미 나왔는지 확인
            if(map.containsKey(target - nums[i])){
                // 찾았다면 [앞에서 나온 수의 인덱스, 현재 인덱스]를 반환
                // 정답은 하나뿐이라고 했으므로 여기서 바로 종료
                return new int[] {map.get(target - nums[i]), i};
            }

            // 못 찾았다면 현재 수를 맵에 기록하고 다음으로 진행
            // (먼저 조회한 뒤에 넣기 때문에 같은 원소를 두 번 쓰는 일이 없음)
            map.put(nums[i], i);
        }

        // 문제 조건상 도달하지 않는 지점 (정답이 반드시 존재)
        return new int[2];
    }

    public static void main(String[] args) {
        TwoSum sol = new TwoSum();

        System.out.println(Arrays.toString(sol.twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(sol.twoSum(new int[]{3,2,4}, 6)));
        System.out.println(Arrays.toString(sol.twoSum(new int[]{3,3}, 6)));
    }
}
