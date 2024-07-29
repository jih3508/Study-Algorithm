package Medium;

import java.util.HashMap;
import java.util.Map;

public class MinimumNumberOfOperationsToMakeWordKPeriodic {

    public int minimumOperationsToMakeKPeriodic(String word, int k) {
        Map<String, Integer> token = new HashMap<>();
        int length = word.length();

        for (int i = 0; i < length; i += k) {
            String tokenWord =  word.substring(i, i + k);
            // 잘라낸 단어가 없을 경우 추가 한다.
            if(!token.containsKey(tokenWord)){
                token.put(tokenWord, 0);
            }
            // 잘라낸 단어 +1 추가한다.
            token.put(tokenWord, token.get(tokenWord) + 1);
        }

        // 자르는 수와 가장 많이 나온 갯수를 뺀다.
        return  length / k - token.values().stream().mapToInt(x -> x).max().getAsInt();
    }

    public static void main(String[] args) {
        MinimumNumberOfOperationsToMakeWordKPeriodic solution = new MinimumNumberOfOperationsToMakeWordKPeriodic();
        System.out.println(solution.minimumOperationsToMakeKPeriodic("leetcodeleet", 4));
        System.out.println(solution.minimumOperationsToMakeKPeriodic("leetcoleet", 2));
    }
}
