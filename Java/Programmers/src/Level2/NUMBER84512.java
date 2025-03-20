package Level2;

import java.util.HashMap;
import java.util.Map;

public class NUMBER84512 {

    int count;
    Map<String, Integer> map;

    char[] al = new char[] { 'A', 'E', 'I', 'O', 'U'};

    public int solution(String word) {
        this.count = 0;

        this.map = new HashMap<>();

        searchWord("");

        return map.get(word);
    }

    public void searchWord(String s){
        //System.out.println(s + ", " + count);
        map.put(s, count);
        if(s.length() == 5){
            return;
        }

        for (int i = 0; i < al.length; i++){
            this.count +=1 ;
            searchWord(s + al[i]);
        }

    }

    public static void main(String[] args) {
        NUMBER84512 solution = new NUMBER84512();
        System.out.println(solution.solution("AAAAE"));
        System.out.println(solution.solution("AAAE"));
        System.out.println(solution.solution("I"));
        System.out.println(solution.solution("EIO"));

    }
}
