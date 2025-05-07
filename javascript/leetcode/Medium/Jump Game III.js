var canReach = function(arr, start) {

    const size = arr.length; // 배열의 길이
    // 각 인덱스 방문 여부를 추적하기 위한 배열을 초기화
    let visited = Array(size).fill(false);

    // DFS(깊이 우선 탐색) 위한 Stack 생성
    let stack = [];
    // 시작 인덱스를 큐에 추가하고 방문했다고 표시
    stack.push(start);
    visited[start] = true;

    // 스택 비어있지 않는 동안 반복
    while(stack.length > 0) {
        // 스택에서 현재 탐색할 인덱스
        const index = stack.pop();

        // 현재 인덱스의 값이 0이면 목표에 도달했으므로 true를 반환
        if(arr[index] == 0){
            return true;
        }

        // 현재 인덱스에서 왼쪽(이전)으로 점프할 위치를 계산
        const before = index - arr[index];
        // 왼쪽 점프가 배열 범위 내에 있고 아직 방문하지 않았다면
        if(index - arr[index] >=0 && !visited[before]){
            // 해당 인덱스를 큐에 추가하고 방문했다고 표시
            stack.push(before);
            visited[before] = true;
        }

        // 현재 인덱스에서 오른쪽(이후)으로 점프할 위치를 계산
        const after = index + arr[index];
        // 오른쪽 점프가 배열 범위 내에 있고 아직 방문하지 않았다면
        if(after < size && visited[after] == false){
            // 해당 인덱스를 큐에 추가하고 방문했다고 표시
            stack.push(index + arr[index]);
            visited[after] = true;
        }
    }

    return false
};


let arr = [4,2,3,0,3,1,2];
console.log(canReach(arr, 5));

arr = [4,2,3,0,3,1,2];
console.log(canReach(arr, 0));

arr = [3,0,2,1,2];
console.log(canReach(arr, 2));