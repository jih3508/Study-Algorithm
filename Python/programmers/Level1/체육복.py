def solution(n, lost, reserve):
    set_lost = set(lost) - set(reserve)
    set_reserve = set(reserve) - set(lost)


    for num in sorted(set_reserve):
        if num - 1 in set_lost:
            set_lost.remove(num - 1)
        elif num + 1 in set_lost:
            set_lost.remove(num + 1)

    return n - len(set_lost)

print(solution(5, [2, 4], [1, 3, 5]))
print(solution(5,[2,4], [3]))
print(solution(3, [3], [1]))