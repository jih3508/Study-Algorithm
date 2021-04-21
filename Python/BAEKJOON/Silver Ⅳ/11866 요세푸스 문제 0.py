N, K = map(int, input().split())
arr1 = list(range(1, N+1))
i = K - 1
arr2 = list([])
r = 0
while arr1:
    r = (r + len(arr1)) % K # 뒤에 남은 개수 구하기
    arr2.extend(arr1[i::K]) # 한 라운드에 제거 될 대상 순서대로 저장
    del arr1[i::K] # 제거 될 대상 삭제
    i = K - r - 1 # 라운드 시작 위치 설정
print("<", end='')
print(", ".join(map(str, arr2)), end="")
print(">")