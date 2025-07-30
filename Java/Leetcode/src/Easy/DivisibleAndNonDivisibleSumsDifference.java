package Easy;

public class DivisibleAndNonDivisibleSumsDifference {

    public int differenceOfSums(int n, int m) {

        int result = 0;

        for (int i = 1; i <= n; i++) {
            // m의 배수가 아니면 더한다.
            if (i % m != 0) {
                result += i;
            // m의 배수일때 뺀다.
            }else{
                result -= i;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        DivisibleAndNonDivisibleSumsDifference obj = new DivisibleAndNonDivisibleSumsDifference();
        System.out.println(obj.differenceOfSums(10, 3));
        System.out.println(obj.differenceOfSums(5, 6));
        System.out.println(obj.differenceOfSums(5, 1));
    }
}
