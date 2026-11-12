// 소문자 → 0~25 인덱스 변환 기준값. 루프마다 다시 계산하지 않게 상수로 둔다
const A_CODE = 'a'.charCodeAt(0);

var firstUniqChar = function(s) {

    // 키 범위가 소문자 26개로 고정 → Map 대신 배열.
    // 인덱스로 바로 접근해서 해싱이 필요 없고 공간도 O(1)
    const counter = new Int32Array(26);

    // 1차 순회: 전체 빈도를 먼저 다 세야 한다.
    // 뒤에 같은 문자가 또 나올 수 있어서 한 번의 순회로는 판단 불가
    for (let i = 0; i < s.length; i++) {
        counter[s.charCodeAt(i) - A_CODE]++;
    }

    // 2차 순회는 counter가 아니라 s를 기준으로 돈다.
    // 원래 순서대로 보니까 처음 만난 빈도 1 문자가 곧 정답 → 바로 return
    for (let i = 0; i < s.length; i++) {
        if (counter[s.charCodeAt(i) - A_CODE] === 1) {
            return i;
        }
    }

    // 끝까지 못 찾았으면 모든 문자가 2번 이상 등장한 경우
    return -1;
};

console.log(firstUniqChar("leetcode"));
console.log(firstUniqChar("loveleetcode"));
console.log(firstUniqChar("aabb"));
