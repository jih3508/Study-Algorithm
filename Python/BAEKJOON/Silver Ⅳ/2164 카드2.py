def card(n):
    num = 2 * (n - 2 ** (len(bin(n))-3))
    return  n if num == 0 else num

n = int(input())
print(card(n))