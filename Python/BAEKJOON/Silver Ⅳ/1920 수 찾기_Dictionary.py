N, A = int(input()), {i : 1 for i in map(int, input().split())}
M = input()

for num in list(map(int, input().split())):
    print(A.get(num, 0))