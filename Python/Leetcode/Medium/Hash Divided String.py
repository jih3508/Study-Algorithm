class Solution:
    def stringHash(self, s: str, k: int) -> str:

        result = ""
        # k 길이 만큼 증가
        for i in range(0, len(s), k):
            #
            result += chr(sum(map(lambda x: ord(x) - ord('a'), list(s[i: i + k]))) % 26 + ord('a'))
        #return result
        return ''.join([chr(sum(map(lambda x: ord(x) - ord('a'), list(s[i: i + k]))) % 26 + ord('a')) for i in range(0, len(s), k)])


soltion = Solution()
print(soltion.stringHash( "abcd", 2))
print(soltion.stringHash( "mxz", 3))



