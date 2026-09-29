from collections import Counter


class Solution:
    def topKFrequent(self, nums: list[int], k: int) -> list[int]:
        """가장 자주 등장하는 상위 k개 값을 반환 (반환 순서는 상관없음)
        nums: 정수 리스트, k: 뽑을 개수 (고유 값 개수 이하라고 가정)
        """

        # 값 -> 등장 횟수 (직접 딕셔너리 순회 없이 Counter가 한 번에 센다)
        counter = Counter(nums)

        result = []
        # most_common()은 인자 없이 부르면 빈도 내림차순 전체 정렬을 돌려준다 -> O(m log m)
        # m이 n에 가까우면 O(n log n)이라, 더 빠르게 풀라는 후속 조건에는 힙/버킷이 필요하다
        # 참고: most_common(k)는 내부적으로 힙(heapq.nlargest)을 써서 O(m log k)가 된다
        for key, value in counter.most_common():
            # k를 카운트다운 변수로 재사용: 남은 개수가 0이 되면 즉시 종료
            # (정렬은 이미 끝났지만 더 담을 필요가 없어서 순회만 끊는다)
            if k > 0:
                result.append(key)
                k -= 1
            else:
                break

        # k가 고유 값 개수보다 커도 예외 없이 있는 만큼만 반환 (문제 조건상 발생하지 않음)
        return result


print(Solution().topKFrequent([1,1,1,2,2,3], 2))
print(Solution().topKFrequent([1], 1))
print(Solution().topKFrequent([1,2,1,2,1,2,3,1,3,2], 2))