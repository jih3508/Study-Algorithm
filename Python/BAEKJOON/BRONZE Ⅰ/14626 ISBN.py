original = input()

for i in range(0, 10):
    ISBN = original.replace("*", str(i))

    sum_num = 0
    for j in range(13):
        sum_num += int(ISBN[j]) if j % 2 == 0 else int(ISBN[j]) * 3

    if sum_num % 10 == 0:
        print(i)
