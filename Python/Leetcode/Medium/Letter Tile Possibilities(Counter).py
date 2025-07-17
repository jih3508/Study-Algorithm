class Solution:
    def numTilePossibilities(self, tiles: str) -> int:

        size = len(tiles) # 타일의 총 개수
        result = 0

        """
        재귀적으로 가능한 모든 문자열 시퀀스의 개수를 계산
        각 문자를 하나씩 선택하여 시퀀스를 만들고, 만들어진 시퀀스마다 카운트를 증가시킵니다.
        @param count 각 알파벳 문자의 현재 사용 가능한 개수를 나타내는 배열
        """
        def counter(count):

            nonlocal  result

            # 26개의 알파벳을 모두 확인 (A-Z)
            for i in range(26):

                # 현재 문자(i번째 알파벳)가 사용 가능한 경우 (개수가 0보다 큰 경우)
                if count[i] > 0:
                    count[i] -= 1 # 해당 문자를 하나 사용 (빈도수 감소)
                    result += 1 # 새로운 시퀀스가 만들어졌으므로 결과 카운트 증가

                    # 현재 문자를 사용한 상태에서 더 긴 시퀀스를 만들기 위해 재귀 호출
                    counter(count)

                    # 백트래킹: 해당 문자의 사용을 되돌림 (빈도수 복원)
                    count[i] += 1

        count = [0 for _ in range(26)]
        for alphabet in tiles:
            count[ord(alphabet) - ord("A")] += 1

        # 빈도수 배열을 바탕으로 가능한 시퀀스 개수 계산
        counter(count);
        return result



solution = Solution()
print(solution.numTilePossibilities("AAB"))
print(solution.numTilePossibilities("AAABBC"))
print(solution.numTilePossibilities("V"))