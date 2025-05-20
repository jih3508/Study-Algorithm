package Medium;

public class InsertGreatestCommonDivisorsInLinkedList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // 최대 공약수 구하는 함수
    public int GCD(int x, int y) {
        while(x % y != 0 && y != 0){
            int r = y % y;
            x = y;
            y = r;
        }
        return y;
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {

        ListNode node = head;  // 현재 처리 중인 노드

        while (node.next != null) {  // 다음 노드가 있는 동안 반복
            ListNode nextNode = node.next;  // 다음 노드 참조 저장

            int val = GCD(node.val, nextNode.val);  // 현재 노드와 다음 노드 값의 최대공약수 계산
            ListNode newNode = new ListNode(val);   // 최대공약수 값을 가진 새 노드 생성

            // 새 노드를 현재 노드와 다음 노드 사이에 삽입
            node.next = newNode;     // 현재 노드가 새 노드를 가리키도록 함
            newNode.next = nextNode; // 새 노드가 다음 노드를 가리키도록 함

            node = nextNode;  // 처리할 노드를 다음 노드로 이동
        }

        return head;
    }

}
