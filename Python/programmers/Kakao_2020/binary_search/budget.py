def solution(budgets, M):
    answer = 0
    #���Ѿ��� 0�� ���� max(budgets) ������ ��
    start = 0
    end = max(budgets)
    # ���� Ž��(Binary Search) ����
    while start <= end:
        mid = (end + start) // 2
        #��� ���濡�� ������ �� �ݾ��� ���
        money = 0
        for budget in budgets:
            money += min(mid, budget)
        print(end, start, mid, money)
        #������ ������ ���
        if money <= M:
            answer = mid # ������ ��ȯ���� ����
            start = mid +1 #�� ū ���Ѿ׵� �������� Ȯ��
        #������ �Ұ����� ���
        else:
            end = mid - 1 # ���Ѿ��� ���߱�
    return answer

print(solution([120, 110, 140, 150], 485))