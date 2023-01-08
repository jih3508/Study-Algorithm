N, M = map(int, input().split())
books = sorted(list(map(int, input().split())))

left = []
right= []
for book in books:
    if book < 0:
        left.append(-book)
    else:
        right.append(book)

right.reverse()

print((sum(left[::M]) + sum(right[::M])) * 2 - max(left + right))