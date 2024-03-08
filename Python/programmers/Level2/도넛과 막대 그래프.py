# URL: https://school.programmers.co.kr/learn/courses/30/lessons/258711
def solution(edges):
    answer = [0, 0, 0, 0]

    nodeCnt = dict({})
    for edge in edges:
        a = edge[0]
        b = edge[1]
        # 나가는것, 들어것 개수를 저장한다.
        if not nodeCnt.get(a):
            nodeCnt[a] = [0, 0]
        if not nodeCnt.get(b):
            nodeCnt[b] = [0, 0]
        nodeCnt[a][0] += 1
        nodeCnt[b][1] += 1

    for key, cnts in nodeCnt.items():

        # 나가는 간선이 2개이상 들어오는 간선이 0개인것을 생성점
        if cnts[0] >= 2 and cnts[1] == 0:
            answer[0] = key
        # 나가는 간선이 없고 들어오는 간선 1개 이상일때 막대 그래프 개수 추가
        elif cnts[0] == 0 and cnts[1] > 0:
            answer[2] += 1
        # 들어오는 간선 2개 이상 나가는 간선 2개 이상일때 8자 모양 그래프 개수 추가
        elif cnts[0] >= 2 and cnts[2] >= 2:
            answer[3] += 1
    # 점정에서 나가는 간선에서 막대 그래프 8자 모양 제외한것이 8자 모양 그래프임
    answer[1] = nodeCnt[answer[0]] - answer[2] - answer[3]
    return answer

print(solution([[2, 3], [4, 3], [1, 1], [2, 1]]))
print(solution([[4, 11], [1, 12], [8, 3], [12, 7], [4, 2], [7, 11], [4, 8], [9, 6], [10, 11], [6, 10], [3, 5], [11, 1], [5, 3], [11, 9], [3, 8]]))