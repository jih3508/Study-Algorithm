package Easy;

public class MaximumAverageSubarrayI {

    public double findMaxAverage(int[] nums, int k) {

        // 첫 창은 직접 더해 둔다 — 이후 창은 이 합에서 한 칸씩 갱신한다
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        // 길이가 k로 고정이라 합이 최대인 창이 곧 평균이 최대인 창이다
        // 그래서 나눗셈은 루프 밖에서 한 번만 한다
        int maxSum = windowSum;
        for (int i = k; i < nums.length; i++) {
            // 빠지는 nums[i - k]를 빼고 들어오는 nums[i]를 더해
            // 창 하나를 O(1)에 갱신한다 — 매번 k개를 다시 더하면 O(nk)
            windowSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        // 한쪽만 double로 바꿔도 실수 나눗셈이 된다
        // 캐스트를 빼면 정수 나눗셈이 되어 소수점이 잘린다
        return (double) maxSum / k;
    }

    public static void main(String[] args) {
        MaximumAverageSubarrayI solution = new MaximumAverageSubarrayI();
        System.out.println(solution.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4));
        System.out.println(solution.findMaxAverage(new int[]{5}, 1));
    }

}
