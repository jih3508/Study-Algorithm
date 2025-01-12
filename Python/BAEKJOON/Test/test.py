N, M = map(int, input().split())
trees = list(map(int, input().split()))

start = 1
end = max(trees)
while(start <= end):
    mid = (start + end) // 2
    treeCut = sum([ tree - mid if tree > mid else 0 for tree in trees])
    print(start, end, mid)
    print(treeCut)
    if (treeCut >= M):
        start = mid + 1
    else:
        end = mid - 1

print(end)