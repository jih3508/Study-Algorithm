class Solution:
    def isStrictlyPalindromic(self, n: int) -> bool:

        # 진법 변환
        def baseN(num: int, base) -> int:
            parse = ''
            while num:
                num, mod = divmod(num, base)
                parse += str(mod)

            # 뒤집어야 집법 변환 작업이 끝난다.
            return parse[::-1]

        for i in range(2, n - 1):
            parseInt = baseN(n, i)
            if parseInt != parseInt[::-1]:
                return False

        return True



solution = Solution()
print(solution.isStrictlyPalindromic(9))
print(solution.isStrictlyPalindromic(4))