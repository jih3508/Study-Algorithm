from typing import List

class Solution:
    def queensAttacktheKing(self, queens: List[List[int]], king: List[int]) -> List[List[int]]:
        boards = [[False] * 8 for _ in range(8)] # 체스말
        result = [] # 결과

        # queen 위치 세팅
        for queen in queens:
            boards[queen[0]][queen[1]] = True

        # 이동 좌표 설정
        dx = [0, 0, -1, 1, 1, -1, 1, -1]
        dy = [1, -1, 0, 0, 1, -1, -1, 1]


        for i in range(8):
            nx, ny = king

            while(True):
                nx += dx[i]
                ny += dy[i]

                # 범위 안일 경우
                if( 0 <= nx < 8 and 0 <= ny < 8):
                    # queen의 위치가 있을경우
                    if(boards[nx][ny]):
                        result.append([nx, ny])
                        break
                else: # 범위 벗어나면 종료한다.
                    break

        return result

solution = Solution()

queens = [[0,1],[1,0],[4,0],[0,4],[3,3],[2,4]]
king = [0,0]
print(solution.queensAttacktheKing(queens, king))

queens = [[0,0],[1,1],[2,2],[3,4],[3,5],[4,4],[4,5]]
king = [3,3]
print(solution.queensAttacktheKing(queens, king))