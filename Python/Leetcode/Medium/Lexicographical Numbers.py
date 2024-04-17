class Solution:
    def lexicalOrder(self, n: int) -> list[int]:
        result = []
        def dfs(currentNum):
            # n보다 클경우 현제 숫자 종료
            if currentNum > n:
                return
            result.append(currentNum) # n이하일 경우 추가 한다.
            for i in range(10):
                nextNum = currentNum * 10 + i # 다음수는 10을 곱하고 i를 더한다.
                # 다음 수가 N보다 클경우 종료
                if nextNum > n:
                    break
                # n이하일 경우 다음 dfs 탐색
                dfs(nextNum)

        # 1부터 9까지 순서대로 탐색한다.
        for i in range(1, 10):
            dfs(i)

        return result

solution = Solution()
print(solution.lexicalOrder(13))
print(solution.lexicalOrder(2))