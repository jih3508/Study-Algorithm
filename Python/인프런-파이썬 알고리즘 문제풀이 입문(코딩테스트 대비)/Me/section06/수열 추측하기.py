import sys
from copy import deepcopy
sys.stdin=open("./Me/section06/input.txt", "r")

def pascar(arr):
    while len(arr) > 1:
        lines = []
        for i in range(len(arr) - 1):
            lines.append(arr[i] + arr[i + 1])
        arr = deepcopy(lines)
    return arr[0]

def dfs(arr = []):
    if len(arr) == N:
        if F == pascar(arr):
            print(' '.join(map(str, arr)))
            exit()
        return
    for i in range(1, N + 1):
        if i not in arr:
            dfs(arr + [i])

N, F = map(int, input().split())
dfs()
