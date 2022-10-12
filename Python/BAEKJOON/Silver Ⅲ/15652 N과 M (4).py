def NM(k, array):
    if len(array) == M:
        print(' '.join(map(str, array)))
    else:
        for i in range(k, N + 1):
            NM(i, array + [i])

N, M = map(int, input().split())
NM(1, [])