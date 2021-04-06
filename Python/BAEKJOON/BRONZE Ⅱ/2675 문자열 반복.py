n = int(input())
for _ in range(n):
    a, b = input().split()
    for i in b:
        print(i*int(a),end='')
    print()