def live(arr,n):
    i= n-1 # 첫스타트 위치 변수
    r=0 # 남아있는 개수 변수
    while len(arr)  != 1: # 1명 살아 남을 때까지 죽이기
        r= (len(arr)+r) % n # 각 라운드 끝나 나머지
        del arr[i::n] # 각 라운드 마다 죽어간 사람 삭제
        i= n - r - 1 # 각 라운드의 시작 위치 설정 (간격 - 끝나 뒤의 개수 - 1(배열이 0번째 부터라서))
    return arr[0]    
        
people, n= map(int, input().split())
print(live(list(range(1, people+1)),n))