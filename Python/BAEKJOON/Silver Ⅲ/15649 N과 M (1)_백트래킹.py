def NM(m, array):
    if m == M:
        print(' '.join(map(str, array)))
    else:
        for k in range(1, N + 1):
            if k not in array:
                NM(m + 1, array + [k])

N, M = map(int, input().split())
NM(0, [])