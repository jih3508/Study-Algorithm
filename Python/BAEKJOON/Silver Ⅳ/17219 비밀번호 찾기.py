import sys
    
input = sys.stdin.readline

dic = {}
n, m = map(int, input().split())
for _ in range(n):
    site, password = input().split()
    dic[site] = password

for _ in range(m): 
    site = input().rstrip("\n")
    print(dic[site])