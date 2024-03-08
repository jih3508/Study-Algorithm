package Medium;

import java.io.IOException;
import java.util.LinkedHashMap;

class LRUCache {

	int size;
	LinkedHashMap<Integer, Integer> cache;
	
    public LRUCache(int capacity) {
        this.size = capacity;
        this.cache = new LinkedHashMap(); // 순서대로 저장 해주는 Map
    }
    
    public int get(int key) {
    	// 출력하고 맨 뒤로 보낸다.
    	if(cache.containsKey(key)) {
    		int value = cache.get(key);
    		cache.remove(key);
    		cache.put(key, value);
    		return value;
    	}
        return -1;
    }
    
    public void put(int key, int value) {
    	// 캐시 안에 키값이 존재할경우 기존 키 삭제하고 다시 집어 넣음
    	if(cache.containsKey(key)) {
    		cache.remove(key);
    	}
    	cache.put(key, value);
    	// 용량 초과일경우 최근것을 삭제한다.
    	if(cache.size() > size) {
    		// 맨앞에 key를 출력한다.
    		int removeKey = cache.keySet().iterator().next();
    		cache.remove(removeKey);
    		//System.out.println(removeKey);
    	}
    	System.out.println(cache.toString());
    	
    }
    
    public static void main(String[] args) throws IOException {
    	LRUCache lRUCache = new LRUCache(2);
    	lRUCache.put(1, 1); // cache is {1=1}
    	lRUCache.put(2, 2); // cache is {1=1, 2=2}
    	System.out.println(lRUCache.get(1));   // return 1
    	lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
    	System.out.println(lRUCache.get(2));    // returns -1 (not found)
    	lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
    	System.out.println(lRUCache.get(1));    // return -1 (not found)
    	System.out.println(lRUCache.get(3));    // return 3
    	System.out.println(lRUCache.get(4)); 
    }
}