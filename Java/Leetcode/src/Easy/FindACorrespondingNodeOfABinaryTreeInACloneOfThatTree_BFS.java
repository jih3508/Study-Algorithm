package Easy;

import java.util.LinkedList;
import java.util.Queue;

/*
 * 1379. Find a Corresponding Node of a Binary Tree in a Clone of That Tree
 * https://leetcode.com/problems/find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree/description/
 */

public class FindACorrespondingNodeOfABinaryTreeInACloneOfThatTree_BFS {

      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {


        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(cloned);

        while(!queue.isEmpty()){
        TreeNode now = queue.poll();

            // 같은 노드 이면 반환
            if(now.val == target.val){
              return now;
            }

            // 왼쪽 노드 있으면 stack에 추가
            if(now.left != null){
                queue.add(now.left);
            }

            // 왼쪽 노드 있으면 stack에 추가
            if(now.right != null){
                queue.add(now.right);
            }

        }

        return null;
    }
}
