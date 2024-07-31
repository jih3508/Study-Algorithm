package Medium;

import java.util.ArrayList;
import java.util.List;

public class MaximumTwinSumOfALinkedList {

    public int pairSum(ListNode head) {

        List<Integer> list = new ArrayList<>(); // linkedList 값을 순서대로 담을 list

        // linkedList에서 다음 node 없을때 까지 순환한다.
        while(head != null){
            list.add(head.val);
            head = head.next; // 다음 노드로 이동한다.
        }

        int size = list.size();
        int maxValue = 0;
        // i와 맞은편 size - 1 - i 위치와 더해서 큰 값을 저장한다.
        for (int i = 0; i < size / 2; i++) {
            maxValue = Math.max(maxValue, list.get(i) + list.get(size - 1 - i));
        }

        return maxValue;
    }

    public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
