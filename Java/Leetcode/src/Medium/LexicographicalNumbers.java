package Medium;

import java.util.ArrayList;
import java.util.List;

public class LexicographicalNumbers {

	List<Integer> result;
	int n;
	
	public List<Integer> lexicalOrder(int n) {
        this.result = new ArrayList<Integer>();
        this.n = n;
        
        for(int i = 1; i <= 9; i++) {
        	dfs(i);
        }
        
        return this.result;
    }
	
	public void dfs(int currentNum) {
		if(currentNum > this.n) {
			return;
		}
		this.result.add(currentNum);
		
		
		for(int i = 0; i <= 9; i++) {
			int nextNum = currentNum * 10 + i;
			if(nextNum > n) {
				break;
			}
			
			dfs(nextNum);
			
		}
	}
	
	public static void main(String[] args) {
		LexicographicalNumbers lexicographicalNumbers = new LexicographicalNumbers();
		
		System.out.println(lexicographicalNumbers.lexicalOrder(13));
		System.out.println(lexicographicalNumbers.lexicalOrder(2));

	}

}
