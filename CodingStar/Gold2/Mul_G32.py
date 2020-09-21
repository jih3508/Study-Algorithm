def mul(n):
    return sum([eval('*'.join(str(i))) for i in range(1,n+1)])

n=int(input())
print(mul(n))
