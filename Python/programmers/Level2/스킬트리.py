from collections import deque

def solution(skill, skill_trees):
    answer = 0

    for skill_tree in skill_trees:
        queue = deque(skill)
        flag = True

        for s in skill_tree:
            # 스킬 트리 포함 되면 지금 스킬과 큐를 뽑은 스킬이 다르면 순서가 다르다.
            if s in queue:
                if s != queue.popleft():
                    flag = False
                    break

        if flag:
            answer += 1

    return answer


print(solution("CBD", ["BACDE", "CBADF", "AECB", "BDA"]))