package Medium;

public class MergeNodesInBetweenZeros {

    public ListNode mergeNodes(ListNode head) {

        ListNode nowNode = new ListNode(0);
        ListNode nextNode = head.next;
        ListNode resultNode = nowNode;// 결과를 제출 하기 위해서 시작노드를 따로 지정한다.

        while(true){
            // 값이 0일때
            if(nextNode.val == 0){
                // 다음 노드 없을경우
                if(nextNode.next == null){
                    break;
                }
                //다음노드 초기화한다.
                nowNode.next = new ListNode(0);
                nowNode = nowNode.next;
            }else{
                // 현재 노드 값을 추가한다.
                nowNode.val += nextNode.val;
            }
            // 기존 노드 다음으로 이동한다.
            nextNode = nextNode.next;
        }

        return resultNode;
    }


    public class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
}
