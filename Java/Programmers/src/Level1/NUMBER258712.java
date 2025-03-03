package Level1;

/*
 * 선물지수
 * https://school.programmers.co.kr/learn/courses/30/lessons/258712
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class NUMBER258712 {

    public int solution(String[] friends, String[] gifts) {

        int friendSize = friends.length;
        Map<String, Integer> giftCount = new HashMap<>(); // 선물 지수
        Map<String, Integer> friendsInfo = new HashMap<>(); // 친구 인덱스 위치
        int[][] giftTable = new int[friendSize][friendSize];

        // 친구 위치 저장
        for (int i = 0; i < friendSize; i++) {
            friendsInfo.put(friends[i], i);
        }

        for (String gift : gifts) {
            StringTokenizer st = new StringTokenizer(gift);
            String friend1 = st.nextToken();
            String friend2 = st.nextToken();

            //선물 지수 저장
            giftCount.put(friend1, giftCount.getOrDefault(friend1, 0) + 1);
            giftCount.put(friend2, giftCount.getOrDefault(friend2, 0) - 1);

            int friend1Index = friendsInfo.get(friend1);
            int friend2Index = friendsInfo.get(friend2);

            // 준 선물 카운터 증가
            giftTable[friend1Index][friend2Index]++;
        }

        int[] count = new int[friendSize];
        for (int i = 0; i < friendSize - 1; i++) {
            for (int j = i + 1; j < friendSize; j++) {
                if (i == j) continue;
                // 조건1 둘중 선물 많이 준 쪽이 받는다.
                if (giftTable[i][j] > giftTable[j][i]) {
                    count[i]++;
                } else if (giftTable[i][j] < giftTable[j][i]) {
                    count[j]++;
                } else {
                    // 조건 2 둘 중 선물 지수가 높은 쪽이 받는다.
                    if (giftCount.getOrDefault(friends[i], 0) > giftCount.getOrDefault(friends[j], 0)) {
                        count[i]++;
                    } else if (giftCount.getOrDefault(friends[i], 0) < giftCount.getOrDefault(friends[j], 0)) {
                        count[j]++;
                    }
                }
            }
        }

        return Arrays.stream(count).max().getAsInt();
    }

    public static void main(String[] args) {

        NUMBER258712 obj = new NUMBER258712();
        String[] friends = new String[]{"muzi", "ryan", "frodo", "neo"};
        String[] gifts = new String[]{"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};
        System.out.println(obj.solution(friends, gifts));

        friends = new String[]{"joy", "brad", "alessandro", "conan", "david"};
        gifts = new String[]{"alessandro brad", "alessandro joy", "alessandro conan", "david alessandro", "alessandro david"};
        System.out.println(obj.solution(friends, gifts));

        friends = new String[]{"a", "b", "c"};
        gifts = new String[]{"a b", "b a", "c a", "a c", "a c", "c a"};
        System.out.println(obj.solution(friends, gifts));

    }
}
