def jolly(x):
    return set(abs(x[i]-x[i+1]) for i in range(len(x)-1)) == set(list(range(1,len(x))))
 
arr = list(map(int, input().split()))
print(jolly(arr))