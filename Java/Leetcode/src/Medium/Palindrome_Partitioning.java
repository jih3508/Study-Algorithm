package Medium;

import java.util.ArrayList;
import java.util.List;

public class Palindrome_Partitioning {
	
	List<List<String>> result;
	String s;
	int length;
	
	public List<List<String>> partition(String s) {
		this.s = s;
		this.length = s.length();
		this.result = new ArrayList<>();
		backtracking(0, new ArrayList<String>());
		
		return result;
    }
	
	public void backtracking(int n, ArrayList<String> p) {
		
		if (n == length) {
			result.add(p);
		}
		
		String string;
		StringBuilder sb;
		for(int i = n + 1; i <= length; i++) {
			string = this.s.substring(n, i);
			sb = new StringBuilder(string);
			// 문자열 뒤집어서 같으면 추가 하고 그 다음 진행 한다.
			if(string.equals(sb.reverse().toString())) {
				p.add(string);
				backtracking(i,(ArrayList<String>) p.clone());
				p.remove(p.lastIndexOf(string));
			}
		}	
	}
	
	public static void main(String[] args) {
		Palindrome_Partitioning palindrome_Partitioning = new Palindrome_Partitioning();
		
		String s = "efe";
		System.out.println(palindrome_Partitioning.partition(s));
		s = "a";
		//System.out.println(palindrome_Partitioning.partition(s));
		
	}

}
