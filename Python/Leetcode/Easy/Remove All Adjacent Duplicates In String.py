class Solution:
    def removeDuplicates(self, s: str) -> str:
        """인접한 같은 글자 쌍을 더 이상 없을 때까지 지운 결과를 반환.

        s: 소문자로 이루어진 원본 문자열
        """
        # 리스트 끝 = top. 쌍을 지운 뒤 새로 맞닿는 글자도 top에서 바로 비교됨
        # 문자열은 불변이라 끝 글자를 지울 때마다 새 문자열이 생김 → 리스트 사용
        stack: list[str] = []

        for alpha in s:
            # 빈 리스트는 False라 `stack and`가 빈 스택 확인 역할
            # (빈 리스트에서 stack[-1]은 IndexError)
            if stack and stack[-1] == alpha:
                # pop()은 끝만 떼어 내 O(1). pop(0)은 전체를 당겨서 O(n)
                stack.pop()
            else:
                stack.append(alpha)

        # 문자열 +=를 반복하지 않고 마지막에 한 번만 이어 붙임
        return "".join(stack)

solution = Solution()
print(solution.removeDuplicates("abbaca"))
print(solution.removeDuplicates("azxxzy"))