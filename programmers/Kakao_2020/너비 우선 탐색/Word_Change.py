from collections import deque

# 단어를 변환할 수 있는 경우 (1개 이하의 알파벳만 다른 경우)
def possible(begin, target):
    length = len(begin)
    count = 0 # 다른 알파벳의 개수
    for i in range(length):
        # 두 알파벳이 서로 다를 때마다 카운트
        if begin[i] != target[i]:
            count += 1
        if count == 2: # 알파벳이 2개 이상 다르다면 거짓(False) 반환
            return False
    return True

def solution(begin, target, words):
    visited = {begin: 0} # 특정 단어로의 최소 변환 횟수 기록
    # 너비 우선 탐색(BFS) 시작
    q = deque([begin])
    while q:
        now = q.popleft()
        for word in words: # 모든 단어를 확인하며
            # 아직 방문하지 않았으며 반환이 가능하다면 방문 처리
            if word not in visited and possible(now, word):
                visited[word] = visited[now] + 1
                print(visited , word, now)
                q.append(word)
                print(q)
    # 목표 단어로 변환이 가능하다면 최소 변환 횟수 출력
    if target in visited:
        return visited[target]
    return 0

print(solution("hit", "cog", ["hot", "dot", "dog", "lot", "log", "cog"]))