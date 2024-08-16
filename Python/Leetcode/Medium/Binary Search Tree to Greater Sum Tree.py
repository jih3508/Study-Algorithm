class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:

    def bstToGst(self, root: TreeNode) -> TreeNode:
        global stackValue
        stackValue = 0 # 순회하면서 쌓는 점수

        #  right → root → left 순으로 순회
        def treeOrder(node: TreeNode):
            global stackValue
            if (node.right):
                treeOrder(node.right)

            stackValue += node.val
            node.val = stackValue

            if (node.left):
                treeOrder(node.left)

        treeOrder(root)
        return root
