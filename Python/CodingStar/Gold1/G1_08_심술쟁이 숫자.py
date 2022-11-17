def ugly_numbers(n):
    s = [1]
    while n>1: # 한개 씩 줄이면서 찾는다
        s = list(set(s + list(map(lambda x: s[0]*x, [2, 3, 5])))) # 각 원소를 곱해서 리스트에 저장한다.
        s.sort()
        del s[0] #첫번째 원소를 삭제
        del s[n:] # n보다 길이 삭제 함으로서 속도를 빠르게 한다.
        n-=1 # 카운터를 줄인다.
    return s[0]

n = int(input())
print(ugly_numbers(n))