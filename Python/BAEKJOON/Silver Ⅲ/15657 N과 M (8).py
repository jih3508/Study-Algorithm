def NM(x, p =[]):
    if(len(p) == M):
        print(' '.join(map(str, p)))
        return
    for i in range(x, N):
        NM(i, p + [array[i]])
        
N, M = map(int, input().split())
array = sorted(list(map(int, input().split())))
NM(0)