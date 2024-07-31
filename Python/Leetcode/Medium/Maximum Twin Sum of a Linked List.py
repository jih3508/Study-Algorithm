from typing import Optional

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def pairSum(self, head: Optional[ListNode]) -> int:

        valueList = [] # linkedList 값을 순서대로 담을 list

        # linkedList에서 다음 node 없을때 까지 순환한다.
        while head != None:
            valueList.append(head.val)
            head = head.next # 다음 노드로 이동한다.

        size = len(valueList)
        # i와 맞은편 size - 1 - i 위치와 더해서 큰 값을 저장한다.
        return max([valueList[i] + valueList[size - 1 - i] for i in range(size // 2)])