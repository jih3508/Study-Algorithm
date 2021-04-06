def piar(arr, n):
    a = arr.index(min(arr)) # 작은 값 위치
    b = arr.index(max(arr)) # 큰 값 위치
    r = len(arr)
    cnt = 0
    while a != b: # 만났을 때 종료
        if arr[a] + arr[b] ==n: # 길이가 같은 경우
            cnt += 1
            if (a+1)%r == b: return cnt # 최종단계일때 종료
            a = (a+1)%r # 그 다음 큰 값 이동
            b = (r + b -1)%r  # 그 다음 작은 값 이동
        elif arr[a] + arr[b] > n: # 합이 클 경우 다음 
            b = (r + b -1)%r
        else: a = (a+1)%r # 작을 경우
    return cnt

arr = list(map(int, input().split()))
n = int(input())
print(piar(arr, n))