def check(string):
    count = 0
    for al in string:
        count += al in included
    return count

def make_password(depth, password):
    if len(password) == L:
        count = check(password)
        if count >= 1 and L -count >= 2:
            print(''.join(password))
            return
    for i in range(depth, C):
        make_password(i + 1, password + alpaber[i])

L, C = map(int, input().split())
alpaber = sorted(list(input().split()))
included = set({'a', 'e', 'i', 'o', 'u' })
make_password(0, "")