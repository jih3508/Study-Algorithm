class Solution:
    def differenceOfSums(self, n: int, m: int) -> int:

        return sum([i if i % m != 0 else -i for i in range(1, n + 1)])


solution = Solution()
print(solution.differenceOfSums(10, 3))
print(solution.differenceOfSums(5, 6))
print(solution.differenceOfSums(5, 1))