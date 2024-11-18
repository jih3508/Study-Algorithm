package Level2;

import java.io.IOException;
import java.util.Arrays;

public class NUMBER87946 {

    int count;
    int size;
    int[][] dungeons;

    boolean[] visited;

    public int solution(int k, int[][] dungeons) {
        // 초기화
        this.count = 0;
        this.size = dungeons.length;
        this.dungeons = dungeons;

        // 각 던전 시작점을 잡고 탐색
        for (int i = 0; i < this.size; i++) {
            this.visited = new boolean[size];
            Arrays.fill(this.visited, false);
            if(k >= dungeons[i][0]){
                visited[i] = true;
                search(k - dungeons[i][1], dungeons[i], 1);
                visited[i] = false;
            }
        }

        return this.count;
    }

    /*
     * 탐색
     */
    public void search(int hp, int[] now, int number){
        //System.out.println(hp + ", " + Arrays.toString(now) + ", " + number);
        // 최대 개수 저장
        this.count = Math.max(this.count, number);
        for (int i = 0; i < this.size; i++) {
            // 방문여부 남은 피로도 확인
            if(!visited[i] && hp >= dungeons[i][0]){
                visited[i] = true;
                search(hp - dungeons[i][1], dungeons[i], number + 1);
                visited[i] = false;
            }
        }
    }


    public static void main(String[] args) throws IOException {
        NUMBER87946 solution = new NUMBER87946();
        int[][] dungeons = {{80,20},{50,40},{30,10}};
        System.out.println(solution.solution(80, dungeons));

    }


}
