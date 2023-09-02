N, K = map(int, input().split());
measures = []
for i in range(1, N + 1):
    if N % i == 0:
        measures.append(i)

print(-1 if len(measures) < K else measures[K - 1])