package Medium;

public class SumOfNodesWithEvenValuedGrandparent {

    int result;
    public int sumEvenGrandparent(TreeNode root) {

        this.result = 0;
        searchNode(root);

        return this.result;
    }

    /*
     * 노드 탐색
     */
    public void searchNode(TreeNode node){

        // 왼쪽 자식 노드 있을경우
        if(node.left != null){
            // 현재 노드가 짝수 이면 손자 노드 값을 추가 한다.
            if(node.val % 2 == 0){
                if(node.left.right != null){
                    this.result += node.left.right.val;
                }
                if(node.left.left != null){
                    this.result += node.left.left.val;
                }
            }
            // 왼쪽 자식 노드 이동
            searchNode(node.left);
        }

        // 오른쪽 자식 노드 있을경우
        if(node.right != null){
            // 현재 노드가 짝수 이면 손자 노드 값을 추가 한다.
            if(node.val % 2 == 0){
                if(node.right.right != null){
                    this.result += node.right.right.val;
                }
                if(node.right.left != null){
                    this.result += node.right.left.val;
                }
            }
            // 오른쪽 자식 노드 이동
            searchNode(node.right);
        }

    }


     public class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode() {}
         TreeNode(int val) { this.val = val; }
         TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
             this.left = left;
             this.right = right;
         }
     }

}
