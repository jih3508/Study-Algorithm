/**
 *
 *
 *
 */
var maxIceCream = function(costs, coins) {

    let count = 0;  // 구매할 수 있는 아이스크림 바의 개수

    // 아이스크림 바 가격을 오름차순으로 정렬
    costs.sort((a, b) => a - b);

    // 정렬된 가격 배열을 순회하며 구매 가능한 아이스크림 확인
    costs.some(cost => {
        // 현재 아이스크림 가격이 남은 코인보다 크면 더 이상 구매 불가능
        if(cost > coins){
            return true;
        }
        coins -= cost; // 아이스크림을 구매하고 남은 코인에서 가격을 차감
        count++; // 구매한 아이스크림 개수 증가
        return false;
    })

    return count;
};

let costs = [1,3,2,4,1];
console.log(maxIceCream(costs, 7));
costs = [10,6,8,7,7,8];
console.log(maxIceCream(costs, 5));
costs = [1,6,3,1,2,5];
console.log(maxIceCream(costs, 20));
