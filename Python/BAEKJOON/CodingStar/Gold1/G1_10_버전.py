from itertools import zip_longest
def version(a, b):
    a = list(map(int, a.split('.')))
    b = list(map(int, b.split('.')))
    for x, y in zip_longest(a, b, fillvalue=0): #빈자리는 0으로 채운다.
        if x>y: return ">"
        elif x<y: return "<"
    return "="
    
data = [i.split() for i in input().split(',')]
for ch in data:
    print("{0[0]} {1} {0[1]}".format(ch, version(*ch))) #여러개 인수를 전달한다.