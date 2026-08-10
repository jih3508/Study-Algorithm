def solution(citations):
    # 인용 횟수를 오름차순으로 정렬한다.
    # 예: [3, 0, 6, 1, 5] -> [0, 1, 3, 5, 6]
    citations = sorted(citations)

    n = len(citations)
    result = 0

    # 정렬된 배열에서 인덱스 i를 기준으로 보면,
    # citations[i]부터 citations[n-1]까지의 (n - i)편은
    # 모두 citations[i] 이상 인용된 논문이다.
    #
    # 즉, "citations[i] 이상 인용된 논문이 (n - i)편 존재한다"는 뜻이므로,
    # 이 지점에서 만들 수 있는 h 후보는
    #   min(citations[i], n - i)
    # 가 된다.
    #
    # 이 후보값들 중 최댓값이 H-Index다.
    for i in range(n):
        papers_cited_at_least_this_much = n - i
        candidate = min(citations[i], papers_cited_at_least_this_much)
        result = max(result, candidate)

    return result