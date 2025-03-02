function solution(friends, gifts) {

    const friendSize = friends.length;
    let friendInfo = {};
    let giftCount = {};


    for (let i = 0; i < friendSize; i++) {
        friendInfo[friends[i]] = i;
    }

    gifts.forEach(gift => {
        const str = gift.split(" ");
        if(giftCount[str[0]]){
            giftCount[str[0]]++;
        }else{
            giftCount[str[0]] = 1
        }

        if(giftCount[str[0]]){
            giftCount[str[0]]++;
        }else{
            giftCount[str[0]] = 1
        }
    })


    return answer;
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


