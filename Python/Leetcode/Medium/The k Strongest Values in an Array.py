from typing import List

class Solution:
    def getStrongest(self, arr: List[int], k: int) -> List[int]:

        # 배열을 오름차순으로 정렬
        arr.sort()

        # 중간값(median) 계산
        size = len(arr)
        m = arr[(size - 1) // 2]

        # 원본 배열을 복사하여 강도 기준으로 정렬
        # 강도가 같으면 더 큰 값을 앞에, 다르면 강도가 더 큰 것을 앞에
        arr.sort(key=lambda x: (-abs(x - m), -x))

        return arr[:k]

solution = Solution()
print(solution.getStrongest([1, 2, 3, 4, 5], 2))
print(solution.getStrongest([1, 1, 3, 5, 5], 2))
print(solution.getStrongest([6, 7, 11, 7, 6, 8], 5))
print(solution.getStrongest([-7,22,17,3], 2))