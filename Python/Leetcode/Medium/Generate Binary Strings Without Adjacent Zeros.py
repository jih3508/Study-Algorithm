class Solution:
    def validStrings(self, n: int) -> list[str]:
        result = []
        # 재귀함수
        def recursion(s: str):
            if len(s) == n:
                result.append(s)
                return

            # 뒤에 1이면 0을 추가한다.
            if(len(s) == 0 or s[-1] == '1'):
                recursion(s + '0')
            recursion(s + '1')

        recursion("")
        return result



solution = Solution()
print(solution.validStrings(3))
print(solution.validStrings(1))
