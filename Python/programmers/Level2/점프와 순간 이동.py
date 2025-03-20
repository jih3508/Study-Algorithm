from collections import deque

def solution(n):
    count = 0
    while n:
        if n % 2 == 0:
            n //= 2
        else:
            n -= 1
            count += 1
    return count


print(solution(5))
print(solution(6))
print(solution(5000))