function solution(n, computers) {

    let counter = 0; // 네트워크의 개수를 저장할 변수
    let visited = Array(n).fill(false); // 모든 컴퓨터를 처음엔 방문하지 않은 상태로 초기화

    const dfs = (node) => {

        visited[node] = true; // 현재 노드를 방문 처리

        for(let i = 0; i < n; i++){

            // 연결되어 있고 아직 방문하지 않은 노드에 대해 다음 노드 탐색
            if(computers[node][i] === 1 && !visited[i]){
                dfs(i);
            }
        }
    }


    for(let i = 0; i < n; i++){

        // 해당 컴퓨터를 아직 방문하지 않았으면 탐색하고 네트워크 개수 추가
        if(!visited[i]){
            dfs(i);
            counter++;
        }
    }

    return counter;
}

console.log(solution(3, [[1, 1, 0], [1, 1, 0], [0, 0, 1]]))
console.log(solution(3, [[1, 1, 0], [1, 1, 1], [0, 1, 1]]))