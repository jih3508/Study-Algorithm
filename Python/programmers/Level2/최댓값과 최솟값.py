def solution(s):
    numbers = list(map(int, s.split()))  # 문자열을 리스트로 변경

    return "{} {}".format(min(numbers), max(numbers))


print(solution("1 2 3 4"))
print(solution("-1 -2 -3 -4"))
print(solution("-1 -1"))