def card_suffle(arr,a,b):
    r=arr[a-1:b] # 뒤집을 범위구간을 따로 가져온다.
    r.reverse() # 뒤집는다.
    arr[a-1:b]=r # 뒤 집은것을 원래 위치에 다시 넣는다.
    return arr

card, before , after = map(int, input().split())
print(card_suffle(list(range(1,card+1)), before, after))