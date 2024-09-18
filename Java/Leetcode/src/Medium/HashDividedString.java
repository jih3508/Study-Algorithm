package Medium;

public class HashDividedString {

    public String stringHash(String s, int k) {

        String result = "";
        int index = 0;


        while(index < s.length()){
            int ch = 0;
            // k길이 만큼 합친다.
            for (int i = 0; i < k; i++) {
                ch += s.charAt(index + i) - 'a'; // 알파벳을 숫자로 변환 하기 위해서 'a' 코드 만큼 뺀다.
            }

            //문자 z까지 있어서 나머지에서 a-z값을 넣는다.
            ch %= 26;

            result +=(char)  (ch + 'a');
            index += k; // k 길이 만큼 증가
        }

        return result;
    }

    public static void main(String[] args) {

        HashDividedString obj = new HashDividedString();

        System.out.println(obj.stringHash("abcd", 2));

        System.out.println(obj.stringHash("mxz", 3));
    }
}
