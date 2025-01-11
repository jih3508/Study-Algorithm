package Level3;

import java.util.Arrays;

/*
 * 문제: 네트워크
 * Level3
 * url: https://school.programmers.co.kr/learn/courses/30/lessons/43162
 */
public class NUMBER43162 {

    boolean[] visited;  // 방문 여부를 저장하는 배열

    int[][] computers;

    int n;


    public int solution(int n, int[][] computers) {

        // init
        this.n = n;
        int count = 0; // 네트워크의 개수를 저장할 변수
        this.visited = new boolean[n];
        Arrays.fill(visited, false); // 모든 컴퓨터를 처음엔 방문하지 않은 상태로 초기화
        this.computers = computers;

        for (int node = 0; node < n; node++) {

            // 해당 컴퓨터를 아직 방문하지 않았으면 탐색하고 네트워크 개수 추가
            if(!visited[node]){
                dfs(node);
                count++;
            }
        }

        return count;
    }

    public void dfs(int node){

        this.visited[node] = true; // 현재 노드를 방문 처리

        for(int i = 0; i < this.n; i++){

            // 연결되어 있고 아직 방문하지 않은 노드에 대해 다음 노드 탐색
            if(computers[node][i] == 1 && !this.visited[i]){
                dfs(i);
            }
        }
    }

    public static void main(String[] args) {
        NUMBER43162 obj = new NUMBER43162();
        int[][] computers = new int[][] {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        System.out.println(obj.solution(3,computers));
        computers = new int[][] {{1, 1, 0}, {1, 1, 1}, {0, 1, 1}};
        System.out.println(obj.solution(3,computers));
    }

}
