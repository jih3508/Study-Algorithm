from typing import Optional
from collections import deque

class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
class Solution:
    def reverseOddLevels(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        queue = deque([root])
        level = 0
        while queue:
            if level % 2 == 1:
                l, r = 0, len(queue) - 1
                while l < r:
                    queue[l].val, queue[r].val = queue[r].val, queue[l].val
                    l, r = l + 1, r - 1
            for _ in range(len(queue)):
                node = queue.popleft()
                if (node.left and node.right):
                    queue.append(node.left)
                    queue.append(node.right)
            level += 1
        return root







