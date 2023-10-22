import sys
sys.stdin=open("./Me/section06/input.txt", "r")

def dfs(index, arr = []):
    global count
    if sum(arr) == M:
        count = min(count, len(arr))
        return
    elif sum(arr) > M:
        return  
    elif count < len(arr):
        return
    for i in range(index, N):
        dfs(i, arr + [charges[i]])
    

N = int(input())
charges = list(map(int, input().split()))
charges.sort(reverse=True)
M = int(input())
count = 1e10
dfs(0)
print(count)