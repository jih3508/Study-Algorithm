

class Solution:
    def beautySum(self, s: str) -> int:

        result = 0 # 결과값을 저장할 변수
        size = len(s) # 문자열의 길이를 저장

        # 부분 문자열의 시작 인덱스를 지정하는 루프
        for i in range(size):

            info = dict({}) # 각 문자의 빈도수를 저장하기 위한 딕셔너리
            # 부분 문자열의 끝 인덱스를 지정하는 루프
            for j in range(i, size):
                # 현재 문자의 빈도수를 딕셔너리에 추가하거나 갱신
                info[s[j]] = info.get(s[j], 0) + 1
                # 빈도수 딕셔너리에서 최대값과 최소값의 차이를 결과값에 더함
                result += max(info.values()) - min(info.values())

        # 모든 부분 문자열의 아름다움의 합 반환
        return result

solution = Solution()
print(solution.beautySum("aabcb"))
print(solution.beautySum("aabcbaa"))