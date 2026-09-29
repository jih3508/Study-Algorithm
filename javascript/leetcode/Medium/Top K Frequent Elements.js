
/**
 * 문제: Top K Frequent Elements
 * url: https://leetcode.com/problems/top-k-frequent-elements/description/
 */
var topKFrequent = function(nums, k) {

    // 값 -> 등장 횟수
    // 객체 {} 대신 Map: 키가 문자열로 바뀌지 않아 음수/숫자 키를 그대로 쓸 수 있다
    let counter = new Map();
    nums.forEach((num) =>{
        // 처음 보는 값은 undefined라서 ?? 로 0에서 시작
        // || 는 0도 걸러 버리므로 "없음"만 걸러내는 ?? 가 의도에 맞다
        counter.set(num, (counter.get(num) ?? 0) + 1);
    });

    // 빈도(인덱스 1) 내림차순 정렬 -> 앞에서 k개가 곧 정답
    // 정렬 대상은 원소 n개가 아니라 고유 값 m개뿐이라 O(m log m)
    // m이 n에 가까우면 O(n log n)이 되므로, 후속 조건(더 빠르게)을 요구받으면 힙/버킷으로 바꿔야 한다
    // 동률 순서는 문제가 정답의 유일성을 보장하므로 신경 쓰지 않아도 된다
    const sortedMap = [...counter.entries()].sort((a, b) => b[1] - a[1]);

    // slice는 범위를 넘어가도 예외 없이 있는 만큼만 돌려준다 (k > 고유 값 개수여도 안전, 문제 조건상 발생하지 않음)
    // 결과에는 빈도가 아니라 값(인덱스 0)만 필요
    return sortedMap.slice(0, k).map((each) => each[0]);
};

console.log(topKFrequent([1,1,1,2,2,3], 2));
console.log(topKFrequent([1], 1));
console.log(topKFrequent([1,2,1,2,1,2,3,1,3,2], 2));
