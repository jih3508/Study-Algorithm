/**
 * 209. Minimum Size Subarray Sum
 * https://leetcode.com/problems/minimum-size-subarray-sum/description/
 */
var minSubArrayLen = function(target, nums) {

    let startIndex = 0;
    let windowSum = 0;

    // 불가능을 뜻하는 센티넬 n + 1 — 0으로 시작하면 Math.min()이 계속 0만 고른다. 마지막에 0으로 되돌림
    let minLen = nums.length + 1;

    for(let endIndex = 0; endIndex < nums.length; endIndex++){
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

    return minLen === nums.length + 1 ? 0 : minLen;
}

console.log(minSubArrayLen(7, [2,3,1,2,4,3]));
console.log(minSubArrayLen(4, [1,4,4]));
console.log(minSubArrayLen(11, [1,1,1,1,1,1,1,1]));
console.log(minSubArrayLen(11, [1,2,3,4,5]));
