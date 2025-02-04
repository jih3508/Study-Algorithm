def solution(park, routes):

    row = len(park)
    col = len(park[0])

    # 시작 위치 찾기
    for i in range(row):
        for j in range(col):
            # 시작 위치 찾으면 x, y 찾기
            if park[i][j] == "S":
                x, y = i, j
                break

    # 이동 경로를 하나씩 처리
    for route in routes:
        op, move = route.split()
        move = int(move) # 이동 거리

        # 이동할 위치를 계산하기 위한 변수 초기화
        fx, fy = x, y
        is_move = True # 이동 가능 여부 체크

        # 이동 거리만큼 반복
        for i in range(move):
            if op == "N":
                fx -= 1  # 북쪽 이동 (행 감소)
            elif op == "W":
                fy -= 1  # 남쪽 이동 (행 증가)
            elif op == "E":
                fy += 1  # 서쪽 이동 (열 감소)
            elif op == "S":
                fx += 1  # 동쪽 이동 (열 증가)

            # 공원의 범위를 벗어나거나 장애물('X')을 만난 경우 이동 불가능 처리
            if(0 > fx or fx >= row or 0 > fy or fy >= col) or park[fx][fy] == "X":
                is_move = False
                break

        # 이동 가능할 경우 새로운 위치를 현재 위치로 업데이트
        if is_move:
            x, y = fx, fy

    return [x, y]


park = ["SOO","OOO","OOO"]
routes = ["E 2","S 2","W 1"]
print(solution(park, routes))

park = ["SOO","OXX","OOO"]
routes = ["E 2","S 2","W 1"]
print(solution(park, routes))

park = ["OSO","OOO","OXO","OOO"]
routes = ["E 2","S 3","W 1"]
print(solution(park, routes))