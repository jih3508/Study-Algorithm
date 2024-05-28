package Medium;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class NumberOfProvinces {

    int[][] adj;
    int size;
    boolean[] visited;

    public int findCircleNum(int[][] isConnected) {

        // 초기 세팅
        this.adj = isConnected;
        this.size = adj.length; // 노드 개수
        visited = new boolean[this.size]; // 방문 여부
        Arrays.fill(visited, false);

        int count = 0;// 개수 늘리는 변수
        for(int i = 0; i < this.size; i ++){
            // 방문하지 않았을때 bfs 탐색을 하고 개수를 늘린다.
            if(!visited[i]){
                bfs(i);
                count++;
            }
        }
        
        return count;
    }

    /*
     * bfs 구현
     */
    public void bfs(int node){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(node);

        int current; // 현재 노드
        while(!queue.isEmpty()){
            current = queue.poll();

            for(int i = 0; i < this.size; i++){
                // 자기 자신일때 Pass
                if(current == i){
                    continue;
                } else if (this.adj[current][i] == 1 && !this.visited[i]) { // 연결된 노드와 방문 하지 않았을때 노드 이동
                    queue.add(i);
                    this.visited[i] = true;
                }
            }
        }

    }



    public static void main(String[] args) {
        NumberOfProvinces nop = new NumberOfProvinces();
        System.out.println(nop.findCircleNum(new int[][] {{1,1,0},{1,1,0},{0,0,1}}));
        System.out.println(nop.findCircleNum(new int[][] {{1,0,0},{0,1,0},{0,0,1}}));

    }
}
