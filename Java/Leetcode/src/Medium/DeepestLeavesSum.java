package Medium;

import java.util.*;

public class DeepestLeavesSum {

	Map<Integer, List<Integer>> levelNode;// levelDeep : {nodes....}
	
	public int deepestLeavesSum(TreeNode root) {
		
		this.levelNode = new HashMap<>();
		
		
		dfs(root, 0);
		
		// 가장 깊은 노드 레벨
		int maxLevel = levelNode.keySet().stream()
				.max(Integer::compare).get();
		
		// 가장 깊은 레벨 합
		int result = levelNode.get(maxLevel).stream()
				.reduce(0, (a, b) -> a + b);
		
		return result;
    }
	
	// 노드 탐색
	public void dfs(TreeNode currentNode, int level) {
		
		// map에 level 없으면 추가
		if(this.levelNode.get(level) == null) {
			this.levelNode.put(level, new ArrayList<>());
		}
		
		this.levelNode.get(level).add(currentNode.val); // 현재 노드 값 추가
		
		// 왼쪽 자식 노드 있을 경우
		if(currentNode.left != null) {
			dfs(currentNode.left, level + 1);
		}
		
		// 오른쪽 자식 노드 있을 경우
		if(currentNode.right != null) {
			dfs(currentNode.right, level + 1);
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

}

