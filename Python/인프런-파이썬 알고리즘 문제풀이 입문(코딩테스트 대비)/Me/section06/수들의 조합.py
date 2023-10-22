import sys
sys.stdin=open("./Me/section06/input.txt", "r")

def dfs(index, arr = []):
    global count
    if len(arr) == K:
        if sum(arr) % M == 0:
            count += 1
        return   
    for i in range(index, N):
        dfs(i + 1, arr + [array[i]])

N, K = map(int, input().split())
array = list(map(int, input().split()))
M = int(input())
count = 0
dfs(0)
print(count)