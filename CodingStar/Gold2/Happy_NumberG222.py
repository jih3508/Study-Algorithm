msg=['Unhappy Number', 'Happy Number']
def happy(n):
    s=[]
    while (n not in s) and (n != 1):
        s.append(n)
        n=sum( [i*i for i in (map(int,str(n)))])
    return msg[n==1]    

n=int(input())
print(happy(n))