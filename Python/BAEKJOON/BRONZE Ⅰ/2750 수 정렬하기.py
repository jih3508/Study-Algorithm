N = int(input())
arr = [int(input()) for _ in range(N)]
arr.sort()
print('\n'.join(map(str, arr)))