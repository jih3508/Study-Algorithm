#1. �������� ����(N<=100)�� ���� �����Ƿ�, �ܼ��� �������� �䱸�ϴ� ��� �����Ѵ�.
#2. ���� ����Ʈ���� ���� ū ���� �տ� �� ������ ȸ����Ų �ڿ� �����Ѵ�.
#3. ���� ū ���� ���� M�� �ش��ϸ鼭 ���� �տ� ���� �� ���α׷��� ���� �Ѵ�.
test_case = int(input())
for _ in range(test_case):
    n, m = map(int, input().split())
    queue = list(map(int, input().split()))
    queue = [(i, idx) for idx, i in enumerate(queue)]
    
    count = 0
    while True:
        if queue[0][0] == max(queue, key = lambda x: x[0])[0]:
            count += 1
            if queue[0][1] == m:
                print(count)
                break
            else:
                queue.pop(0)
        else:
            queue.append(queue.pop(0))