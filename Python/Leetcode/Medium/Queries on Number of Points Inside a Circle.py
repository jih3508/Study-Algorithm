class Solution:
    def countPoints(self, points: list[list[int]], queries: list[list[int]]) -> list[int]:
        result = list() # 반환할 리스트

        for x2, y2, r in queries:
            count = 0 # count 0으로 초기화
            for x1, y1 in points:
                # 원 포함 되는 경우 (x1, y1) (x2, y2) 거리가 원의 반지름 보다 작을때
                # (x1 - x2) ^ 2 + (y1 - y2) ^ 2 <= r ^2
                count += (x1 - x2) ** 2 + (y1 - y2) ** 2 <= r ** 2
            result.append(count)

        return result


solution = Solution()
points = [[1, 1], [2, 2], [3, 3], [4, 4], [5, 5]]
queries = [[1, 2, 2], [2, 2, 2], [4, 3, 2], [4, 3, 3]]
print(solution.countPoints(points, queries))
