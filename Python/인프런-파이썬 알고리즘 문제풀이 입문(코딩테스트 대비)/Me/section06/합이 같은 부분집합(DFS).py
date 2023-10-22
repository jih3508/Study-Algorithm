import sys
sys.stdin=open("./Me/section06/input.txt", "r")

flag = False

def subset(count):
    global flag
    if count == N:
        sum1, sum2 = 0, 0
        #print(visited)
        for i in range(N):
            if visited[i]:
                sum1 += array[i]
            else:
                sum2 += array[i]
        #print(sum1, sum2)
        if sum1 == sum2:
            flag = True
        return
    
    visited[count] = 1
    subset(count + 1)
    visited[count] = 0
    subset(count + 1)


N = int(input())
array = list(map(int, input().split()))
visited = [0] * N
subset(0)
print('YES' if flag else 'NO')