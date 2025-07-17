class Solution:
    def numTilePossibilities(self, tiles: str) -> int:

        size = len(tiles) # 타일의 총 개수
        strings = set() # 중복을 제거하기 위한 Set (만들어진 모든 문자열을 저장)

        def backtracking(arr, visited):
            # 현재 문자열의 길이가 타일 개수를 초과하면 종료(실제로는 이 조건에 도달하지 않음 - 안전장치)
            if len(arr) > size:
                return

            # 현재 만들어진 문자열을 결과 세트에 추가
            # 중복은 자동으로 제거됨
            strings.add("".join(arr))

            # 모든 타일을 순회하면서 사용 가능한 타일로 문자열을 확장
            for i in range(size):
                # 아직 사용하지 않은 타일인 경우
                if not visited[i]:
                    arr.append(tiles[i]) # 현재 타일의 글자를 문자열에 추가
                    visited[i] = True # 해당 타일을 사용됨으로 표시

                    backtracking(arr, visited)

                    # 백트래킹: 이전 상태로 되돌리기
                    arr.pop()
                    visited[i] = False


        # 빈 문자열부터 시작해서 백트래킹 수행
        backtracking([], [False for _ in range(size)])
        strings.remove("") # 빈 문자열은 제외 (문제에서 비어있지 않은 시퀀스를 요구)

        return len(strings)

solution = Solution()
print(solution.numTilePossibilities("AAB"))
print(solution.numTilePossibilities("AAABBC"))
print(solution.numTilePossibilities("V"))