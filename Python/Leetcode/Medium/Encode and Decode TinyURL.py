import random

class Codec:
    def __init__(self):
        self.map = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"
        self.codeMap = dict({}) # 인코딩 url 저장용 자료구조

    def encode(self, longUrl: str) -> str:
        # 6자리로 랜덤 문자열을 만들어서 urlMap에 저장한다.
        encodingUrl = "http://tinyurl.com/" + ''.join([random.choice(self.map) for _ in range(6)])
        self.codeMap[encodingUrl] = longUrl
        return encodingUrl


    def decode(self, shortUrl: str) -> str:
        """Decodes a shortened URL to its original URL.
        """
        # 저장한 urlMap에 가져온다.
        return self.codeMap[shortUrl]

sample = Codec()
encodingUrl = sample.encode("https://leetcode.com/problems/design-tinyurl")
print(encodingUrl)
print(sample.decode(encodingUrl))