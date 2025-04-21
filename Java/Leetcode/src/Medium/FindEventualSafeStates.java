package Medium;

import java.util.*;
/*
 * - 802. Find Eventual Safe States
 * https://leetcode.com/problems/find-eventual-safe-states/description/
 */
public class FindEventualSafeStates {


    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        List<List<Integer>> g = new ArrayList<>();
        int[] ind = new int[n];
        Queue<Integer> queue = new LinkedList<>();

        // 그래프 초기화
        for (int i = 0; i < n; i++) {
            g.add(new ArrayList<>());
        }

        // 역방향 그래프 구성 및 진입 차수 계산
        for (int i = 0; i < graph.length; i++) {
            int[] edges = graph[i];
            for (int e : edges) {
                g.get(e).add(i);   // 간선 방향 뒤집기
                ind[i]++;          // 진입 차수 증가
            }
            if (edges.length == 0) {  // 터미널 노드 식별
                queue.offer(i);
            }
        }

        // 위상 정렬 수행
        List<Integer> result = new ArrayList<>();
        while (!queue.isEmpty()) {
            int node = queue.poll();
            result.add(node);

            for (int nxt : g.get(node)) {
                if (--ind[nxt] == 0) {  // 진입 차수 감소 후 0이면 큐에 추가
                    queue.offer(nxt);
                }
            }
        }

        // 결과 정렬
        Collections.sort(result);
        return result;
    }




    public static void main(String[] args) {
        FindEventualSafeStates obj = new FindEventualSafeStates();
        int[][] graph = new int[][] {{1,2},{2,3},{5},{0},{5},{},{}};
        System.out.println(obj.eventualSafeNodes(graph));
        graph = new int[][] {{1,2,3,4},{1,2},{3,4},{0,4},{}};
        System.out.println(obj.eventualSafeNodes(graph));
        graph = new int[][] {{0},{2,3,4},{3,4},{0,4},{}};
        System.out.println(obj.eventualSafeNodes(graph));
        graph = new int[][] {{},{0,2,3,4},{3},{4},{}};
        System.out.println(obj.eventualSafeNodes(graph));
    }
}
