import sys
sys.stdin=open("./Me/section06/input.txt", "r")

def subset(count, arr = []):
    if count == N + 1:
        print(' '.join(map(str, arr)))
        return
    arr.append(count)
    subset(count + 1, arr)
    arr.pop()
    subset(count + 1, arr)


N = int(input())
subset(1)