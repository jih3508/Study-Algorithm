package Medium;

import java.util.ArrayList;
import java.util.List;

public class GenerateBinaryStringsWithoutAdjacentZeros {

    List<String> result;
    int length;

    public List<String> validStrings(int n) {
        result = new ArrayList<>();
        length = n;
        recursion( "");
        return result;
    }

    /*
     * 재귀 호출 함수
     */
    public void recursion( String s){
        if(s.length() == length){
            result.add(s);
            return;
        }

        // 끝에 숫자가 1일때 뒤에 0을 추가 한다.
        if(s.isEmpty() || s.charAt(s.length() - 1) == '1'){
            recursion( s + '0');
        }
        recursion( s + '1');

    }

    public static void main(String[] args) {
        GenerateBinaryStringsWithoutAdjacentZeros obj = new GenerateBinaryStringsWithoutAdjacentZeros();
        System.out.println(obj.validStrings(3));
        System.out.println(obj.validStrings(1));
    }

}
