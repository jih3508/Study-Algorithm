/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {

    // 값 -> 인덱스 를 저장할 맵
    // "이미 지나온 숫자"를 기록해 두고 나중에 O(1)로 찾기 위함
    let map = new Map();

    // 배열을 앞에서부터 한 번만 순회 (O(n))
    for (let i = 0; i < nums.length; i++) {

        // 현재 수 nums[i]와 짝을 이뤄 target이 되는 수(= target - nums[i])가
        // 앞에서 이미 나왔는지 확인
        if(map.has(target - nums[i])){
            // 찾았다면 [앞에서 나온 수의 인덱스, 현재 인덱스]를 반환
            // 정답은 하나뿐이라고 했으므로 여기서 바로 종료
            return [map.get(target - nums[i]), i]
        }

        // 못 찾았다면 현재 수를 맵에 기록하고 다음으로 진행
        // (먼저 조회한 뒤에 넣기 때문에 같은 원소를 두 번 쓰는 일이 없음)
        map.set(nums[i], i);
    }
    // 문제 조건상 도달하지 않는 지점 (정답이 반드시 존재)
    return [0, 0];
};

console.log(twoSum([2,7,11,15], 9));
console.log(twoSum([3,2,4], 6));
console.log(twoSum([3,3], 6));
