def solution(skill, skill_trees):
    answer = 0
    skill = list(skill)
    for skills in skill_trees:
        flag = 1
        for i in range(len(skills)):
            if skills[i] in skill[1:]:
                p = skill.index(skills[i])
                if set([s for s in skills[:i] if s in skill[:p]]) != set(skill[:p]):
                    flag = 0
                    break
        answer += flag
    return answer

print(solution("CBD", ["BACDE", "CBADF", "AECB", "BDA"]))