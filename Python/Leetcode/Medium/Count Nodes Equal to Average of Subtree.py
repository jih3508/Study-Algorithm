class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def averageOfSubtree(self, root: TreeNode) -> int:

        self.count = 0 # 개수 변수

        def dfs(Node):
            arrays = [] # 자식 노드 합칠 리스트
            # 왼쪽 노드
            if Node.left:
                arrays.extend(dfs(Node.left))
            # 오른쪽 노드
            if Node.right:
                arrays.extend(dfs(Node.right))

            # 자식 노드 값에 현재 노드값을 추가한다.
            arrays.append(Node.val)
            # 자식노드 포함한 평균값과 현재 노드 값 같으면 개수 늘린다.
            self.count += sum(arrays)//len(arrays) == Node.val

            # 현재 노드 값을 포함한 값을 반환
            return arrays

        dfs(root)

        return self.count
