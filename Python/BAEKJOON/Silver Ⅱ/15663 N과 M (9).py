def NM(p =[]):
    if(len(p) == M):
        string = ' '.join(map(str, p))
        if string not in set_list:
            print(string)
            set_list.add(string)
        return
    for i in range(N):
        if not visited[i]:
            visited[i] = True
            NM(p + [array[i]])
            visited[i] = False
        
N, M = map(int, input().split())
array = sorted(list(map(int, input().split())))
visited = [False] * N
set_list = set({})
NM()