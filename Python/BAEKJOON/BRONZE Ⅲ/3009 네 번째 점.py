point = [list(map(int, input().split())) for _ in range(3)]
print(point[0][0] ^ point[1][0] ^ point[2][0], point[0][1] ^ point[1][1] ^ point[2][1])