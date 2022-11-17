def self_number(n):
    return sum(set(range(1,n+1)) - set([i+ sum(map(int, str(i))) for i in range(1,n+1)]))
    
n=int(input())
print(self_number(n))