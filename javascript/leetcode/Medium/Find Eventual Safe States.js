
/*
 * - 802. Find Eventual Safe States
 * https://leetcode.com/problems/find-eventual-safe-states/description/
 */
var eventualSafeNodes = function(graph) {
    const n = graph.length;
    const g = Array(n).fill().map(() => []);
    const ind = Array(n).fill(0);
    const queue = [];


    // 역방향 그래프 구성 및 진입 차수 계산
    for (let i = 0; i < graph.length; i++) {
        const edges = graph[i];
        for (let e of edges) {
            g[e].push(i);
            ind[i]++;
        }
        if (edges.length === 0) {
            queue.push(i);
        }
    }

    // 위상 정렬 수행
    const res = [];
    while (queue.length >0 ) {

        const node = queue.shift();
        res.push(node);
        for (let next of g[node]) {
            ind[next]--;
            if (ind[next] === 0) {
                queue.push(next);
            }
        }
    }

    // 결과 정렬
    res.sort((a, b) => a - b);
    return res;
};
let grape = [[1,2],[2,3],[5],[0],[5],[],[]];
console.log(eventualSafeNodes(grape));
grape = [[1,2,3,4],[1,2],[3,4],[0,4],[]];
console.log(eventualSafeNodes(grape));