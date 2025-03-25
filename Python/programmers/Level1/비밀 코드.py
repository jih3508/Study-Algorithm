"""
비밀 코드 해독
https://school.programmers.co.kr/learn/courses/30/lessons/388352
"""
def solution(n, q, ans):
    answer = 0
    size = len(ans)
    def recursive(index, arr=[]):
        global answer


    return answer


n = 10
q = [[1, 2, 3, 4, 5], [6, 7, 8, 9, 10], [3, 7, 8, 9, 10], [2, 5, 7, 9, 10], [3, 4, 5, 6, 7]]
ans = [2, 3, 4, 3, 3]
print(solution(n, q, ans));

n = 15;
q = [[2, 3, 9, 12, 13], [1, 4, 6, 7, 9], [1, 2, 8, 10, 12], [6, 7, 11, 13, 15], [1, 4, 10, 11, 14]];
ans = [2, 1, 3, 0, 1];
print(solution(n, q, ans));