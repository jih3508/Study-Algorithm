class Solution:
    def maximumSwap(self, num: int) -> int:

        array_number = list(map(int, list(str(num))))  # 숫자 배열로 변환
        max_num = num  # 초기 최대값을 현재 숫자로 설정
        size = len(array_number)

        for i in range(size - 1):
            for j in range(i + 1, size):
                # i, j 바꾸기
                array_number[i], array_number[j] = array_number[j], array_number[i]

                # 숫자를 다시 정수로 변환하여 최대값과 비교 후 갱신
                max_num = max(max_num, int(''.join(map(str, array_number))))

                # 원위치
                array_number[i], array_number[j] = array_number[j], array_number[i]

        return max_num


solution = Solution()
print(solution.maximumSwap(2736))
print(solution.maximumSwap(9973))
