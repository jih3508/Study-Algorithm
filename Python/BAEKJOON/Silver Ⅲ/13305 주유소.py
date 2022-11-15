n = int(input())
roads = list(map(int, input().split()))
costs = list(map(int, input().split()))

# 처음에는 무조건 기름은 넣어야 하기때문에 맨앞에 비용과 거리로 설정한다.
km = roads[0] * costs[0]
cost = costs[0] 
for i in range(1, n-1):
    # 이전 가격이랑 비교해서 싼것 위주로 기름을 넣는다.
    if costs[i] < cost:
        cost = costs[i]
    km += cost * roads[i]
    
print(km)