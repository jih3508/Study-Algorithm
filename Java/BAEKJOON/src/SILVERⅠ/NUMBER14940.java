package SILVERⅠ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class NUMBER14940 {

    static int n, m;
    static int[][] boards;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        boards = new int[n][m];

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++){
                boards[i][j]  = Integer.parseInt(st.nextToken());
            }
        }

        int[][] distances = bfs();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                sb.append(distances[i][j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());

    }

    public static int[][] bfs(){

        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};

        int[][] distances = new int[n][m];
        Arrays.stream(distances).forEach(distance -> Arrays.fill(distance, 0));
        Queue<int []> queue = new LinkedList<>();

        int x = 0;
        int y = 0;

        // 시작 위치 찾기
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if (boards[i][j] == 2){
                    x = i;
                    y = j;
                    break;
                }
            }
        }

        queue.add(new int[] {x, y});
        int[] location;
        int fx, fy;

        //bfs 탐색 시작
        while (queue.size() > 0){
            location = queue.poll();
            x = location[0];
            y = location[1];

            for(int k = 0; k < 4; k++){
                fx = x + dx[k];
                fy = y + dy[k];
                if((fx >= 0 && fx < n && fy >= 0 && fy < m) && boards[fx][fy] == 1 && boards[fx][fy] != 2 && distances[fx][fy] == 0){
                    distances[fx][fy] = distances[x][y] + 1;
                    queue.add(new int[] {fx, fy});
                }
            }

        }

        return notFindLoad(distances);
    }

    /*
     * 도달 할 수 없는 땅 찾기
     */
    public static int[][] notFindLoad(int[][] arrays){

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if (arrays[i][j] == 0 && boards[i][j] == 1){
                    arrays[i][j] = -1;
                }
            }
        }
        return arrays;
    }
}
