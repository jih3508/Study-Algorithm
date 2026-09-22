from collections import defaultdict
"""
49. Group Anagrams
https://leetcode.com/problems/group-anagrams/description
"""
class Solution:
    def groupAnagrams(self, strs: list[str]) -> list[list[str]]:
        """애너그램끼리 같은 그룹으로 묶는다.

                strs: 소문자로만 된 문자열 리스트 (빈 문자열 포함 가능)
                반환: 애너그램 그룹 목록 (그룹 순서와 그룹 안의 순서는 상관없음)
                """
        # 키: 정렬된 문자열. 애너그램끼리는 정렬 결과가 같아서 그룹의 대표값으로 쓸 수 있다
        # defaultdict(list): 없는 키에 처음 접근할 때 빈 리스트를 자동으로 만든다 (Java의 computeIfAbsent 역할)
        group = defaultdict(list)

        for word in strs:
            # sorted()는 문자열을 받아도 리스트를 돌려준다 → join으로 다시 문자열로 만든다
            # 리스트는 해시할 수 없어서(mutable) dict 키로 쓸 수 없다 → 반드시 str이나 tuple로 바꿔야 한다
            group["".join(sorted(word))].append(word)

        # values()는 dict에 연결된 뷰일 뿐이라, 반환 타입 list[list[str]]에 맞게 리스트로 바꾼다
        return list(group.values())


solution = Solution()
print(solution.groupAnagrams(["eat","tea","tan","ate","nat","bat"] ))
print(solution.groupAnagrams([""]))
print(solution.groupAnagrams(["a"]))