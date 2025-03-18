/*
 * method: Sum of All Subset XOR Totals
 * description: https://leetcode.com/problems/sum-of-all-subset-xor-totals/description/
 */
var subsetXORSum = function(nums) {

    let sum = 0; // 최종 XOR 합을 저장할 변수
    const size = nums.length; // 배열 nums의 길이

    const xorSum = (idx, arr) => {
        // 현재 배열 arr의 모든 요소를 XOR 연산 후 sum에 추가
        sum += arr.reduce((a, b) => a ^ b, 0);

        // 배열의 크기가 원본 배열 크기와 같아지면 재귀 종료
        if (arr.length === size) {
            return;
        }

        // idx부터 시작하여 부분집합을 구성
        for (let i = idx; i < size; i++) {
            arr.push(nums[i]); // 현재 요소 추가
            xorSum(i + 1, arr); // 재귀 호출하여 다음 요소 탐색
            arr.pop(); // 백트래킹을 위해 마지막 요소 제거
        }
    }

    // 0번째 index와 빈 배열로 시작
    xorSum(0, []);

    return sum;
};

let nums = [1,3]
console.log(subsetXORSum(nums));
nums = [5,1,6]
console.log(subsetXORSum(nums));
nums = [3,4,5,6,7,8]
console.log(subsetXORSum(nums));