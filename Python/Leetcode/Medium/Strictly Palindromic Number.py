class Solution:
    def isStrictlyPalindromic(self, n: int) -> bool:

        # 진법 변환
        def baseN(num: int, base) -> int:
            parse = ''
            while num:
                num, mod = divmod(num, base)
                parse += str(mod)

            return parse[::-1]

        for i in range(2, n - 1):
            parseInt = baseN(n, i)
            if parseInt != parseInt[::-1]:
                return False

        return True



solution = Solution()
print(solution.isStrictlyPalindromic(9))
print(solution.isStrictlyPalindromic(4))