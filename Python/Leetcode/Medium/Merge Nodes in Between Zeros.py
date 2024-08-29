from typing import Optional

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def mergeNodes(self, head: Optional[ListNode]) -> Optional[ListNode]:
        nowNode = ListNode(0)
        nextNode = head.next
        resultNode = nowNode # 결과를 제출 하기 위해서 시작노드를 따로 지정한다.

        while(True):
            # 값이 0일때
            if(nextNode.val == 0):
                # 다음 노드 없을경우
                if(nextNode.next == None):
                    break
                # 다음노드 초기화한다.
                nowNode.next = ListNode(0)
                nowNode = nowNode.next
            else:
                # 현재 노드 값을 추가한다.
                nowNode.val += nextNode.val
            # 기존 노드 다음으로 이동한다.
            nextNode = nextNode.next

        return resultNode
