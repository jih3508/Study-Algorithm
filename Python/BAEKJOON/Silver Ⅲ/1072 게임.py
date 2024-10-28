X, Y = map(int, input().split())
Z = Y * 100 // X
start, end = 0, X
result = X #결과

# 이분탐색
# 확율 올라가는것이 최소 될때까지 탐색
while start <= end:

    mid = (start + end) // 2
    # 이긴 횟수 증가후 승률
    nowRate = (Y + mid) * 100 // (X + mid)
    # nowRate가 Z보다 크면 end값을 줄인다.
    if(nowRate > Z):
        result = mid
        end = mid - 1
    else:
        start = mid + 1

print(result if Z < 99 else -1)