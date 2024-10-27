class Solution(object):
    def sortTheStudents(self, score: list, k):
        score.sort(key = lambda arr: arr[k])
        return score[::-1]