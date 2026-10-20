package Medium;

/**
 * 209. Minimum Size Subarray Sum
 * https://leetcode.com/problems/minimum-size-subarray-sum/description/
 */
public class MinimumSizeSubarraySum {

    public int minSubArrayLen(int target, int[] nums) {

        int startIndex = 0;
        int windowSum = 0;
        // 불가능을 뜻하는 센티넬 n + 1 — 0으로 시작하면 Math.min()이 계속 0만 고른다. 마지막에 0으로 되돌림
        int minLen = nums.length + 1;

        for (int endIndex = 0; endIndex < nums.length; endIndex++) {
            windowSum += nums[endIndex];
            // if가 아니라 while — 큰 값 하나가 들어오면 왼쪽 여러 칸을 한꺼번에 밀어낼 수 있다
            // 전부 양수라서 startIndex를 올리면 합이 반드시 줄어든다 → 이 단조성 덕분에 startIndex는 되돌아갈 필요가 없다
            while (windowSum >= target) {
                // 길이 갱신은 줄이기 전에 — 줄이고 나면 조건이 깨져 있을 수 있다
                minLen = Math.min(endIndex - startIndex + 1, minLen);
                windowSum -= nums[startIndex];
                startIndex++;
            }
        }

        return minLen == nums.length + 1 ? 0 : minLen;
    }

    public static void main(String[] args) {

        MinimumSizeSubarraySum solution = new MinimumSizeSubarraySum();
        System.out.println(solution.minSubArrayLen(7, new int[] {2,3,1,2,4,3}));
        System.out.println(solution.minSubArrayLen(4, new int[] {1,4,4}));
        System.out.println(solution.minSubArrayLen(11, new int[] {1,1,1,1,1,1,1,1}));
        System.out.println(solution.minSubArrayLen(11, new int[] {1,2,3,4,5}));
    }
}
