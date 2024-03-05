from collections import OrderedDict

class LRUCache:
    def __init__(self, capacity: int):
        self.size = capacity
        self.cache = OrderedDict() # 순서대로 저장하는 자료구조

    def get(self, key: int) -> int:
        if key not in self.cache: return - 1
        # 사용후 맨
        self.cache.move_to_end(key)
        return self.cache[key]

    def put(self, key: int, value: int) -> None:
        self.cache[key] = value
        self.cache.move_to_end(key)
        print(self.cache)
        if len(self.cache.keys()) > self.size:
            self.cache.popitem(last=False)


lRUCache = LRUCache(2)
lRUCache.put(1, 1)
lRUCache.put(2, 2)
print(lRUCache.get(1))
lRUCache.put(3, 3)
print(lRUCache.get(2))
lRUCache.put(4, 4)
print(lRUCache.get(1))
print(lRUCache.get(3))
print(lRUCache.get(4))