N, K = map(int, input().split())

array = list(map(int, input().split()))
s = [0, array[0]]
for i in range(1, N):
    s.append(array[i] + s[i])

max_value = -100 * K
for i in range( N - K + 1):
    max_value = max(max_value, s[i + K] - s[i])

print(max_value)