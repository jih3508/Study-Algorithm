package Medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LetterTilePossibilities {

    Set<String> strings;
    char[] alphabet;
    int size;

    public int numTilePossibilities(String tiles) {

        this.strings = new HashSet<>();
        this.alphabet = tiles.toCharArray();
        this.size = tiles.length();
        boolean[] visited =  new boolean[size];
        Arrays.fill(visited, false);
        backtracking( "", visited);
        this.strings.remove("");
        System.out.println(this.strings);
        return this.strings.size();
    }


    public void backtracking(String str, boolean[] visited) {
        if (str.length() > this.size ) {
            return;
        }

        this.strings.add(str);

        for (int i = 0; i < size; i++) {
            if (!visited[i]) {
                str += this.alphabet[i];
                visited[i] = true;
                this.backtracking( str, visited);
                str = str.substring(0, str.length() - 1);
                visited[i] = false;
            }

        }
    }

    public static void main(String[] args) {
        LetterTilePossibilities obj = new LetterTilePossibilities();
        System.out.println(obj.numTilePossibilities("AAB"));
        System.out.println(obj.numTilePossibilities("AAABBC"));
        System.out.println(obj.numTilePossibilities("V"));
    }
}
