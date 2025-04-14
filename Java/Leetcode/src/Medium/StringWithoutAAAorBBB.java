package Medium;
/*
 * 984. String Without AAA or BBB
 * https://leetcode.com/problems/string-without-aaa-or-bbb/description/
 */
public class StringWithoutAAAorBBB {

    public String strWithout3a3b(int a, int b) {

        StringBuilder s = new StringBuilder();

        // a와 b 모두 0보다 클 때까지 반복
        while (a > 0 && b > 0) {
            // a가 b보다 많으면 "aab" 패턴 추가
            if (a > b) {
                s.append("aab");
                a -= 2;
                b -= 1;
            }
            // b가 a보다 많으면 "bba" 패턴 추가
            else if (a < b) {
                s.append("bba");
                a -= 1;
                b -= 2;
            }
            // a와 b의 개수가 같으면 "ab" 패턴 추가
            else if (a == b) {
                s.append("ab");
                a -= 1;
                b -= 1;
            }
        }

        // 남은 a가 있으면 처리
        // a가 최대 2개만 남을 수 있음 (더 많았다면 위 루프에서 처리됨)
        if (a > 0) {
            s.append("a".repeat(a));
        }

        // 남은 b가 있으면 처리
        // b가 최대 2개만 남을 수 있음 (더 많았다면 위 루프에서 처리됨)
        if (b > 0) {
            s.append("b".repeat(b));
        }

        return s.toString();
    }

    public static void main(String[] args) {
        StringWithoutAAAorBBB obj = new StringWithoutAAAorBBB();
        System.out.println(obj.strWithout3a3b(1, 2));
        System.out.println(obj.strWithout3a3b(4, 1));
    }
}
