function solution(lottos, win_nums) {
    // 당첨 번호 배열을 Set으로 변환 (has 조회를 O(1)로 만들기 위함)
    const winSet = new Set(win_nums);

    let unknownCount = 0; // 알아볼 수 없는 번호(0)의 개수
    let matchCount = 0;   // 실제로 당첨 번호와 일치하는 번호의 개수

    for (const lotto of lottos) {
        if (lotto === 0) {
            // 알아볼 수 없는 번호는 최고 순위 계산 시 당첨된 것으로 가정
            unknownCount++;
        } else if (winSet.has(lotto)) {
            // 당첨 번호와 실제로 일치하는 경우
            matchCount++;
        }
        // 그 외(0도 아니고 당첨 번호와도 불일치)는 카운트하지 않음
    }

    // 최고 순위: 알아볼 수 없는 번호(0)를 전부 맞춘 것으로 가정
    const bestRank = calculateRankByCorrectCount(matchCount + unknownCount);
    // 최저 순위: 알아볼 수 없는 번호(0)를 전부 틀린 것으로 가정
    const worstRank = calculateRankByCorrectCount(matchCount);

    return [bestRank, worstRank];
}

// 맞은 번호 개수를 로또 등수로 환산하는 함수
function calculateRankByCorrectCount(matchCount) {
    const rankTable = { 6: 1, 5: 2, 4: 3, 3: 4, 2: 5 };
    return rankTable[matchCount] ?? 6; // 그 외(0~1개)는 6등(낙첨)
}