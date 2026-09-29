class Heap {
    constructor(compare = (a, b) => a[0]-b[0]) {
        this.h = [];
        this.cmp = compare; // cmp(a, b) < 0 이면 a가 더 위(루트 쪽)
    }

    size() { return this.h.length; }
    peek() { return this.h[0]; }

    push(v) {
        const h = this.h;
        h.push(v);
        let i = h.length - 1;
        while (i > 0) {
            const p = (i - 1) >> 1;
            if (this.cmp(h[i], h[p]) >= 0) break;
            [h[i], h[p]] = [h[p], h[i]];
            i = p;
        }
    }

    pop() {
        const h = this.h;
        if (h.length === 0) return undefined;
        const top = h[0];
        const last = h.pop();
        if (h.length > 0) {
            h[0] = last;
            let i = 0;
            const n = h.length;
            while (true) {
                let l = i * 2 + 1, r = l + 1, s = i;
                if (l < n && this.cmp(h[l], h[s]) < 0) s = l;
                if (r < n && this.cmp(h[r], h[s]) < 0) s = r;
                if (s === i) break;
                [h[i], h[s]] = [h[s], h[i]];
                i = s;
            }
        }
        return top;
    }
}

/**
 * 문제: Top K Frequent Elements
 * url: https://leetcode.com/problems/top-k-frequent-elements/description/
 */
var topKFrequent = function(nums, k) {

    // 값 -> 등장 횟수
    let counter = new Map();
    nums.forEach((num) =>{
        // null 분기를 직접 쓰지 않아도 되고, 람다에서 안 쓰는 key 파라미터도 사라진다
        counter.set(num, (counter.get(num) ?? 0) + 1);
    });

    // 빈도가 가장 낮은 원소가 맨 위에 오는 최소 힙, 크기는 k로 유지
    // 전부 넣고 k번 꺼내는 대신 "상위 k개 후보"만 들고 가서 O(m log m) -> O(m log k)
    // 빈도를 음수로 뒤집는 트릭이 필요 없다: 가장 약한 후보를 버리는 게 목적이라 최소 힙이 맞다
    let heap = new Heap();

    counter.forEach((key, value) => {
        heap.push([value, key]);

        if(heap.size() > k){
            heap.pop();
        }
    })

    console.log(counter);

    return 0;
};

console.log(topKFrequent([1,1,1,2,2,3], 2));
console.log(topKFrequent([1], 2));
console.log(topKFrequent([1,2,1,2,1,2,3,1,3,2], 2));
