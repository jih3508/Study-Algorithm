N = int(input())
K = int(input())
sensor = sorted(list(map(int, input().split())), reverse=True)
distances = []
for i in range(1, N):
    distances.append(sensor[i - 1] - sensor[i])
distances.sort(reverse=True)
print(sum(distances[K - 1:]))