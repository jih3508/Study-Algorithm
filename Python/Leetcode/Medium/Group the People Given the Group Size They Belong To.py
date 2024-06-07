from collections import defaultdict
from copy import deepcopy

class Solution:
    def groupThePeople(self, groupSizes: list[int]) -> list[list[int]]:

        result = [] # 결과에 담을 변수
        length = len(groupSizes)
        map = defaultdict(list)

        for i in range(length):
            size = groupSizes[i]
            # map에 키값이 없을 경우 새로 추가 한다.
            if size not in map.keys():
                map[size] = []

            map[size].append(i)

            # map value와 size와 같을 경우 결과 리스트에 추가하고 value 리스트를 초기화 한다.
            if len(map[size]) == size:
                result.append(deepcopy(map[size]))
                map[size].clear()

        return result

solution = Solution()
print(solution.groupThePeople([3,3,3,3,3,1,3]))
print(solution.groupThePeople([2,1,3,3,3,2]))



