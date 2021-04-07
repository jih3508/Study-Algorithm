N = int(input())
for _ in range(N):
    Parenthesis = input()
    balenced = 0
    flag = 1
    for s in Parenthesis:
        if s == '(': balenced += 1
        else: balenced -= 1
        if balenced<0:
            flag = 0
            break
    print(('NO', 'YES')[flag and  balenced == 0])