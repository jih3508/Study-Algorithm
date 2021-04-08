n = int(input())
for _ in range(n):
    H, W, N = map(int, input().split())
    q, r = divmod(N, H)
    print(100*r + q+ 1 if r != 0 else H*100 + q)