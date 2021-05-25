def ascending(array):
    value = array[0]
    count = 1
    for tropy in array[1:]:
        if value < tropy:
            count += 1
            value = tropy
    return count

n = int(input())
array = [int(input()) for _ in range(n)]
print(ascending(array))
array.reverse()
print(ascending(array))