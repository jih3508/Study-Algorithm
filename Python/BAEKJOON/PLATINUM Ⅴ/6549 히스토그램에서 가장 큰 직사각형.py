import sys
input = sys.stdin.readline

def solution(l, r):
    global heights
    if(l == r): return heights[l]
    mid = (r + l) // 2
    # 반반 쪼개서 가장 큰 부분을 가져온다.
    area = max(solution(l, mid), solution(mid + 1, r))
    lmid  = mid
    rmid = mid + 1
    height = min(heights[lmid], heights[rmid])

    # 이전 구한 값과 중간 위치의 넓이를 비교해서 가장 큰 것은 가져 온다.
    area = max(area, height * 2, heights[lmid], heights[rmid])
    while (l < lmid or rmid < r):
        if(rmid < r and ((lmid <= l) or (heights[lmid - 1] < heights[rmid + 1]))):
            rmid += 1
            height = min(height, heights[rmid])
        else:
            lmid -= 1
            height = min(height, heights[lmid])
        area = max(area, height * (rmid - lmid + 1))
    return area

while 1:
    N, *heights = map(int, input().split())
    if  N == 0: break
    print(solution(0, N - 1))