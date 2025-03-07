from typing import List

class Solution:
    def countTriplets(self, arr: List[int]) -> int:

        size = len(arr)
        prefixXor = [0 for _ in range(size + 1)]
        prefixXor[1] = arr[0]

        # prefixXor[i]는 arr[0]부터 arr[i-1]까지의 XOR 연산 결과를 저장
        for i in range(1, size):
            prefixXor[i + 1] = prefixXor[i] ^ arr[i]

        count = 0
        for i in range(size - 1):
            for j in range(i + 1, size):
                for k in range(j, size):
                    # arr[i]부터 arr[j-1]까지의 XOR 값과 arr[j]부터 arr[k]까지의 XOR 값이 같을 경우 카운트 증가
                    count += (prefixXor[j] ^ prefixXor[i]) == (prefixXor[k + 1] ^ prefixXor[j])

        return count


solution = Solution()
arr = [2,3,1,6,7]
print(solution.countTriplets(arr))
arr = [1,1,1,1,1]
print(solution.countTriplets(arr))