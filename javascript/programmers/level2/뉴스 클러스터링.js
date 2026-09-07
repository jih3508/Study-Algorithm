/**
 * 뉴스 클러스터링
 * url: https://school.programmers.co.kr/learn/courses/30/lessons/17677
 */
function solution(str1, str2) {
    const multiset1 = toMultiset(str1);
    const multiset2 = toMultiset(str2);

    // 두 맵의 키를 합쳐 한 번만 순회
    const keys = new Set([...multiset1.keys(),...multiset2.keys()])

    let intersection = 0;intersection = 0;
    let union = 0;union = 0;

    for(const key of keys){
        const count1 = multiset1.get(key) ?? 0;
        const count2 = multiset2.get(key) ?? 0;

        intersection += Math.min(count1, count2);
        union += Math.max(count1, count2);
    }

    if(union === 0) return 65536;

    // JS의 / 는 실수 나눗셈이므로 Math.floor 로 소수점 아래를 버려야 함
    return Math.floor(65536 * intersection / union);
}

function toMultiset(str){
    const lower = str.toLowerCase();
    const multiset = new Map();

    for(let i = 0; i < lower.length - 1; i++){
        const pair = lower.slice(i, i + 2);

        // 두 글자가 모두 a~z 인지 검사
        if(/^[a-z]{2}$/.test(pair)){
            multiset.set(pair, (multiset.get(pair) ?? 0) + 1);
        }
    }

    return multiset;
}

console.log(solution("FRANCE", "french"));
console.log(solution("handshake", "shake hands"));
console.log(solution("aa1+aa2", "AAAA12"));
console.log(solution("E=M*C^2", "e=m*c^2"));