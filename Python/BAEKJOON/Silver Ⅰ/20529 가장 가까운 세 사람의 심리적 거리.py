def distance(mbti):
    dist = 0
    for i in range(4):
        dist += mbti[0][i] != mbti[1][i]
        dist += mbti[0][i] != mbti[2][i]
        dist += mbti[1][i] != mbti[2][i]

    return dist



for _ in range(int(input())):
    N = int(input())
    mbtis = input().split()

    if N > 32:
        print(0)
    else:
        result = 12

        for i in range(N):
            for j in range(i + 1, N):
                for k in range(j + 1, N):
                    result = min(distance([mbtis[i], mbtis[j], mbtis[k]]), result)

        print(result)
