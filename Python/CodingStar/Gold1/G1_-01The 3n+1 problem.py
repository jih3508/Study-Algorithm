f = [1 for _ in range(1000001)] # 미리 최대치까지 저장할 리스트 만든다.
for i in range(2, 1000001): # 2부터 1000000까지 반복 횟수 만들다.
    cnt = 1 # 자기자신도 횟수에 포함된다.
    n = i #원 값을 보존하다.
    while 1:
        if n % 2 == 1: # 만약 홀수일 경우
            n = n*3 + 1
            cnt += 1
        n //= 2  #짝수 일때 2로 나눈다.
        #만약 자기자신값보다 낮으면 그 값과 지금 까지 반복횟수를 구하고 빠져나온다.
        if n < i: 
            f[i] = cnt + f[n]
            break
        cnt +=1 #자기자신보다 낮기전까지 반복횟수 구한다.

data = ','.join(iter(input,''))
for i in data.split(','):
    a, b = map(int, i.split())
    x, y = a, b #만약 뒤보다 앞이 크면 바꾼다.
    if x> y: x, y= y, x
    print(a, b, max(f[x:y]))