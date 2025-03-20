
# 1379. Find a Corresponding Node of a Binary Tree in a Clone of That Tree
# https://leetcode.com/problems/find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree/description/

from collections import deque


class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None

class Solution:
    def getTargetCopy(self, original: TreeNode, cloned: TreeNode, target: TreeNode) -> TreeNode:

        queue =  deque([cloned])

        while queue:
            now = queue.popleft()

            # 같은 노드 이면 반환
            if now.val == target.val:
                return now

            # 왼쪽 노드 있으면 stack에 추가
            if now.left:
                queue.append(now.left)

            # 오른쪽 노드 있으면 stack에 추가
            if now.right:
                queue.append(now.right)
