package Medium;

public class BinarySearchTreeToGreaterSumTree {

    int stackValue; // 순회하면서 쌓는 점수
    public TreeNode bstToGst(TreeNode root) {

        this.stackValue = 0; // 초기화
        treeOrder(root);

        return root;
    }

    // right → root → left 순으로 순회
    public void treeOrder(TreeNode node){

        if(node.right != null){
            treeOrder(node.right);
        }

        stackValue += node.val;
        node.val = stackValue;

        if(node.left != null){
            treeOrder(node.left);
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
