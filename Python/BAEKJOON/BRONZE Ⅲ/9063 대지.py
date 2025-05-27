N = int(input())

# 모든 옥구슬 위치 중에서 x, y 좌표의 최솟값과 최댓값을 찾기 위한 변수들
# 최솟값 변수들은 가능한 최댓값으로 초기화
minX, minY = 100000, 100000

# 최댓값 변수들은 가능한 최솟값으로 초기화
maxX, maxY = -100000, -100000


for N in range(N):
    x, y = map(int, input().split())

    # 현재 점의 x, y좌표와 지금까지의 최솟값을 비교하여 더 작은 값으로 갱신
    minX, minY = min(minX, x), min(minY, y)
    # 현재 점의 x, y좌표와 지금까지의 최댓값을 비교하여 더 큰 값으로 갱신
    maxX, maxY = max(maxX, x), max(maxY, y)

# 모든 옥구슬을 포함하는 가장 작은 직사각형의 넓이 계산
# 넓이 = 가로 × 세로
print((maxX - minX) * (maxY - minY))