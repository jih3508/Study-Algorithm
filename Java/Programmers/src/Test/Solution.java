package Test;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        Queue<Character> queue = new LinkedList<>();
        
        
        boolean flag;
        
        for(String skill_tree : skill_trees) {
        	flag = true;
        	for(char tree : skill.toCharArray()) {
            	queue.add(tree);
            }
        	
        	for(char s : skill_tree.toCharArray()) {
        		if(queue.contains(s)) {
        			if(s != queue.poll()) {
        				flag = false;
        				break;
        			}
        		}
        		
        	}
        	
        	if(flag) {
        		answer++;
        	}
        	
        	queue.clear();
        }
 
        return answer;
    }

	public static void main(String[] args) {
		Solution solution = new Solution();
	}
}