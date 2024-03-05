package Medium;

import java.util.LinkedHashMap;

class LRUCache {

	int size;
	LinkedHashMap<Integer, Integer> cache;
	
    public LRUCache(int capacity) {
        this.size = capacity;
        this.cache = new LinkedHashMap(); // 순서대로 저장 해주는 Map
    }
    
    public int get(int key) {
        return cache.getOrDefault(key, -1);
    }
    
    public void put(int key, int value) {
    	// 캐시 안에 키값이 존재할경우 기존 키 삭제하고 다시 집어 넣음
    	if(cache.containsKey(key)) {
    		cache.remove(key);
    	}
    	cache.put(key, value);
    	// 용량 초과일경우 최근것을 삭제한다.
    	if(cache.size() > size) {
    		// 최근 사용한 키 또는 저장한키를 추출함
    		int removeKey = cache.keySet().iterator().next();
    		cache.remove(removeKey);
    	}
    }
}