def unit(n):
    m = 0 #최대 순환 길이를 저장할 변수
    for i in range(2, n+1): 
        p = 0 # 순환 체크할 변수, 나중에는 길이 대변하는 변수
        s = [] # 순환 마디 저장할 변수
        q, r = divmod(1,i) # 분수 계산
        while p == 0 and r != 0:
            if q: s.append(q) # 몫이 0아니면 저장
            q, r = divmod(r*10,i) # 나머지를 10을 곱해서 소수점을 구한다.
            p = s.count(q) # 몫이 리스트 안에 있으면 빠져 나온다.
        if p: p = len(s[s.index(q):]) #순환이 아니면 패스한다.
        if p > m: #이전 길이보다 크면 저장한다.
            m = p; cycle = s[s.index(q):]; x = i
    print(x, m, cycle)

n = int(input())
unit(n)