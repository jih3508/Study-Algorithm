from collections import Counter

class Solution(object):
    def minimumPushes(self, word):

        # 알파벳 빈도수를 저장할 배열 초기화 (26개의 알파벳)
        count = [0 for _ in range(26)]

        # 입력 문자열의 각 문자에 대한 빈도수 계산
        for alphabet in word:
            count[ord(alphabet) - ord('a')] += 1 # 'a'를 빼서 인덱스로 변환 (a=0, b=1, ...)

        # 빈도수 배열을 오름차순으로 정렬
        count.sort()

        # 최소 푸시 횟수 계산
        result = 0
        for i in range(26):
            #  빈도수가 높은 문자부터 처리 (뒤에서부터 접근)
            # i/8 + 1은 몇 번째 키 위치인지 계산 (첫 8개는 1번 누름, 다음 8개는 2번 누름, ...)
            result += count[26 - i -1] * (i // 8 + 1)

        return result



solution = Solution()
print(solution.minimumPushes("abcde"))
print(solution.minimumPushes("xyzxyzxyzxyz"))
print(solution.minimumPushes("aabbccddeeffgghhiiiiii"))