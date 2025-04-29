var input = require('fs').readFileSync(__dirname+'/test.txt').toString().trim().split('\n');
//var input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');

/*
 * 전위 순회 결과로부터 후위 순회 결과를 생성하는 함수
 * root: 현재 서브트리의 루트 노드 인덱스
 * end: 현재 서브트리의 마지막 노드 인덱스
 */
function postOrder(root, end){
    // 기저 조건: 유효하지 않은 범위면 종료
    if(root > end){
        return;
    }

    const start = root + 1; // 루트 다음 노드(왼쪽 서브트리의 시작)
    const node = nodes[root]; // 현재 서브트리의 루트 값
    let mid = start;

    // 오른쪽 서브트리의 시작점(mid)을 찾음
    // 루트 값보다 큰 첫 번째 노드가 오른쪽 서브트리의 시작
    while(mid <= end){
        if(node < nodes[mid]){
            break;
        }
        mid++;
    }

    // 왼쪽 서브트리 후위 순회 (start부터 mid-1까지)
    postOrder(start, mid - 1);
    // 오른쪽 서브트리 후위 순회 (mid부터 end까지)
    postOrder(mid, end);
    // 현재 노드 출력 (후위 순회에서는 루트가 마지막에 방문됨)
    console.log(node);

}


let nodes = [parseInt(input[0])]

for (let i = 1; i < input.length; i++) {
    nodes.push(parseInt(input[i]));
}

// 전체 트리에 대해 후위 순회 수행 (0부터 마지막 인덱스까지)
postOrder(0, nodes.length - 1);