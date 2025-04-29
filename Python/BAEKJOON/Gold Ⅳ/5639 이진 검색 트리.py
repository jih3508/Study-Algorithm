import sys

sys.setrecursionlimit(10 ** 9)
input = sys.stdin.readline

"""
전위 순회 결과로부터 후위 순회 결과를 생성하는 함수
root: 현재 서브트리의 루트 노드 인덱스
end: 현재 서브트리의 마지막 노드 인덱스
"""
def post_order(root, end):

    # 기저 조건: 유효하지 않은 범위면 종료
    if root > end:
        return

    start = root + 1  # 루트 다음 노드(왼쪽 서브트리의 시작)
    node = nodes[root]  # 현재 서브트리의 루트 값

    # 오른쪽 서브트리의 시작점(mid)을 찾음
    # 루트 값보다 큰 첫 번째 노드가 오른쪽 서브트리의 시작
    for index in range(start, end + 1):
        if node < nodes[index]:
            mid = index
            break
    else:
        # 모든 값이 루트보다 작거나 같으면 오른쪽 서브트리는 없음
        mid = end + 1

    # 왼쪽 서브트리 후위 순회 (start부터 mid-1까지)
    post_order(start, mid - 1)

    # 오른쪽 서브트리 후위 순회 (mid부터 end까지)
    post_order(mid, end)

    # 현재 노드 출력 (후위 순회에서는 루트가 마지막에 방문됨)
    print(node)


# 노드 값을 저장할 리스트
nodes = []

# EOF(파일 끝)까지 입력 받기
while True:
    try:
        N = int(input())
        nodes.append(N)
    except:
        # 입력이 더 이상 없거나 오류 발생시 입력 종료
        break

# 전체 트리에 대해 후위 순회 수행 (0부터 마지막 인덱스까지)
post_order(0, len(nodes) - 1)