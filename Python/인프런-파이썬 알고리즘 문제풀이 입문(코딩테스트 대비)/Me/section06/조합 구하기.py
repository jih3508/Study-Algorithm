import sys
sys.stdin=open("./Me/section06/input.txt", "r")

def dfs(index, arr = []):
    global count
    if len(arr) == M:
        count += 1
        print(' '.join(map(str, arr)))
        return   
    for i in range(index, N + 1):
        dfs(i + 1, arr + [i])

N, M = map(int, input().split())
count = 0
dfs(1)
print(count)