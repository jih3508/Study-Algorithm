package Medium;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveMethodsFromProject {

    private boolean[] suspicious;
    private boolean[] vis;
    private List<Integer>[] f;
    private List<Integer>[] g;

    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        suspicious = new boolean[n];
        vis = new boolean[n];
        f = new List[n];
        g = new List[n];
        Arrays.setAll(f, i -> new ArrayList<>());
        Arrays.setAll(g, i -> new ArrayList<>());
        for (var e : invocations) {
            int a = e[0], b = e[1];
            f[a].add(b);
            f[b].add(a);
            g[a].add(b);
        }
        dfs(k);
        for (int i = 0; i < n; ++i) {
            if (!suspicious[i] && !vis[i]) {
                dfs2(i);
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            if (!suspicious[i]) {
                ans.add(i);
            }
        }
        return ans;
    }

    private void dfs(int i) {
        suspicious[i] = true;
        for (int j : g[i]) {
            if (!suspicious[j]) {
                dfs(j);
            }
        }
    }

    private void dfs2(int i) {
        vis[i] = true;
        for (int j : f[i]) {
            if (!vis[j]) {
                suspicious[j] = false;
                dfs2(j);
            }
        }
    }

    public static void main(String[] args) {
        RemoveMethodsFromProject obj = new RemoveMethodsFromProject();
        System.out.println("CASE1");
        int[][] invocations = {{1,2},{0,1},{3, 2}};
        System.out.println(obj.remainingMethods(4, 1, invocations));

        System.out.println("CASE2");
        invocations = new int[][] {{1,2},{0,2},{0,1},{3,4}};
        System.out.println(obj.remainingMethods(5, 0, invocations));

        System.out.println("CASE3");
        invocations = new int[][] {{1,2},{0,1},{2,0}};
        System.out.println(obj.remainingMethods(3, 2, invocations));
    }
}
