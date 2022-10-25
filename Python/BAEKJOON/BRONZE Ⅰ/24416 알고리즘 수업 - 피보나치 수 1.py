def fib(n):
    global count1
    if n <=2: return 1
    count1 += 1
    return fib(n-1) + fib(n - 2)

def fibonacci(n):
    global count2
    f = [1] * (n + 1)
    for i in range(3, n + 1):
        count2 += 1
        f[i] = f[i-1] + f[i-2]
    return f[n]

N = int(input())
count1 = 1
count2 = 0

fib(N)
fibonacci(N)
print(count1, count2)