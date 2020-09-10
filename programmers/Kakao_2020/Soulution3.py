# 2���� ����Ʈ 90�� ȸ���ϱ�
def rotate_a_matrix_by_90_degree(a):
    n = len(a) # �� ���� ���
    m = len(a[0]) # �� ���� ���
    
    result = [[0] * n for _ in range(m)]
    for i in range(n):
        for j in range(m):
            result[j][n-i-1] = a[i][j]
    return result

# �ڹ����� �߰� �κ��� ��� 1���� Ȯ��
def check(new_lock):
    lock_length = len(new_lock) // 3
    
    for i in range(lock_length, lock_length *2):
        for j in range(lock_length, lock_length * 2):
            if new_lock[i][j] != 1:
                return False
    return True

def solution(key, lock):
    n = len(lock)
    m = len(key)
    
    # �ڹ����� ũ�⸦ ������ 3��� ��ȯ
    new_lock = [[0] * (n * 3) for _ in range(n * 3)]
    
    # ���ο� �ڹ����� �߾� �κп� ������ �ڹ��� �ֱ�
    for i in range(n):
        for j in range(n):
            new_lock[i + n][j + n] = lock[i][j]
            
    # 4���� ���⿡ ���ؼ� Ȯ��
    for rotation in range(4):
        key = rotate_a_matrix_by_90_degree(key) # ���� ȸ��
        for x in range(n * 2):
            for y in range(n * 2):
                #�ڹ��迡 ���踦 ���� �ֽ��ϴ�.
                for i in range(m):
                    for j in range(m):
                        new_lock[x + i][y + j] += key[i][j]
                # ���ο� �ڹ��迡 ���谡 ��Ȯ�� ��� �´��� �˻�
                if  check(new_lock) == True:
                    return True
                # �ڹ��迡�� ���踦 �ٽ� �����ϴ�.
                for i in range(m):
                    for j in range(m):
                        new_lock[x + i][y + j] -= key[i][j]

print(solution([[0, 0, 0], [1, 0, 0], [0, 1, 1]], 
               [[1, 1, 1], [1, 1, 0], [1, 0, 1]]))