package Medium;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MaximumBinaryTree {

    int[] nums;

    public TreeNode constructMaximumBinaryTree(int[] nums) {

        this.nums = nums;

        int maxValue = Arrays.stream(nums).max().getAsInt();
        int mavValueIndex = Arrays.stream(nums).boxed().collect(Collectors.toList()).indexOf(maxValue);
        TreeNode node = new TreeNode(maxValue);
        // Left
        node.left = addTreeNode(0, mavValueIndex - 1);
        //right
        node.right = addTreeNode(mavValueIndex + 1,  nums.length - 1);

        return node;
    }


    // 추가할 노드 탐색
    public TreeNode addTreeNode(int start, int end){
        // start가 end보다 클 경우
        if(start > end){
            return null;
            // 같을 경우는 leaf node 이다.
        }else if (start == end) {
            return new TreeNode(nums[start]);
        }else {
           int maxValue = 0; // 최대값 변수
           int maxValueIndex = -1; // 최대값 index 위치
            for (int i = start; i <= end; i++) {
                if(nums[i] > maxValue){
                    maxValue = nums[i];
                    maxValueIndex = i;
                }
            }

            TreeNode node = new TreeNode(maxValue);

            // 최대값 index 기준으로 start부터 최대 index중 왼쪽 노드에 추가한다.
            node.left = addTreeNode(start, maxValueIndex - 1);
            // 최대값 index 기준으로 end까지 오른쪽 노드에 추가한다.
            node.right = addTreeNode(maxValueIndex + 1, end);

            return node;
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

    public static void main(String[] args) {
        MaximumBinaryTree obj = new MaximumBinaryTree();
        int[] nums = {3,2,1,6,0,5};
        System.out.println(obj.constructMaximumBinaryTree(nums));

        nums = new int[] {3,2,1};
        System.out.println(obj.constructMaximumBinaryTree(nums));
    }
}
