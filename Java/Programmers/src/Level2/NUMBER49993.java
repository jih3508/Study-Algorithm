package Level2;

import java.util.LinkedList;
import java.util.Queue;

// https://school.programmers.co.kr/learn/courses/30/lessons/49993
// 스킬트리
public class NUMBER49993 {
	
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
        		// 스킬 트리 포함 되면 지금 스킬과 큐를 뽑은 스킬이 다르면 순서가 다르다. 
        		if(queue.contains(s)) {
        			if(s != queue.poll()) {
        				flag = false;
        				break;
        			}
        		}
        		
        	}
        	
        	// 스킬 순서가 맞으면 증가 한다.
        	if(flag) {
        		answer++;
        	}
        	
        	queue.clear();
        }
 
        return answer;
    }
}
