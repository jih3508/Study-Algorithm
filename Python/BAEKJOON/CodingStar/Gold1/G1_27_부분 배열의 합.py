def k_sum(r,arr):
    for i in range(1, 1<<r): # 1<<r = 2 ** r (left shift)
        # 2������ ��ȯ�ؼ� 1�� ��ġ�� �� �Ѵ�.
        yield sum([arr[j] for j in range(r) if (1<<j)&i])

n = int(input())
arr = list(map(int, input().split()))
print(sorted(list(k_sum(len(arr), arr)), reverse=True)[n-1])