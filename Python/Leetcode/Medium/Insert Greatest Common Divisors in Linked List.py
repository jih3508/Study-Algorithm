from typing import Optional

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def insertGreatestCommonDivisors(self, head: Optional[ListNode]) -> Optional[ListNode]:

        # 두 정수의 최대공약수를 계산하는 함수
        def GCD(x, y):
            while y != 0 and x % y != 0:
                r = x % y
                x, y = y, r

            return y

        node = head # 현재 처리 중인 노드

        while node.next is not None: # 다음 노드가 있는 동안 반복

            next_node = node.next.next # 다음 노드 참조 저장

            gcd = GCD(node.val, next_node.val) # 현재 노드와 다음 노드 값의 최대공약수 계산
            new_node = ListNode(gcd) # 최대공약수 값을 가진 새 노드 생성

            # 새 노드를 현재 노드와 다음 노드 사이에 삽입
            new_node.next = next_node # 현재 노드가 새 노드를 가리키도록 함
            node.next = new_node # 새 노드가 다음 노드를 가리키도록 함

            node = node.next # 처리할 노드를 다음 노드로 이동


        return head