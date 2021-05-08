N = list(input())
print(''.join(map(str, sorted(list(map(int, N)), reverse=True))))