package Medium;

import java.util.*;

public class Course_Schedule {
	
	Set<Integer> trace;
	boolean[] visited;
	Map<Integer, List<Integer>> needCourse;

	public boolean canFinish(int numCourses, int[][] prerequisites) {
		trace = new HashSet<>();
		visited = new boolean[numCourses];
		Arrays.fill(visited, false);
		needCourse = new HashMap<>();
		
		for(int[] prerequisite : prerequisites) {
			if (!needCourse.keySet().contains(prerequisite[1])){
				needCourse.put(prerequisite[1], new ArrayList<>());
			}
			needCourse.get(prerequisite[1]).add(prerequisite[0]);
		}
		
		for(int i = 0; i < numCourses; i++) {
			if(!dfs(i)) {
				return false;
			}
		}
		
	    return true;    
	}
	
	public boolean dfs(int num) {
		
		if(trace.contains(num)) {
			return false;
		}
		
		if(visited[num]) {
			return true;
		}
		
		trace.add(num);
		
		if(needCourse.keySet().contains(num)) {
			for(int course : needCourse.get(num)) {
				if (!dfs(course)){
					return false;
				}
			}
		}
		trace.remove(num);
		visited[num] = true;
		
		
		return true;
	}
	
	public static void main(String[] args) {
		
		Course_Schedule courseSchedule = new Course_Schedule();
		System.out.println(courseSchedule.canFinish(2, new int[][] {{1,0}}));
		System.out.println(courseSchedule.canFinish(2, new int[][] {{1,0},{0,1 }}));

	}

}
