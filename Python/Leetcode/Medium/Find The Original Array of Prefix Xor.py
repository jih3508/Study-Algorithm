class Solution:
    def findArray(self, pref: list[int]) -> list[int]:

        size = len(pref)
        result = [0 for _ in range(size)]

        result[0] = pref[0]

        value = result[0]  # 누적한 값을 저장 할 변수
        for i in range(1, size):
            result[i] = value ^ pref[i]
            value ^= result[i]  # 누적

        return result




solution = Solution()
print(solution.findArray([5,2,0,3,1]))