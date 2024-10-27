package Medium;

import java.util.Arrays;
import java.util.Comparator;

public class SortTheStudentsByTheirKthScore {

    public int[][] sortTheStudents(int[][] score, int k) {
        //Arrays.sort(score, Comparator.comparingInt((int[] o) -> o[k]).reversed());
        Arrays.sort(score, (a, b) -> b[k] - a[k]);
        return score;
    }


}
