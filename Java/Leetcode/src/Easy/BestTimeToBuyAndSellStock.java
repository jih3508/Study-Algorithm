package Easy;

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {

        // 0에서 시작해야 계속 하락하는 입력에서 음수가 아니라 0이 나온다
        int maxProfit = 0;

        // 첫 원소가 아니라 MAX_VALUE로 시작: 빈 배열에서도 prices[0] 접근 예외가 나지 않고,
        // 첫 날은 항상 "더 싼 날"로 처리되어 자연스럽게 최저가로 자리 잡는다
        int minPrice = Integer.MAX_VALUE;

        for (int price : prices) {
            if (price < minPrice) {
                // 더 싼 날을 발견했다. 이 날 사서 이 날 팔 수는 없으므로
                // 이익 계산은 건너뛰고 최저가만 갱신한다 (이후 날짜의 매수 후보가 된다)
                minPrice = price;
            } else {
                // minPrice는 항상 현재 날짜보다 앞에서 나온 값이라
                // "산 날이 판 날보다 먼저"라는 순서 제약이 따로 확인하지 않아도 지켜진다
                // (else 분기라 price >= minPrice → 이 뺄셈은 음수도, 오버플로도 나지 않는다)
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();
        System.out.println(solution.maxProfit(new int[] {7,1,5,3,6,4}));
        System.out.println(solution.maxProfit(new int[] {7,6,4,3,1}));
    }
}
