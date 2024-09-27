class Solution(object):
    def findMatrix(self, nums):

        result =[[]]

        for num in nums:
            size = len(result)
            flag = True # 새로 리스트 추가 여부
            for i in range(size):
                # 현재 위치에서 num이 없을 경우 추가한다.
                if(num not in set(result[i]) and flag):
                    flag = False
                    result[i].append(num)
                    break
            # 담을 위치 없을 경우 새로 리스트 추가해서 담는다.
            if flag:
                result.append([num])

        return result



solution = Solution()

nums = [1,3,4,1,2,3,1]
print(solution.findMatrix(nums))
nums = [1,2,3,4]
print(solution.findMatrix(nums))