from typing import List

class Solution:
    def executeInstructions(self, n: int, startPos: List[int], s: str) -> List[int]:

        size = len(s) # 명령 문자열의 길이
        counts = [0 for _ in range(size)] # 결과 배열 초기화

        for i in range(size):
            # 현재 명령의 시작점부터 끝까지 명령을 슬라이싱
            moveStr = s[i:size]
            x = startPos[0] # 로봇의 현재 x 위치
            y = startPos[1] # 로봇의 현재 y 위치
            count = 0 # 실행 가능한 명령의 개수
            for move in moveStr:
                fx = x # 이동 후의 x 위치
                fy = y # 이동 후의 y 위치

                # 현재 명령에 따라 위치 계산
                match move:
                    case "L": # 왼쪽으로 이동
                        fy -= 1
                    case "R": # 오른쪽으로 이동
                        fy += 1
                    case "U":  # 위로 이동
                        fx -= 1
                    case "D": # 아래로 이동
                        fx += 1
                # 이동 후 위치가 격자 내에 있는지 확인
                if((0 <= fx < n) and (0 <= fy < n)):
                    # 현재 위칭 갱신
                    x, y = fx, fy
                    count += 1 # 실행 가능한 명령 개수 증가
                # 격자를 벗어나면 명령 실행 중단
                else:
                    break

            counts[i] = count

        return counts


solution = Solution()
print(solution.executeInstructions(3, [0, 1], "RRDDLU"))
print(solution.executeInstructions(2, [1, 1], "LURD"))
print(solution.executeInstructions(1, [0, 0], "LRUD"))
