N, L , K = map(int, input().split())

easy, hard = 0, 0

for _ in range(N):
    sub1, sub2 = map(int, input().split())
    if L >= sub2:
        hard += 1
    elif L>= sub1:
        easy += 1

# hard 문제
result = min(K, hard) * 140

# easy 문제
if(K > hard):
    result += min(K-hard, easy) * 100

print(result)