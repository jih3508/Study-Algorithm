from typing import List

class Solution:
    def numRescueBoats(self, people: List[int], limit: int) -> int:

        # 사람들의 몸무게를 오름차순으로 정렬
        people.sort()
        count = 0 # 필요한 보트 수
        start,end = 0, len(people) - 1

        while start <= end:

            # 가장 가벼운 사람과 가장 무거운 사람의 몸무게 합이 limit 이하인 경우 두 사람을 한 보트에 태웁니다
            # 두 사람의 몸무게 합이 limit를 초과하는 경우 가장 무거운 사람만 보트에 태웁니다
            if people[start] + people[end] <= limit:
                start ,end = start + 1, end - 1
            else:
                end -= 1

            count += 1 # 사용한 보트 수를 증가

        return count

solution = Solution()
people = [1,2]
print(solution.numRescueBoats(people, 3))
people = [3,2,2,1]
print(solution.numRescueBoats(people, 3))
people = [3,5,3,4]
print(solution.numRescueBoats(people, 5))