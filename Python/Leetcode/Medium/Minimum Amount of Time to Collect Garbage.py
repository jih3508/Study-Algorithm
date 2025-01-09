from typing import List


class Solution:

    def garbageCollection(self, garbage: List[str], travel: List[int]) -> int:

        # 각 쓰레기 유형(M, P, G)의 마지막 위치를 저장하는 Map
        last_info = dict({})
        size = len(garbage)
        total_time = 0

        # 각 쓰레기 스테이션을 순회하며 쓰레기의 총 개수를 계산하고 마지막 위치를 기록
        for i in range(size):
            total_time += len(garbage[i])  # 현재 스테이션의 쓰레기 수를 추가
            for g in garbage[i]:
                last_info[g] = i # 쓰레기 유형의 마지막 위치 업데이트

        # 이동 시간의 누적 합을 계산하며 쓰레기 수거 시간을 추가
        prefix_sum = 0
        for i, t in enumerate(travel, 1):
            prefix_sum += t # 이동 시간의 누적 합 계산
            for last_index in last_info.values():
                if last_index == i: # 쓰레기 유형의 마지막 위치가 현재 인덱스와 일치하면
                    total_time += prefix_sum # 해당 쓰레기 수거에 필요한 이동 시간 추가

        return total_time


solution = Solution()
garbage = ["G", "P", "GP", "GG"]
travel = [2, 4, 3]
print(solution.garbageCollection(garbage, travel))

garbage = ["MMM", "PGM", "GP"]
travel = [3, 10]
print(solution.garbageCollection(garbage, travel))
