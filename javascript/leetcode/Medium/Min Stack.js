/**
 * 155. Min Stack
 * https://leetcode.com/problems/min-stack/
 */
var MinStack = function() {
    // 모든 원소를 담는 일반 스택
    this.stack = [];
    // 최솟값 "이력" 스택 — 최솟값이 바뀔 때마다 쌓이므로 top이 항상 현재 최솟값
    this.minStack = [];
};

/**
 * 값을 스택에 넣는다.
 * @param value 넣을 값
 */
MinStack.prototype.push = function(value) {
    // '<'가 아니라 '<='인 이유: 최솟값과 같은 값이 중복으로 들어올 때도 기록해야 함.
    // 안 그러면 중복된 최솟값 하나를 pop할 때 minStack이 먼저 비어 최솟값이 틀어진다.
    this.stack.push(value);
    if(this.minStack.length == 0 || value <= this.minStack[this.minStack.length -1]){
        this.minStack.push(value);
    }
};

/**
 * 맨 위 원소를 제거한다. (반환값 없음)
 */
MinStack.prototype.pop = function() {
    // Integer끼리는 == 가 아니라 equals로 비교해야 함.
    // == 는 박싱된 객체의 참조를 비교하고, 값이 -128~127 범위를 벗어나면 같은 값이어도 false가 나올 수 있다.
    // 꺼낸 값이 현재 최솟값이면 이력도 함께 되돌려서 이전 최솟값이 top이 되게 한다.
    if (this.stack.pop() === this.minStack[this.minStack.length -1]) {
        this.minStack.pop();
    }
};

/**
 * 맨 위 원소를 제거하지 않고 조회한다.
 */
MinStack.prototype.top = function() {
    return this.stack[this.stack.length -1];
};

/**
 * 현재 스택의 최솟값을 조회한다.
 */
MinStack.prototype.getMin = function() {
    // 전체를 훑지 않고 minStack의 top만 읽기 때문에 O(1)
    return this.minStack[this.minStack.length -1];
};

/**
 * Your MinStack object will be instantiated and called as such:
 * var obj = new MinStack()
 * obj.push(value)
 * obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.getMin()
 */
