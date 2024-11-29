from typing import List

class Solution:
    def bagOfTokensScore(self, tokens: List[int], power: int) -> int:

        size = len(tokens)
        # 크기가 0이면 0으로 리턴
        if(size == 0):
            return 0

        start = 0
        end = size - 1
        score = 0
        scores = [0] * size
        tokens.sort()
        # two pointer
        while(start <= end):
            # power가 start 위치 token 값보다 클때  에너지를 감소하고 점수 1 증가
            if(power >= tokens[start]):
                power -= tokens[start]
                score += 1
                scores[start] = score
                start += 1
            else:
                # 현재 점수가 0보다 클때 점수 1로 감소하고 에너지를 증가
                if(score > 0):
                    power += tokens[end]
                    score -= 1
                    scores[end] = score
                    end -= 1
                # 현재 점수가 0이면 더이상 감소 시킬수 없어서 0으로 리턴 시킨다.
                else:
                    return 0
        # 기록 된 점수 값중 가장 큰 값을 출력한다.
        return max(scores)