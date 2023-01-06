def NM(x, p =[]):
    if(len(p) == M):
        string = ' '.join(map(str, p))
        if string not in set_list:
            print(string)
            set_list.add(string)
        return
    for i in range(x, N):
        NM(i, p + [array[i]])
        
N, M = map(int, input().split())
array = sorted(list(map(int, input().split())))
set_list = set({})
NM(0)