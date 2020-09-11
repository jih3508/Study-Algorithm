def solution(budgets, M):
    answer = 0
    #상한액은 0원 부터 max(budgets) 사이의 값
    start = 0
    end = max(budgets)
    # 이진 탐색(Binary Search) 수행
    while start <= end:
        mid = (end + start) // 2
        #모든 지방에게 배정될 총 금액을 계산
        money = 0
        for budget in budgets:
            money += min(mid, budget)
        print(end, start, mid, money)
        #배정이 가능한 경우
        if money <= M:
            answer = mid # 현재의 상환액을 저장
            start = mid +1 #더 큰 상한액도 가능한지 확인
        #배정이 불가능한 경우
        else:
            end = mid - 1 # 상한액을 낮추기
    return answer

print(solution([120, 110, 140, 150], 485))