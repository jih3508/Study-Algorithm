"""
Longest Substring Without Repeating Characters
url: https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
"""
class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:

        # alpha[문자 코드] = 그 문자가 마지막으로 나온 위치 + 1 (0 = 아직 안 나옴)
        # 아래 index는 문자열 위치가 아니라 alpha의 칸 번호(문자 코드)다
        # ASCII 범위라 128칸이면 충분 → 범위 밖 문자가 올 수 있으면 크기를 늘리거나 Map이 필요
        alpha = dict({})
        left, max_length = 0, 0

        for right in range(len(s)):
            index = s[right]

            # 불변식: 이 줄을 지나면 s[left..right]에 중복 문자가 없다
            # 현재 문자가 윈도우 안에 있었다면 left를 '직전 위치 + 1'로 밀어낸다
            # Math.max가 핵심: alpha[index]는 윈도우 왼쪽 바깥의 옛 위치일 수 있다
            # 그대로 대입하면 left가 뒤로 후퇴해서 이미 버린 중복이 윈도우에 되살아난다
            # 예) "xyyx"의 마지막 x에서 alpha['x'] = 1, 하지만 left는 이미 2
            left = max(left, alpha.get(index, 0))

            # 순서 주의: left를 구한 '뒤에' 갱신한다
            # 먼저 덮어쓰면 left가 right + 1이 되어 윈도우 길이가 항상 0이 된다
            # '+ 1'로 저장하는 이유: 기본값 0이 곧 '미등장'이라 초기화·분기가 필요 없고, 이 값이 그대로 새 left가 된다
            alpha[index] = right + 1
            max_length = max(max_length, right - left + 1)


        return max_length


solution = Solution()
print(solution.lengthOfLongestSubstring("abcabcbb"))
print(solution.lengthOfLongestSubstring("bbbbb"))
print(solution.lengthOfLongestSubstring("pwwkew"))
print(solution.lengthOfLongestSubstring("S"))