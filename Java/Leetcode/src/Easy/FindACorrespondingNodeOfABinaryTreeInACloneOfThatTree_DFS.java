package Easy;

import java.util.Stack;

/*
 * 1379. Find a Corresponding Node of a Binary Tree in a Clone of That Tree
 * https://leetcode.com/problems/find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree/description/
 */

public class FindACorrespondingNodeOfABinaryTreeInACloneOfThatTree_DFS {

      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {


        Stack<TreeNode> stack = new Stack<>();
        stack.push(cloned);

        while(!stack.isEmpty()){
        TreeNode now = stack.pop();

            // 같은 노드 이면 반환
            if(now.val == target.val){
              return now;
            }

            // 왼쪽 노드 있으면 stack에 추가
            if(now.left != null){
              stack.push(now.left);
            }

            // 왼쪽 노드 있으면 stack에 추가
            if(now.right != null){
              stack.push(now.right);
            }

        }

        return null;
    }
}
