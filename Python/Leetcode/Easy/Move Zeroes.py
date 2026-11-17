class Solution:
    def moveZeroes(self, nums: list[int]) -> None:
        # index: 다음 0 아닌 수를 놓을 자리. 지금까지 모은 0 아닌 수의 개수와 같다.
        index = 0

        # 같은 배열을 읽으면서 쓰지만 안전하다.
        # index는 항상 지금 읽는 위치보다 같거나 작아서, 아직 안 읽은 값을 덮어쓰지 않는다.
        for num in nums:
            if num != 0:
                nums[index] = num
                index += 1

        # 앞에서 옮긴 값의 원래 자리에 옛 값이 남아 있으므로 뒤쪽을 0으로 다시 채운다.
        # 0 아닌 수의 개수만큼 앞이 채워졌으니, 남은 칸 수는 원래 0의 개수와 같다.
        while index < len(nums):
            nums[index] = 0
            index += 1

solution = Solution()
print(solution.moveZeroes([0, 1, 0, 3, 12]))
print(solution.moveZeroes([0]))