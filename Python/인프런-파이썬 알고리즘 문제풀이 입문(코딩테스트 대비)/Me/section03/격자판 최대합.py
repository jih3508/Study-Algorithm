N = int(input())
board = [list(map(int, input().split())) for _ in range(N)]

result_sum = []
#행열 합
for i in range(N):
    result_sum.append(sum(board[i]))
    result_sum.append(sum([board[j][i] for j in range(N)]))

result_sum.append(sum(board[i][i] for i in range(N))) # 대각선 합
result_sum.append(sum(board[i][N - i - 1] for i in range(N))) # 역 대각선의 합

print(max(result_sum))