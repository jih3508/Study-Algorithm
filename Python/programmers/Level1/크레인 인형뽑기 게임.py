def solution(board, moves):
    answer = 0
    s= []
    for k in moves:
        for i in range(len(board)):
            if board[i][k-1] != 0:
                s.append(board[i][k-1])
                board[i][k-1] = 0
                break
        if len(s) > 1:
            if s[-1] == s[-2]:
                del s[-1:-3:-1]
                answer +=2
    print(s)       
    return answer

print(solution([[0,0,0,0,0],[0,0,1,0,3],[0,2,5,0,1],[4,2,4,4,2],[3,5,1,3,1]],[1,5,3,5,1,2,1,4]))

