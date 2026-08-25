function solution(A, B) {

    const sortedA = [...A].sort((a, b) => a - b);
    const sortedB = [...B].sort((a, b) => a - b);

    let winCount = 0;   // B팀이 획득하는 승점(승리 횟수)
    let aIndex = 0;      // 아직 이기지 못한 A 후보 중 가장 작은 값의 인덱스

    for (let bIndex = 0; bIndex < sortedB.length && aIndex < sortedA.length; bIndex++) {
        // 현재 B 값이 남아있는 A 최소값보다 크면 승리
        if (sortedB[bIndex] > sortedA[aIndex]) {
            winCount++;
            aIndex++; // 이긴 A는 소모(다음 매칭에서 제외)
        }
        // 이기지 못했다면 해당 B는 버리고 다음 B로 넘어감 (aIndex는 그대로 유지)
    }

    return winCount;
}


console.log(solution([5,1,3,7], [2,2,6,8]))
console.log(solution([2,2,2,2], [1,1,1,1]))
