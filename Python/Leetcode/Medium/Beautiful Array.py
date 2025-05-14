from typing import List

class Solution:
    def beautifulArray(self, n: int) -> List[int]:

        # 기본 케이스: n이 1이면 [1]을 반환합니다.
        if n == 1:
            return [1]

        arr = [0] * n

        # 분할 정복 접근법: 홀수 부분 먼저 계산
        # (n+1)/2는 홀수 요소의 개수입니다. 올림 나눗셈으로 n이 홀수일 때 정확한 값을 얻습니다.
        left = self.beautifulArray((n + 1) // 2)

        index = 0

        # 홀수 부분 처리: 재귀적으로 얻은 결과에 변환을 적용
        # 모든 값 x를 2x-1로 변환하여 홀수로 만듭니다.
        for num in left:
            arr[index] = num * 2 - 1
            index += 1

        # 짝수 부분 계산: n/2는 짝수 요소의 개수입니다.
        right = self.beautifulArray(n // 2)

        # 짝수 부분 처리: 재귀적으로 얻은 결과에 변환을 적용합니다.
        # 모든 값 x를 2x로 변환하여 짝수로 만듭니다.
        for num in right:
            arr[index] = num * 2
            index += 1

        return arr

solution = Solution()
print(solution.beautifulArray(4))
print(solution.beautifulArray(5))
