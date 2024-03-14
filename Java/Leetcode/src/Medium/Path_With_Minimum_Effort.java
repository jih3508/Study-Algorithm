package Medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Path_With_Minimum_Effort {

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.minimumEffortPath(new int[][] {{1,2,2},{3,8,2},{5,3,5}}));
		System.out.println(solution.minimumEffortPath(new int[][] {{1,2,3},{3,8,4},{5,3,5}}));
		System.out.println(solution.minimumEffortPath(new int[][] {{1,2,1,1,1},{1,2,1,2,1},{1,2,1,2,1},{1,2,1,2,1},{1,1,1,2,1}}));
		System.out.println(solution.minimumEffortPath(new int[][] {{1,10,6,7,9,10,4,9}}));
		System.out.println(solution.minimumEffortPath(new int[][] {{3}}));
		System.out.println(solution.minimumEffortPath(new int[][] {{4,3,4,10,5,5,9,2},{10,8,2,10,9,7,5,6},{5,8,10,10,10,7,4,2},{5,1,3,1,1,3,1,9},{6,4,10,6,10,9,4,6}}));
	}

}

class Solution {
	
	int[][] heights;
	int x,y ;
	int[] dx = {1, -1, 0, 0};
	int[] dy = {0, 0, 1, -1};
	
    public int minimumEffortPath(int[][] heights) {
        this.heights = heights;
    	this.x = heights.length;
    	this.y = heights[0].length;
        
        int left = 0;
        int right = 1000001;
        int mid;
        
        while(left < right) {
        	mid = (left + right) / 2;
        	
        	if (dfs(mid)) {
        		right = mid;
        	}else {
        		left = mid + 1;
        	}
        }
               
    	return right;
    }
    
    public boolean dfs(int gap) {
    	Queue<int []> queue = new LinkedList<>();
    	queue.add(new int[] {0, 0});
    	
    	int[] path;
    	int nx, ny, fx, fy;
    	boolean isMatch;
    	boolean[][] visited = new boolean[this.x][this.y];
    	Arrays.stream(visited).forEach(visit -> Arrays.fill(visit, false));
    	visited[0][0] = true;
    	
    	while(!queue.isEmpty()) {
    		path = queue.poll();
    		nx = path[0];
    		ny = path[1];
    		
    		if ((nx == (this.x - 1)) && (ny == (this.y - 1))){
    			return true;
    		}
    		
    		for(int k = 0; k < 4; k++) {
    			fx = nx + this.dx[k];
    			fy = ny + this.dy[k];

    			if ((0 <= fx) && (fx < this.x) 
    				&& (0 <= fy) && (fy < this.y)
    				&& visited[fx][fy] == false
    				&& Math.abs(this.heights[fx][fy] - this.heights[nx][ny]) <= gap){
    				queue.add(new int[] {fx, fy});
    				visited[fx][fy] = true;
    			}
    		}
    	}
    	
    	return false;
    }

}