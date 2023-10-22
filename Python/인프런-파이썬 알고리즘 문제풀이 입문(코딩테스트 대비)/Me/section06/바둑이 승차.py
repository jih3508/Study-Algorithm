import sys
sys.stdin=open("./Me/section06/input.txt", "r")

max_value = 0

def dfs(count, weight1 = 0, weight2 = 0):
    global max_value
    if weight1 + (total - weight2) < max_value: return
    if weight1 > C: return
    elif count == N:
        max_value = weight1 if weight1 <= C and max_value < weight1 else max_value
        return
    else:
        dfs(count + 1, weight1 + array[count], weight2 + + array[count])
        dfs(count + 1, weight1, weight2 + + array[count])
            


C, N = map(int, input().split())
array = [int(input()) for _ in range(N)]
total = sum(array)
dfs(0)

print(max_value)