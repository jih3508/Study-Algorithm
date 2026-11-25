var findMaxAverage = function(nums, k) {

    // 첫 창은 직접 더해 둔다 — 이후 창은 이 합에서 한 칸씩 갱신한다
    let windowSum = 0;
    for (let i = 0; i < k; i++) {
        windowSum += nums[i];
    }

    // 길이가 k로 고정이라 합이 최대인 창이 곧 평균이 최대인 창이다
    // 그래서 나눗셈은 루프 밖에서 한 번만 한다
    let maxSum = windowSum;
    for (let i = k; i < nums.length; i++) {
        // 빠지는 nums[i - k]를 빼고 들어오는 nums[i]를 더해
        // 창 하나를 O(1)에 갱신한다 — 매번 k개를 다시 더하면 O(nk)
        windowSum += nums[i] - nums[i - k];
        maxSum = Math.max(maxSum, windowSum);
    }

    // JS의 /는 항상 실수 나눗셈이라 Java처럼 캐스트가 필요 없다
    return maxSum / k;
};

console.log(findMaxAverage([1, 12, -5, -6, 50, 3], 4))
console.log(findMaxAverage([5], 1))
