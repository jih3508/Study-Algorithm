from typing import Optional, List

class TreeNode:
    def __init__(self, val=0, left=None, right=None):
         self.val = val
         self.left = left
         self.right = right

class Solution:
    def constructMaximumBinaryTree(self, nums: List[int]) -> Optional[TreeNode]:
        size = len(nums)

        def addNode(start, end):
            # start가 end보다 클 경우
            if start > end:
                return None
            elif start == end:
                return TreeNode(nums[start])
            else:
                maxValue = max(nums[start: end + 1])
                maxValueIndex = nums.index(maxValue)
                node = TreeNode(maxValue)
                # 최대값 index 기준으로 start부터 최대 index중 왼쪽 노드에 추가한다.
                node.left = addNode(start, maxValueIndex - 1)
                # 최대값 index 기준으로 end까지 오른쪽 노드에 추가한다.
                node.right = addNode(maxValueIndex + 1, end)
                return node

        maxValue = max(nums)
        maxValueIndex = nums.index(maxValue)
        node = TreeNode(maxValue)
        # Left
        node.left = addNode(0, maxValueIndex - 1)
        # Right
        node.right = addNode(maxValueIndex + 1, size - 1)

        return node
