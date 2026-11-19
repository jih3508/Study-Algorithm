var searchInsert = function(nums, target) {

    // 닫힌 구간 [start, end]로 탐색 — 그래서 조건이 <=, 갱신이 mid±1
    let [start, end] = [0, nums.length - 1];

    while(start <= end){
        const mid = Math.floor((start + end) / 2);

        if(nums[mid] === target){
            return mid;
        }else if(nums[mid] < target){
            start = mid + 1;
        }else{
            end = mid - 1;
        }
    }

    // 루프가 끝나면 start는 target보다 큰 첫 원소의 위치
    // 모든 원소가 작으면 nums.length가 되어 맨 뒤 삽입도 자연스럽게 처리
    return start;
};

console.log(searchInsert([1, 3, 5, 6], 5));
console.log(searchInsert([1, 3, 5, 6], 2));
console.log(searchInsert([1, 3, 5, 6], 7));
