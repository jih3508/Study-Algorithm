def operate(n, p, mi, mu, di, number, s):
    global max_value, min_value
    if n == N:
        max_value = max(max_value, number)
        min_value = min(min_value, number)
        return
    
    if p > 0:
        operate(n + 1, p - 1, mi, mu, di, number + numbers[n], s + '+' + str(numbers[n]))
    if mi > 0:
        operate(n + 1, p, mi - 1, mu, di, number - numbers[n], s + '-' + str(numbers[n]))
    if mu > 0:
        operate(n + 1, p, mi, mu - 1, di, number * numbers[n], s + '*' + str(numbers[n]))
    if di > 0:
        operate(n + 1, p, mi, mu, di - 1, int(number / numbers[n]), s + '//' + str(numbers[n]))
    
N = int(input())
numbers = list(map(int, input().split()))
pl, mi, mu, di = map(int, input().split())
max_value = -1e10
min_value = 1e10
operate(1, pl, mi, mu, di, numbers[0], str(numbers[0]))
print(max_value)
print(min_value)