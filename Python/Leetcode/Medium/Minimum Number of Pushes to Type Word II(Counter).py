from collections import Counter

class Solution(object):
    def minimumPushes(self, word):

        count = Counter(word)
        return sum([cnt * (i // 8 + 1) for i, cnt in enumerate(sorted(count.values(), reverse=True))])


solution = Solution()
print(solution.minimumPushes("abcde"))
print(solution.minimumPushes("xyzxyzxyzxyz"))
print(solution.minimumPushes("aabbccddeeffgghhiiiiii"))