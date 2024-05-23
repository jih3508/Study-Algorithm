package Level2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NUMBER12981 {

    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        int length = words.length;
        String beforeWord = words[0]; // 이전단어
        String nowWord; // 현재 단어


        Set<String> setWords = new HashSet<>(); // 이전 단어 저장
        setWords.add(beforeWord);

        for(int i = 1; i < length; i++){
            nowWord = words[i];
            // 1. 끝말잇기 틀린 경우
            // 2. 이전단어 포함된 경우
            if(nowWord.charAt(0) != beforeWord.charAt(beforeWord.length() - 1) || setWords.contains(nowWord)){
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            }
            // 같을 경우 현재 단어를 이전단어로 옮긴다.
            setWords.add(nowWord);
            beforeWord = nowWord;

        }

        return answer;
    }

    public static void main(String[] args) {
        NUMBER12981 obj = new NUMBER12981();
        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        System.out.println(Arrays.toString(obj.solution(3, words)));
        words = new String[] {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
        System.out.println(Arrays.toString(obj.solution(5, words)));
        words = new String[] {"hello", "one", "even", "never", "now", "world", "draw"};
        System.out.println(Arrays.toString(obj.solution(2, words)));
        words = new String[] {"tank", "kick", "kick", "know"};
        System.out.println(Arrays.toString(obj.solution(2, words)));

    }


}
