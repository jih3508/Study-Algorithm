class TreeNode {
    constructor(val = 0, left = null, right = null) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    reverseOddLevels(root) {
        let queue = [root];
        let level = 0;

        while (queue.length > 0) {
            if (level % 2 === 1) {
                let l = 0, r = queue.length - 1;
                while (l < r) {
                    [queue[l].val, queue[r].val] = [queue[r].val, queue[l].val];
                    l++;
                    r--;
                }
            }

            let size = queue.length;
            for (let i = 0; i < size; i++) {
                let node = queue.shift();
                if (node.left && node.right) {
                    queue.push(node.left);
                    queue.push(node.right);
                }
            }
            level++;
        }
        return root;
    }
}
