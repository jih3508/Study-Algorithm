#�̵� ������ ��ġ�� ��ȯ�ϴ� �ż���
def get_next_pos(pos, board):
    next_pos= [] #��ȯ ��� (�̵� ������ ��ġ��)
    pos = list(pos) # ���� ��ġ
    pos1_x, pos1_y, pos2_x, pos2_y = pos[0][0], pos[0][1], pos[1][0], pos[1][1]
    
    #(��, ��, ��, ��)�� �̵��ϴ� ��쿡 ���ؼ� ó��
    dx = [-1, 1, 0 ,0]
    dy = [0, 0, -1, 1]
    for i in range(4):
        pos1_next_x, pos1_next_y, pos2_next_x, pos2_next_y = pos1_x + dx[i], pos1_y + dy[i], pos2_x + dx[i], pos2_y + dy[i]
        # �̵��ϰ��� �ϴ� �� ĭ�� ��� ����ִٸ�
        if board[pos1_next_x][pos1_next_y] == 0 and board[pos2_next_x][pos2_next_y] == 0:
            next_pos.append({(pos1_next_x, pos1_next_y), (pos2_next_x, pos2_next_y)})
        
    #���� �κ��� ���η� ���� �ִ� ���
    if pos1_x == pos2_x:
        for i in [-1,1]: #�������� ȸ���ϰų�, �Ʒ������� ȸ��
            if board[pos1_x + i][pos1_y] == 0 and board[pos2_x + i][pos2_y] == 0: # ���� Ȥ�� �Ʒ��� �� ĭ�� ��� ��� �ִٸ�
                next_pos.append({(pos1_x, pos1_y), (pos1_x+i, pos1_y)})
                next_pos.append({(pos2_x, pos2_y), (pos2_x+i, pos2_y)})
    
    #���� �κ��� ���η� ���� �ִ� ���
    if pos1_y == pos2_y:
        for i in [-1,1]: #�������� ȸ���ϰų�, �Ʒ������� ȸ��
            if board[pos1_x ][pos1_y + i] == 0 and board[pos2_x ][pos2_y + i] == 0: # ���� Ȥ�� �Ʒ��� �� ĭ�� ��� ��� �ִٸ�
                next_pos.append({(pos1_x, pos1_y), (pos1_x, pos1_y + i)})
                next_pos.append({(pos2_x, pos2_y), (pos2_x, pos2_y + i)})
    
    # ���� ��ġ���� �̵��� �� �ִ� ��ġ�� ��ȯ
    return next_pos

from collections import deque

def solution(board):
    # ���� �ܰ��� ���� �δ� ���·� �� ����
    n = len(board)
    new_board = [[1] * (n + 2) for _ in range(n + 2)]
    for i in range(n):
        for j in range(n):
            new_board[i + 1][j + 1] = board[i][j]
    
    # �ʺ� �켱 Ž��(BFS) ����
    q = deque()
    visited = []
    pos = {(1, 1), (1, 2)} # ���� ��ġ ����
    q.append((pos, 0)) # ť�� ������ �ڿ�
    visited.append(pos) # �湮 ó��
    
    # ť�� �� ������ �ݺ�
    while q:
        pos, cost = q.popleft()
        # (n, n) ��ġ�� �κ��� �����ߴٸ�, �ִ� �Ÿ��̹Ƿ� ��ȯ
        if (n, n) in pos:
            return cost
        # ���� ��ġ���� �̵��� �� �ִ� ��ġ Ȯ��
        for next_pos in get_next_pos(pos, new_board):
            # ���� �湮���� ���� ��ġ��� ť�� �����ϰ� �湫 ó��
            if next_pos not in visited:
                q.append((next_pos, cost + 1))
                visited.append(next_pos)
    return 0

print(solution([[0, 0, 0, 1, 1],[0, 0, 0, 1, 0],[0, 1, 0, 1, 1],[1, 1, 0, 0, 1],[0, 0, 0, 0, 0]]))