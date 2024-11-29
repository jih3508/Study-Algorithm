package Medium;

import java.util.Arrays;

public class BagOfTokens {

    public int bagOfTokensScore(int[] tokens, int power) {
        int size = tokens.length;

        // 크기가 0이면 0으로 리턴
        if(size == 0){
            return  0;
        }

        int score = 0;
        int[] scores = new int[size];
        Arrays.sort(tokens);
        int start = 0;
        int end = size - 1;
        // two pointer
        while (start <= end){
            //power가 start 위치 token 값보다 클때  에너지를 감소하고 점수 1 증가
            if(power >= tokens[start]){
                score++;
                power -= tokens[start];
                scores[start++] = score;
            }else{
                // 현재 점수가 0보다 클때 점수 1로 감소하고 에너지를 증가
                if(score > 0){
                    score -= 1;
                    power += tokens[end];
                    scores[end--] = score;
                }
                // 현재 점수가 0이면 더이상 감소 시킬수 없어서 0으로 리턴 시킨다.
                else{
                    return  0;
                }
            }
        }

        // 기록 된 점수 값중 가장 큰 값을 출력한다.
        return Arrays.stream(scores).max().getAsInt();
    }

    public static void main(String[] args) {

        BagOfTokens bag = new BagOfTokens();
        int[] tokens = new int[] {100};
        System.out.println(bag.bagOfTokensScore(tokens, 50));

        tokens = new int[] {200,100};
        System.out.println(bag.bagOfTokensScore(tokens, 150));

        tokens = new int[] {100,200,300,400};
        System.out.println(bag.bagOfTokensScore(tokens, 200));
    }
}
