'''
- ���ʴ�� ���� �����Ѵٴ� ������, ���� ���α׷������� �ذ��� �� �ִ� ����
- ���� ������ N, ������ �ִ��� M�̴�.
- ���� ���α׷����� �̿��Ͽ� �ð� ���⵵ O(NM)���� ������ �ذ�
- �ٽɾ��̵��: ��� ������ ���Ͽ� ���� ���� ���θ� ����ϱ�
- D[i][j + 1] =i ��° �뷡�� �� j ũ���� �������� ���� �������� ����
- �뷡�� ������� Ȯ���ϸ�, �� �� ��� ũ���� ������ ���Ͽ� �˻�
- D[i][j - V[i]] = True (if D[i-1][j] = True)
- D[i][j + V[i]] = True (if D[i-1][j] = True)
'''
n, s, m = map(int, input().split())
array = list(map(int, input().split()))

dp = [[0] * (m+1) for _ in range(n+1)]
dp[0][s] = 1

for i in range(1, n + 1):
    for j in range(m + 1):
        if dp[i-1][j] == 0:
            continue
        if j - array[i - 1] >= 0: 
            dp[i][j - array[i - 1]] = 1
        if j + array[i - 1] <= m:
            dp[i][j + array[i - 1]] = 1

result = -1
for i in range(m, -1, -1):
    if dp[n][i]== 1:
        result = i
        break
    
print(result)