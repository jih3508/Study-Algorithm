import sys
sys.stdin=open("./Me/section06/input.txt", "r")

def dfs(arr = []):
    global count
    if len(arr) == M:
        count += 1
        print(' '.join(map(str, arr)))
        return
    
    for i in range(1, N + 1):
        dfs(arr + [i])

N, M = map(int, input().split())
count = 0
dfs()
print(count)