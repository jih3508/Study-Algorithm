n = int(input())
roads = list(map(int, input().split()))
citys = list(map(int, input().split()))
km = roads[0] * citys[0]
index = 0
for i in range(1, n-1):
    if citys[i] < citys[index]:
        index = i
    km += citys[index] * roads[i]
    
print(km)