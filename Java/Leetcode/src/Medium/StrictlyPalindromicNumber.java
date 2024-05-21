package Medium;

public class StrictlyPalindromicNumber {

    public boolean isStrictlyPalindromic(int n) {

        StringBuffer sb;
        //System.out.println(n);

        for (int i = 2; i <= n - 2; i++) {
            sb = new StringBuffer(Integer.toString(n, i));

            //System.out.println(sb + "  " + sb.reverse() + "  " + sb.toString().equals(sb.reverse().toString()));
            if(!sb.toString().equals(sb.reverse().toString())){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
       StrictlyPalindromicNumber strictlyPalindromicNumber = new StrictlyPalindromicNumber();
        System.out.println(strictlyPalindromicNumber.isStrictlyPalindromic(9));
        System.out.println(strictlyPalindromicNumber.isStrictlyPalindromic(4));
    }
}
