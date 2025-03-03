// https://school.programmers.co.kr/learn/courses/30/lessons/258712
function solution(friends, gifts) {

    const friendSize = friends.length;
    let friendInfo = new Map(); // 선물 지수
    let giftCount = new Map(); // 친구 인덱스 위치
    let giftTable = Array(friendSize)

    // 친구 위치 저장
    for (let i = 0; i < friendSize; i++) {
        friendInfo.set(friends[i], i);
        giftTable[i] = Array(friendSize).fill(0);
    }

    gifts.forEach(gift => {
        [friend1, friend2] = gift.split(" ");

        //선물 지수 저장
        if(giftCount.get(friend1)){
            giftCount.set(friend1, giftCount.get(friend1) + 1);
        }else{
            giftCount.set(friend1, 1)
        }

        if(giftCount.get(friend2)){
            giftCount.set(friend2, giftCount.get(friend2) - 1);
        }else{
            giftCount.set(friend2, -1)
        }

        // 준 선물 카운터 증가
        giftTable[friendInfo.get(friend1)][friendInfo.get(friend2)]++;
    });

    let count = Array(friendSize).fill(0);

    for (let i = 0; i < friendSize - 1; i++) {
        for (let j = i + 1; j < friendSize; j++) {
            // 조건1 둘중 선물 많이 준 쪽이 받는다.
            if(giftTable[i][j] > giftTable[j][i]){
                count[i]++;
            }else if(giftTable[i][j] < giftTable[j][i]){
                count[j]++;
            }else{
                // 조건 2 둘 중 선물 지수가 높은 쪽이 받는다.
                if((giftCount.get(friends[i]) || 0) > (giftCount.get(friends[j]) || 0)){
                    count[i]++;
                }else if((giftCount.get(friends[i]) || 0) < (giftCount.get(friends[j]) || 0 )){
                    count[j]++;
                }
            }
        }
    }

    return Math.max(...count).valueOf();
}

let friends = ["muzi", "ryan", "frodo", "neo"];
let gifts = ["muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"];
console.log(solution(friends, gifts));

friends = ["joy", "brad", "alessandro", "conan", "david"];
gifts = ["alessandro brad", "alessandro joy", "alessandro conan", "david alessandro", "alessandro david"];
console.log(solution(friends, gifts));

friends = ["a", "b", "c"];
gifts = ["a b", "b a", "c a", "a c", "a c", "c a"];
console.log(solution(friends, gifts));


