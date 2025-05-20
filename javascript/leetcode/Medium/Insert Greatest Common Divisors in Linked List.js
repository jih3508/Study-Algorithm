
 function ListNode(val, next) {
     this.val = (val===undefined ? 0 : val)
     this.next = (next===undefined ? null : next)
 }

/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var insertGreatestCommonDivisors = function(head) {

    // 두 정수의 최대공약수를 계산하는 함수
    const GCD = (x, y) =>{
        while(y != 0 && x % y != 0){
            const r = x % y;
            x = y;
            y = r;
        }
        return y;
    }

    let node = head; // 현재 처리 중인 노드

    while(node.next !== null){ // 다음 노드가 있는 동안 반복
        const nextNode = node.next; // 다음 노드 참조 저장

        const gdc = GCD(node.val, nextNode.val); // 현재 노드와 다음 노드 값의 최대공약수 계산
        const newNode = new ListNode(gdc);  // 최대공약수 값을 가진 새 노드 생성


        // 새 노드를 현재 노드와 다음 노드 사이에 삽입
        node.next = newNode;     // 현재 노드가 새 노드를 가리키도록 함
        newNode.next = nextNode; // 새 노드가 다음 노드를 가리키도록 함

        node = nextNode;  // 처리할 노드를 다음 노드로 이동
    }

    return head;

};