from collections import deque

n, k = map(int, input().split())
array = [0] * (2 * 10 ** 5 + 1)
array[n] = 0
queue = deque([n])
while queue:
    num = queue.popleft()
    if num == k: break
    num_array = [num-1, num+1, num * 2]
    for i in num_array:
        if 0<= i <= 10 ** 5 and not array[i]:
            array[i] = array[num] + 1
            queue.append(i)

print(array[k])