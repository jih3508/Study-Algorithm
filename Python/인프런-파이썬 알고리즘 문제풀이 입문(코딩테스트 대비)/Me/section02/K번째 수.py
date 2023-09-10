import sys
input = sys.stdin.readline
for T in range(int(input())):
    N, s, e, k = map(int, input().split())
    arr = sorted(list(map(int, input().split()))[s-1:e])
    print("#{0} {1}".format(T+1,arr[k-1]))