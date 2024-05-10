def solution(A,B):
    answer = 0

    # 작은것, 큰 순으로 곱해야 최소값이 나오기 때문에 다른 한쪽은 역순으로 정렬
    A.sort()
    B.sort(reverse=True)

    for num1, num2 in zip(A, B):
        answer += num1 * num2

    return answer


print(solution([1, 4, 2], [5, 4, 4]))
print(solution([1, 2], [3, 4]))