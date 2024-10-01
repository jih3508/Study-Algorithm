class Solution:
    def maxProfitAssignment(self, difficulty: list[int], profit: list[int], worker: list[int]) -> int:

        # difficulty, profit 하나의 리스트로 재 정의
        jobs = [(d, p) for d, p in zip(difficulty, profit)]
        # difficulty 기준으로 정렬
        jobs.sort(key=lambda job: job[0])
        # worker  정렬
        worker.sort()

        size = len(jobs)
        i = 0
        maxValue = 0 # 이전 profit보다 작을수 있어서 worker 들이 최대 받을수 있는 값을 저장 하기 위한 변수 이다.
        result = 0
        for w in worker:
            # two point
            # worker가 joibs 다 탐색 안하고 이전 탐색부터 시작해서 최대 할수 있는 난이도까지 간다.
            while i < size and w >= jobs[i][0]:
                # 만약 이전 난이도 보다 profit이 적을 수 있어서 이전 profit이랑 비교해서 현재 difficulty까지 최대 값을 저장한다.
                maxValue = max(maxValue, jobs[i][1])
                i += 1
            # 최대 할수 있는 작업 탐색 끝나면 worker가 최대 받을 수 있는 값을 추가 한다.
            result += maxValue

        return result


solution = Solution()
difficulty = [2,4,6,8,10]
profit = [10,20,30,40,50]
worker = [4,5,6,7]
print(solution.maxProfitAssignment(difficulty, profit, worker))
difficulty = [85,47,57]
profit = [24,66,99]
worker = [40,25,25]
print(solution.maxProfitAssignment(difficulty, profit, worker))
