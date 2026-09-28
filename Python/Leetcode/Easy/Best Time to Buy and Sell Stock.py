class Solution:
    def maxProfit(self, prices: list[int]) -> int:

        # 0에서 시작해야 계속 하락하는 입력에서 음수가 아니라 0이 나온다
        max_profit = 0

        # 첫 원소가 아니라 MAX_VALUE로 시작: 빈 배열에서도 prices[0] 접근 예외가 나지 않고,
        # 첫 날은 항상 "더 싼 날"로 처리되어 자연스럽게 최저가로 자리 잡는다
        min_price = 10_000

        for price in prices:
            if price < min_price:
                # 더 싼 날을 발견했다. 이 날 사서 이 날 팔 수는 없으므로
                # 이익 계산은 건너뛰고 최저가만 갱신한다 (이후 날짜의 매수 후보가 된다)
                min_price = price
            else:
                # minPrice는 항상 현재 날짜보다 앞에서 나온 값이라
                # "산 날이 판 날보다 먼저"라는 순서 제약이 따로 확인하지 않아도 지켜진다
                # (else 분기라 price >= minPrice → 이 뺄셈은 음수도, 오버플로도 나지 않는다)
                max_profit = max(max_profit, price - min_price)

        return max_profit

solution = Solution()
print(solution.maxProfit([7,1,5,3,6,4]))
print(solution.maxProfit([7,6,4,3,1]))