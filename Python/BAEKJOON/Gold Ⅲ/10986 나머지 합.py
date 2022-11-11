N, M = map(int, input().split())
A = list(map(int, input().split()))


prefix_sum = 0
divided = [0] * M
for i in range(N):
    prefix_sum += A[i]
    divided[prefix_sum % M] += 1

count = divided[0]
for i in divided:
    count += i * (i - 1) // 2

print(count)