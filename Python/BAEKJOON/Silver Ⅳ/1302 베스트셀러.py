n = int(input())
books = {}

for _ in range(n):
    title = input()
    if title not in books:
        books[title] = 1
    else:
        books[title] += 1

print(min([book for book, count in books.items() if count == max(books.values())]))