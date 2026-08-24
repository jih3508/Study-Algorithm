"""
문제: 숫자게임
url: https://school.programmers.co.kr/learn/courses/30/lessons/12987
"""

def solution(A, B):

    # 반환 개수
    count = 0

    # A,B 정렬
    A.sort()
    B.sort()

    # A, B 인
    A_index, B_index = 0, 0

    while A_index < len(A) and B_index < len(B):
    
        if A[A_index] < B[B_index]:
            A_index += 1
            count += 1

        B_index += 1

    return count


print(solution([5,1,3,7], [2,2,6,8]))
print(solution([2,2,2,2], [1,1,1,1]))