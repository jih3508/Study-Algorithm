"""
뉴스 클러스터링
url: https://school.programmers.co.kr/learn/courses/30/lessons/17677
"""

from collections import Counter

def solution(str1, str2):
    multiset1 = to_multiset(str1)
    multiset2 = to_multiset(str2)

    # & 는 각 원소 개수의 min, | 는 max — 다중집합 정의와 정확히 일치
    intersection = sum((multiset1 & multiset2).values())
    union = sum((multiset1 | multiset2).values())

    if union == 0: return 65536

    return 65536 * intersection // union


def to_multiset(s : str):
    s = s.lower()
    # isalpha() 만으로 두 글자가 모두 영문자인지 검사
    return Counter(
        s[i:i+2] for i in range(len(s)-1) if s[i:i+2].isalpha()
    )

print(solution("FRANCE", "french"))
print(solution("handshake", "shake hands"))
print(solution("aa1+aa2", "AAAA12"))
print(solution("E=M*C^2", "e=m*c^2"))