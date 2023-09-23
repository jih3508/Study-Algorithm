N = int(input())
center = N //2
result = 0
board = [list(map(int, input().split())) for _ in range(N)]
for i in range(N):
    #print((center - i, center + i + 1 )if i <= center else (i - center , N - (i - center)))
    #print((board[i][center - i: center + i + 1]) if i <= center else board[i][i - center :N - (i - center)])
    result += sum(board[i][center - i: center + i + 1]) if i <= center else sum(board[i][i - center : N - (i - center)])

print(result)