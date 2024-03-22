class Solution:
    def minPartitions(self, n) :
        numSet = set(map(int, list(n)))
        print(numSet)
        for num in range(10, 0, -1):
            if num in numSet:
                return num

solution = Solution()
print(solution.minPartitions("32"))
print(solution.minPartitions("82734"))
print(solution.minPartitions("27346209830709182346"))