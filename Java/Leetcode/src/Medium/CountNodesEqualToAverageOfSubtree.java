package Medium;

import java.util.ArrayList;
import java.util.List;

public class CountNodesEqualToAverageOfSubtree {

	int count; // 개수 변수
	
	public int averageOfSubtree(TreeNode root) {
		
		this.count = 0;
		
		dfs(root);
		
		return 0;
    }
	

	public List<Integer> dfs(TreeNode node) {
		// 자식 노드 합칠 리스트
		List<Integer> arrays = new ArrayList<>();
		
		// 왼쪽 노드
		if(node.left != null) {
			arrays.addAll(dfs(node.left));
		}
		
		// 오른쪽 노드
		if(node.right != null) {
			arrays.addAll(dfs(node.right));
		}
		
		// 현재 노드값 추가
		arrays.add(node.val);
		// 자식 노드 포함한 평균값이랑 같을때 개수 추가
		this.count += arrays.stream().reduce((a, b) -> a + b).get() / arrays.size() == node.val? 1 : 0;
		
		// 현재 노드값을 포함한 값을 반환
		return arrays;
		
	}

}



class TreeNode {
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
