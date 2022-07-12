N = int(input())
M = int(input())
S = input()

def solution(N, M, S):
    length = 1 + N * 2
    count = 0
    Pcount = 0
    start = 1
    while start < M - 1:
        if S[start-1] == "I" and S[start] == "O" and S[start+1] == "I":
            Pcount += 1
            if Pcount == N:
                count += 1
                Pcount -= 1
            start += 1
        else:
            Pcount = 0
        start += 1
    return count

print(solution(N, M, S))