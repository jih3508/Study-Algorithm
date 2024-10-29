import sys
import math
input = sys.stdin.readline

for _ in range(int(input())):
  N = int(input())
  # 10 ^ 16승 부터 수열 합구하면 Long 타입 벗아나서 N보다 범위 좁혀야 한다.
  # 수열의 계산 따르면 답은 (2 * N) ^ 0.5 안에 있어서 end를 (2 * N) ^ 0.5로 한다.
  start, end = 0, int(math.sqrt(2 * N + 1))
  result = 0
  while(start <= end):
    mid = (start + end) // 2
    # 이전 징검다리 이동한 수에서 최소 한칸더 움직인다면 N 수열의 합으로 체크 한다.
    count = mid * (mid + 1) // 2
    if(count <= N):
      start = mid + 1
      # 이전 mid가 범위가 더 작아 질수 있으로 이전 result과 비교해서 최대 값을 넣는다.
      result = max(result, mid)
    else:
      end = mid - 1
  print(result)