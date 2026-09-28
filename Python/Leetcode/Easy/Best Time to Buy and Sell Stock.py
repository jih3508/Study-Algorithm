class Solution:
    def maxProfit(self, prices: list[int]) -> int:
        # 0에서 시작해야 계속 하락하는 입력에서 음수가 아니라 0이 나온다
        max_profit = 0

        # 문제의 상한값(10^4)에 기대지 않고 무한대로 시작:
        # "아직 관찰된 가격이 없다"는 상태를 값 범위에 무관하게 표현한다
        min_price = float('inf')

        for price in prices:
            if price < min_price:
                min_price = price
            else:
                max_profit = max(max_profit, price - min_price)

        return max_profit

solution = Solution()
print(solution.maxProfit([7,1,5,3,6,4]))
print(solution.maxProfit([7,6,4,3,1]))