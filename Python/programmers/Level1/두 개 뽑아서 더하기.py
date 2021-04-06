from itertools import combinations

def solution(numbers):
    answer = []
    for nums in combinations(numbers, 2):
        answer.append(sum(nums))
    return sorted(list(set(answer)))

print(solution([2,1,3,4,1]))
print(solution([5,0,2,7]))