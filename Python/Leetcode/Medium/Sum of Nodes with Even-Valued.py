from typing import Optional


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def sumEvenGrandparent(self, root: Optional[TreeNode]) -> int:
        self.result = 0

        # 노드 탐색
        def searchNode(node: Optional[TreeNode]):

            # 왼쪽 자식 노드 있을경우
            if (node.left):
                # 현재 노드가 짝수 이면 손자 노드 값을 추가 한다.
                if node.val % 2 == 0:
                    if (node.left.left):
                        self.result += node.left.left.val
                    if (node.left.right):
                        self.result += node.left.right.val
                # 왼쪽 자식 노드 이동
                searchNode(node.left)

            # 오른쪽 자식 노드 있을경우
            if (node.right):
                # 현재 노드가 짝수 이면 손자 노드 값을 추가 한다.
                if node.val % 2 == 0:
                    if (node.right.left):
                        self.result += node.right.left.val
                    if (node.right.right):
                        self.result += node.right.right.val
                # 오른쪽 자식 노드 이동
                searchNode(node.right)

        searchNode(root)
        return self.result
