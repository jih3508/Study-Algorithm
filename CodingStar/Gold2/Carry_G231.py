#각 자리까지 더해서 자리 올림 구하기
def carry(a,b):
    m=max(len(str(a)),len(str(b))) # 큰 자리 수 구하기
    # 각 자리 더해서 자리 수 만큼 나눠서 자리 올려 지는 개수 구한다.
    return sum([(lambda x: (a%x+b%x)//x)(10**n)  for n in range(1,m+1)])

x,y = map(int, input().split())
print(carry(x,y))
# (lambda x: (a%x+b%x)//x)(10**n): (10**n)을 값을 x에 넘겨줌
