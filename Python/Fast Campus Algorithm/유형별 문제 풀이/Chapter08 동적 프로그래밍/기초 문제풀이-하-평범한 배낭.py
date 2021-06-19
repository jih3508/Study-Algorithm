'''
- �賶 ����(Knapsack Problem)���ε� �˷��� �ִ�, �������� ���� ���α׷��� �����̴�.
- ��ǰ�� ���� N, �賶�� ���� �� �ִ� ���԰� K�̴�.
- ���� ���α׷����� �̿��Ͽ� �ð� ���⵵ O(NK)�� ������ �ذ��� �� �ִ�.
- ��� ���Կ� ���Ͽ� �ִ� ��ġ�� ����
- D[i][j] = �賶�� ���� ��ǰ�� ���� ���� J�� �� ���� �� �ִ� �ִ� ��ġ
- �� ��ǰ�� ��ȣ i�� ���� �ִ� ��ġ ���̺� D[i][j]�� �����Ͽ� ������ �ذ��� �� �ִ�.
D[i][j] = D[i-1][j] (if j < W[i])
        = max(D[i - 1][j], D[i-1][j - W[i] + V[i]]) if j >= W[i]
'''
import sys
input = sys.stdin.readline

n, k = map(int, input().split())
dp = [[0] * (k + 1) for _ in range(n + 1)]

for i in range(1, n + 1):
    weight, value = map(int, input().split())
    for j in range(1, k + 1):
        if j < weight:
            dp[i][j] = dp[i-1][j]
        else: dp[i][j] = max(dp[i - 1][j], dp[i - 1][j - weight] + value)

print(dp[n][k])