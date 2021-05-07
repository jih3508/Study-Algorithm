n = int(input())
print(-(n in [4, 7]) or n-2*n//5*2) # 수열식으로 만든것
cnt = 0
while n > 2:
    if n % 5 == 0:
        cnt += n // 5
        n = 0
        break
    n -= 3
    cnt += 1
print(cnt if n == 0 else -1)