package Medium;

import java.util.*;

public class PathWithMaximumProbability {

    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {

        if (n == 0) {
            return 0;
        }
        List<List<int[]>> G = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            G.add(new ArrayList<>());
        }
        for (int i = 0; i < edges.length; i++) {
            int[] edge = edges[i];
            G.get(edge[0]).add(new int[]{i, edge[1]});
            G.get(edge[1]).add(new int[]{i, edge[0]});
        }

        double[] probs = new double[n];
        LinkedList<Integer> Q = new LinkedList<>();
        probs[start_node] = 1;
        Q.addLast(start_node);

        while (!Q.isEmpty()) {
            int qsize = Q.size();
            Set<Integer> set = new HashSet<>();

            for (int i = 0; i < qsize; i++) {
                int v = Q.poll();
                if (v == end_node) {
                    continue;
                }
                for (int[] ew : G.get(v)) {
                    double nextProb = probs[v] * succProb[ew[0]];
                    if (nextProb > probs[ew[1]]) {
                        probs[ew[1]] = nextProb;
                        set.add(ew[1]);
                    }
                }
            }
            for (int w : set) {
                Q.addLast(w);
            }
        }
        return probs[end_node];
    }

    public static void main(String[] args) {
        PathWithMaximumProbability solution = new PathWithMaximumProbability();
        int[][] edges = {{0,1},{1,2},{0,2}};
        double[] succProb = {0.5,0.5,0.2};
        System.out.println(solution.maxProbability(3, edges, succProb, 0, 2));

        edges = new int[][] {{0,1},{1,2},{0,2}};
        succProb = new double[] {0.5,0.5,0.3};
        System.out.println(solution.maxProbability(3, edges, succProb, 0, 2));

        edges = new int[][] {{0,1}};
        succProb = new double[] {0.5};
        System.out.println(solution.maxProbability(3, edges, succProb, 0, 2));
    }
}
