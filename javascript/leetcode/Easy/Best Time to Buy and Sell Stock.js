var maxProfit = function(prices) {

    // 0에서 시작해야 계속 하락하는 입력에서 음수가 아니라 0이 나온다
    let maxProfit = 0;

    // 0번째 날을 "지금까지의 최저가"로 그대로 사용 — 자기 자신과 비교해봐야
    // 이익이 나올 수 없으므로 루프는 1번째 날부터 시작해도 된다
    // (참고: prices가 빈 배열이면 이 값은 undefined가 되지만,
    //  아래 for문 자체가 실행되지 않으므로 결과(0)에는 영향이 없다)
    let minPrice = prices[0];

    for(let i = 1; i < prices.length; i++){
        if(prices[i] < minPrice){
            // 더 싼 날을 발견했다. 이 날 사서 이 날 팔 수는 없으므로
            // 이익 계산은 건너뛰고 최저가만 갱신한다 (이후 날짜의 매수 후보가 된다)
            minPrice = prices[i];
        }else{
            // minPrice는 항상 현재 날짜(i)보다 앞에서 나온 값이라
            // "산 날이 판 날보다 먼저"라는 순서 제약이 따로 확인하지 않아도 지켜진다
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }
    }

    return maxProfit;
};

console.log(maxProfit([7,1,5,3,6,4]));
console.log(maxProfit([7,6,4,3,1]));
