import sys
input = sys.stdin.readline

N, M = map(int, input().split())
people1 = set([input().replace("\n", "") for _ in range(N)])
people2 = set([input().replace("\n", "") for _ in range(N)])
people = list(people2 & people1)
people.sort()
     
print(len(people))
print("\n".join(people))