def magic_constant(n):
    matrix = [[0 for _ in range(n)] for _ in range(n)] #n×n 리스트 생성
    x, y = 0, n//2 # 1은 첫줄 가운데
    for num in range(1, n*n+1):
        matrix[x][y] = num
        if num % n == 0: x+=1 # 배수는 다음 아래에
        else:
            # 한 줄위 한 칸 오른쪽
            x = (x - 1, n - 1)[x == 0] # 가장 오른쪽 다음에는 위의 첫칸
            y = (y + 1, 0)[y == n - 1]
    print(n*(n**2+1)//2)
    for i in range(n):
        for j in matrix[i]:
            print(j, end=' ')
        print()

n = int(input())
magic_constant(n)