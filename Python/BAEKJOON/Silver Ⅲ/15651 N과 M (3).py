def NM(array):
    if len(array) == M:
        print(' '.join(map(str, array)))
    else:
        for i in range(1, N + 1):
            NM(array + [i])

N, M = map(int, input().split())
NM([])