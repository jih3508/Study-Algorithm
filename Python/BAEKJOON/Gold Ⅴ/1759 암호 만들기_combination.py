from itertools import combinations

def check(a):
    count = 0
    for al in data:
        count += al in included
    return count

L, C = map(int, input().split())
alpaber = sorted(list(input().split()))
included = set({'a', 'e', 'i', 'o', 'u' })
result = []
for data in combinations(alpaber, L):
    count = check(data)
    if(count >=1 and C - count >= 2):
        result.append(sorted(data))

result.sort()
for data in result:
    print(''.join(data))