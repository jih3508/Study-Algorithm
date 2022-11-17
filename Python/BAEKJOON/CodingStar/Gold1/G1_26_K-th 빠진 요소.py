def k_th(n, arr):
    # 1. 리스트를 집합으로 바꿔서 차집합을 구한다.
    # 2. 다시 리스트로 만들어서 정렬한다.
    s = sorted(list(set(range(min(arr), max(arr)+1)) - set(arr)))
    return s[n-1] if len(s) >= n else -1 # k번째가 차집합 리스트개보다 크면 -1로 반환한다.
    
n = int(input())
arr = list(map(int, input().split()))
print(k_th(n, arr))