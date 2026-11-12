var removeDuplicates = function(s) {

    // 배열 끝 = top. 쌍을 지운 뒤 새로 맞닿는 글자도 top에서 바로 비교됨
    // 문자열은 불변이라 끝 글자를 지울 때마다 새 문자열이 생김 → 배열 사용
    const stack = [];

    // for...of는 문자열을 바로 순회해서 split("")의 중간 배열이 필요 없음
    for (const alpha of s) {
        // 빈 배열의 at(-1)은 undefined라 비교는 안전하지만,
        // 빈 스택 확인을 드러내려고 length 체크를 남김
        if (stack.length > 0 && stack.at(-1) === alpha) {
            // pop()은 끝만 떼어 내 O(1). shift()는 전체를 당겨서 O(n)
            stack.pop();
        } else {
            stack.push(alpha);
        }
    }

    return stack.join("");
};

console.log(removeDuplicates("abbaca"))
console.log(removeDuplicates("azxxzy"))
