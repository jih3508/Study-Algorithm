def card_suffle(arr,a,b):
    r=arr[a-1:b] # ������ ���������� ���� �����´�.
    r.reverse() # �����´�.
    arr[a-1:b]=r # �� �������� ���� ��ġ�� �ٽ� �ִ´�.
    return arr

card, before , after = map(int, input().split())
print(card_suffle(list(range(1,card+1)), before, after))