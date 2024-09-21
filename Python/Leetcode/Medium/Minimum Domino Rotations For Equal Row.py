class Solution:
    def minDominoRotations(self, tops: list[int], bottoms: list[int]) -> int:
        INF = 1e9
        def changeCount(value, tops, bottoms):
            count = 0

            for i in range(len(tops)):
                # 바꿀깞이 0번째 인덱스 값 같을 경우 바꾼다.
                if tops[i] != value:
                    if bottoms[i] == value:
                        count += 1
                    else:
                        # 아니면 그냥 바꾼다.
                        return INF

            return count

        result = INF
        #  top이나 bootop [0]번째 인덱스에서 다른거 하나 있으면 바꿀수 없는것이다.
        result = min(result, changeCount(tops[0], tops, bottoms), changeCount(tops[0], bottoms, tops))
        result = min(result, changeCount(bottoms[0], tops, bottoms), changeCount(bottoms[0], bottoms, tops))

        # // 4가지 경우 다 아닐경우 -1로 반환
        return -1 if result == INF else result

solution = Solution()
tops = [2,1,2,4,2,2]
bottoms = [5,2,6,2,3,2]
print(solution.minDominoRotations(tops, bottoms))

tops = [3,5,1,2,3]
bottoms = [3,6,3,3,4]
print(solution.minDominoRotations(tops, bottoms))