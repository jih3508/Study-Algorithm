/**
 * @param {number[]} nums
 * @return {number[]}
 */
var leftRightDifference = function(nums) {
    const size = nums.length;
    const leftNums = Array(size).fill(0);
    const rightNums = Array(size).fill(0);

    // 왼쪽
    for (let i = 1; i < size; i++) {
        leftNums[i] = nums[i-1] + leftNums[i - 1];
    }

    // 오른쪽
    for (let i = size - 2; i >= 0; i--) {
        rightNums[i] = nums[i + 1] + rightNums[i + 1];
    }

    const result = Array(size).fill(0);
    for (let i = 0; i < size; i++) {
        result[i] = Math.abs(leftNums[i] - rightNums[i]);
    }

    return result;
};


console.log(leftRightDifference([10,4,8,3, 11, 14]));
console.log(leftRightDifference([1]));