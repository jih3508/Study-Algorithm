def count2(num):
    result = 0;
    i = 2
    while( i <= num):
        result += num//i
        i *= 2
    return result

def count5(num):
    result = 0;
    i = 5
    while( i <= num):
        result += num//i
        i *= 5
    return result

n, m =  map(int, input().split())

cnt2 = count2(n) - count2(m) - count2(n-m)
cnt5 = count5(n) - count5(m) - count5(n-m)

print(min(cnt2, cnt5))