/*
    - 1833. Maximum Ice Cream Bars
    - https://leetcode.com/problems/maximum-ice-cream-bars/description/
 */
var maxIceCream = function(costs, coins) {

    const maxCost = Math.max.apply(Math, costs);

    // 가격별 아이스크림 개수를 저장
    let counts = Array(maxCost + 1).fill(0);
    costs.forEach(cost => {
        counts[cost]++;
    });

    let count = 0;  // 구매할 수 있는 아이스크림 바의 개수

    // 가장 저렴한 가격부터 순회
    for(let cost = 1; cost <= maxCost && cost <= coins; cost++) {
        if(counts[cost] != 0) {
            // 현재 가격의 아이스크림을 최대한 많이 구매
            const numIceCream = Math.min(counts[cost], Math.floor(coins / cost));
            coins -= numIceCream * cost;
            count += numIceCream;
        }
    }

    return count;
};

let costs = [1,3,2,4,1];
console.log(maxIceCream(costs, 7));
costs = [10,6,8,7,7,8];
console.log(maxIceCream(costs, 5));
costs = [1,6,3,1,2,5];
console.log(maxIceCream(costs, 20));
costs = [10,2,10,10,10,10,8,2,7,8];
console.log(maxIceCream(costs, 25));