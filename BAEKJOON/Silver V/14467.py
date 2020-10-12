dic={}
n=int(input())
cnt=0
for _ in range(n):
    a,b=map(int, input().split())
    if a in dic:
        cnt += dic[a] != b
    dic[a] =b
print(cnt)