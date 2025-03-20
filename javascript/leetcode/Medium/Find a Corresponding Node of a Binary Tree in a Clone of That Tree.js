/*
 * 1863. Sum of All Subset XOR Totals
 * https://leetcode.com/problems/sum-of-all-subset-xor-totals/description/
 */

function TreeNode(val) {
    this.val = val;
    this.left = this.right = null;
}
/**
 * @param {TreeNode} original
 * @param {TreeNode} cloned
 * @param {TreeNode} target
 * @return {TreeNode}
 */

var getTargetCopy = function(original, cloned, target) {

    let stack = Array();
    stack.push(cloned);

    while(stack){
        const node = stack.pop();
        // 같은 노드 이면 반환
        if(node.val === target.val){
            return node;
        }

        // 왼쪽 노드 있으면 stack에 추가
        if(node.left){
            stack.push(node.left);
        }

        // 왼쪽 노드 있으면 stack에 추가
        if(node.right){
            stack.push(node.right);
        }

    }

};