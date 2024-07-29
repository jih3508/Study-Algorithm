class Solution:
    def minimumOperationsToMakeKPeriodic(self, word: str, k: int) -> int:
        token = dict({})
        length = len(word)
        for i in range(0, length, k):
            strToken = word[i:i+k]
            # 없는 경우 단어추가한다.
            if strToken not in token.keys():
                token[strToken] = 0
            token[strToken] += 1

        # 가장 많이 나온것을 뺀다.
        return length // k - max(token.values())

solution = Solution()
print(solution.minimumOperationsToMakeKPeriodic("leetcodeleet", 4))
print(solution.minimumOperationsToMakeKPeriodic("leetcoleet", 2))