class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

from collections import defaultdict

class Solution:
    def deepestLeavesSum(self, root: TreeNode) -> int:
        # 트리 레벨
        nodeLevel = defaultdict(list)

        # 트리 노드 탐색
        def dfs(currentNode : TreeNode, level: int):

            # dict에 level 없으면 추가
            if not nodeLevel[level]:
                nodeLevel[level] = []

            # 현재 노드 값 레벨에 추가
            nodeLevel[level].append(currentNode.val)

            # 왼쪽 자식에 값 있으면 왼쪽 자식 노드 탐색
            if currentNode.left:
                dfs(currentNode.left, level + 1)

            # 오른쪽 자식에 값 있으면 오른쪽 자식 노드 탐색
            if currentNode.right:
                dfs(currentNode.right, level + 1)

        dfs(root, 0)

        # 가장 깊은 레벨 값
        maxLevel = max(nodeLevel.keys())

        # 가장 깊은 레벨 노드 값 합
        result = sum(nodeLevel[maxLevel])

        return result
