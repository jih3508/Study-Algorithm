n, x = map(int, input().split())
arr = [i for i in list(map(int , input().split())) if i < x]
print(' '.join( map(str, arr)))