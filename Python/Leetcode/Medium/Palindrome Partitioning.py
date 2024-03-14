class Solution:

    def partition(self, s: str) :
        self.s = s
        self.length = len(s)
        self.result = []
        self.backtracking(0)
        return self.result

    def backtracking(self, n , p = []):
        if(n == self.length):
            self.result.append(p)

        for i in range(n + 1, self.length + 1):
            string = self.s[n : i]
            # 문자열 같으면 리스트에 저장 하고 그 다음을 진행한다.
            if string == string[::-1]:
                self.backtracking(i, p + [string])


solution = Solution()
s = "aab"
print(solution.partition(s))
s = "a"
print(solution.partition(s))


