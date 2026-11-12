from collections import Counter


class Solution:
    def firstUniqChar(self, s: str) -> int:
        """한 번만 등장하는 문자 중 가장 앞에 있는 것의 인덱스를 찾는다.

        s: 소문자 알파벳으로만 이뤄진 문자열
        반환: 첫 유일 문자의 인덱스, 없으면 -1
        """
        # 키 범위가 소문자 26개라 Counter(dict)여도 공간은 O(1).
        # 1차 순회: 전체 빈도를 먼저 다 세야 한다.
        # 뒤에 같은 문자가 또 나올 수 있어서 한 번의 순회로는 판단 불가
        counter = Counter(s)

        # 2차 순회는 counter가 아니라 s를 기준으로 돈다.
        # 원래 순서대로 보니까 처음 만난 빈도 1 문자가 곧 정답 → 바로 return
        for index, alpha in enumerate(s):
            if counter[alpha] == 1:
                return index

        # 끝까지 못 찾았으면 모든 문자가 2번 이상 등장한 경우
        return -1


solution = Solution()
print(solution.firstUniqChar("leetcode"))
print(solution.firstUniqChar("loveleetcode"))
print(solution.firstUniqChar("aabb"))