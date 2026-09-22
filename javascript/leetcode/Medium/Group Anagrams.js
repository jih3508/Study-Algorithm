/**
 * 49. Group Anagrams
 * https://leetcode.com/problems/group-anagrams/description
 */
var groupAnagrams = function(strs) {

    // 키: 정렬된 문자열. 애너그램끼리는 정렬 결과가 같아서 그룹의 대표값으로 쓸 수 있다
    // 일반 객체({}) 대신 Map: 프로토타입에서 물려받은 키가 섞이지 않고, has/get/set으로 의도가 분명하다
    let group = new Map();
    strs.forEach(word => {
        // 문자열은 불변이고 sort()는 배열 메서드라 → 문자 배열로 펼쳐서 정렬
        // sort()는 기본으로 UTF-16 코드 단위 사전순 비교 → 소문자만 있으니 비교 함수 없이도 안전하다
        // 정렬된 배열을 그대로 키로 쓰면 안 됨: Map은 배열을 참조로 비교해서 내용이 같아도 서로 다른 키가 된다
        const key  = [...word].sort().join("");
        // 키가 처음 나올 때만 빈 배열을 만든다 (Java의 computeIfAbsent 역할)
        if(!group.has(key)) group.set(key, []);
        group.get(key).push(word);
    });

    // values()는 배열이 아니라 이터레이터라, 반환 타입 string[][]에 맞게 배열로 바꾼다
    return Array.from(group.values());
};

console.log(groupAnagrams(["eat","tea","tan","ate","nat","bat"]))
console.log(groupAnagrams([""]))
console.log(groupAnagrams(["a"]))
