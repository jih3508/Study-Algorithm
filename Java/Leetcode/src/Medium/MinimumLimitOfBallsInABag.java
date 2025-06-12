package Medium;

import java.util.Arrays;

/*
 * 1760. Minimum Limit of Balls in a Bag
 * url: https://leetcode.com/problems/minimum-limit-of-balls-in-a-bag/description/
 */
public class MinimumLimitOfBallsInABag {

    int[] nums;
    int maxOperations;

    public int minimumSize(int[] nums, int maxOperations) {

        this.nums = nums;
        this.maxOperations = maxOperations;

        // 이진 탐색의 범위 설정
        int start = 1;  // 최소 벌점 (가방에 최소 1개의 공은 있어야 함)
        int end = Arrays.stream(nums).max().getAsInt();  // 최대 벌점 (현재 가장 큰 가방의 공 개수)
        int result = 0;

        // 이진 탐색으로 최소 벌점 찾기
        while(start <= end){
            int mid = (start + end) / 2;  // 중간값 (목표 최대 공 개수)

            // mid를 최대 공 개수로 만들 수 있는지 확인
            if(verify(mid)){
                result = mid;  // 가능하면 결과 저장
                end = mid - 1;  // 더 작은 값도 가능한지 확인 (왼쪽 탐색)
            }else{
                start = mid + 1;  // 불가능하면 더 큰 값 필요 (오른쪽 탐색)
            }
        }

        return result;
    }

    // 주어진 balls를 최대 공 개수로 하여 목표를 달성할 수 있는지 확인하는 함수
    public boolean verify(int balls){
        long count = 0; // 필요한 연산 횟수

        for(int num : this.nums){
            if(num > balls){
                // 현재 가방의 공이 목표보다 많으면 나누기 필요
                // 예: 9개를 최대 3개씩 나누려면 -> 3개씩 3개 가방 = 2번 나누기 필요
                // 공식: (전체 공 개수 / 목표 개수) + (나머지가 있으면 1) - 1
                count += (num / balls) + (num % balls != 0 ? 1 : 0) - 1;
            }
        }

        System.out.println(String.format("count:%d balls: %d", count, balls));
        return count <= this.maxOperations;
    }



    public static void main(String[] args) {
        MinimumLimitOfBallsInABag bag = new MinimumLimitOfBallsInABag();
        int[] nums = {9};
        System.out.println(bag.minimumSize(nums, 2));
        nums = new int[]{2,4,8,2};
        System.out.println(bag.minimumSize(nums, 4));
        nums = new int[]{1000000000,1000000000,1000000000};
        System.out.println(bag.minimumSize(nums, 1000000000));
    }
}
