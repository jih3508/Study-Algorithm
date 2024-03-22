class Solution:
    def canFinish(self, numCourses, prerequisites):
        needCourses = {i : [] for i in range(numCourses)}
        for prerequisite in prerequisites:
            needCourses[prerequisite[1]].append(prerequisite[0])
        trace = set()
        visited = [False] * (numCourses)


        def dfs(num):
            if num in trace:
                return False
            if visited[num]:
                return True

            trace.add(num)
            for course in needCourses[num]:
                if not dfs(course):
                    return False

            trace.remove(num)
            visited[num] = True
            return True

        for course in range(numCourses):
            if not dfs(course):
                return False

        return True


solution = Solution()
print(solution.canFinish(2, [[1,0]]))
print(solution.canFinish(2, [[1,0],[0,1]]))
print(solution.canFinish(2, [[0, 1]]))