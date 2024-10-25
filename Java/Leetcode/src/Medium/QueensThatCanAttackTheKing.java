package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QueensThatCanAttackTheKing {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {

        boolean[][] boards = new boolean[8][8]; // 체스말

        Arrays.stream(boards).forEach(board -> Arrays.fill(board, false));
        List<List<Integer>> result = new ArrayList<>(); // 결과
        // queen 위치 선정
        Arrays.stream(queens).forEach(queen -> {
            int x = queen[0];
            int y = queen[1];
            boards[x][y] = true;
        });

        // 이동 좌표 설정
        int[] dx = {0, 0, -1, 1, 1, -1, 1, -1};
        int[] dy = {1, -1, 0, 0, 1, -1, -1, 1};

        for (int i = 0; i < 8; i++) {
            int nx = king[0];
            int ny = king[1];
            while(true){
                nx += dx[i];
                ny += dy[i];
                // 범위 안일 경우
                if(0 <= nx && nx < 8 && 0 <= ny && ny < 8){
                    // queen의 위치가 있을경우
                    if(boards[nx][ny]){
                        result.add(List.of(nx, ny));
                        break;
                    }
                }else{ // 범위 벗어나면 종료한다.
                    break;
                }
            }
        }

        return result;
    }


    public static void main(String[] args) {
        System.out.println("#case1");
        QueensThatCanAttackTheKing qtcatk = new QueensThatCanAttackTheKing();
        int[][] queens = {{0,1},{1,0},{4,0},{0,4},{3,3},{2,4}};
        int[]   king = {0,0};
        System.out.println(qtcatk.queensAttacktheKing(queens, king));

        queens = new int[][] {{0,0},{1,1},{2,2},{3,4},{3,5},{4,4},{4,5}};
        king = new int[] {3,3};
        System.out.println(qtcatk.queensAttacktheKing(queens, king));
    }
}
