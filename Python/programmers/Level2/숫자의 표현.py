def solution(n):
    answer = 0

    for i in range(1, n + 1):
        accSum = 0
        for j in range(i, n + 1):
            accSum += j
            if accSum == n:
                answer += 1
            elif accSum > n:
                break
    len([i for i in range(1, n + 1, 2) if n % i is 0])
    return answer

print(solution(15))