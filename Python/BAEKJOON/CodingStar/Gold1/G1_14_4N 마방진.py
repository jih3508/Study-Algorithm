def magic(n):
    matrix = [[0 for _ in range(n)] for _ in range(n)]
    for i in range(n):
        for j in range(n):
            check = (i%4 == j%4) or (i%4+j%4)%4 == 3 # 주 대각선, 부 대각선
            matrix[i][j] = (n*i+j+1, (n-i)*n-j)[check] #주, 부 대각선이면 반대 위치 숫자 바꾼다. 
    for i in range(n):
        for j in matrix[i]:
            print("%4d"%j, end='')
        print()

n = int(input())
magic(n)