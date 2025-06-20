class MyStack {

    public MyStack() {
        
    }
    
        // 큐 변수, 구현체는 LinkedList로 선언
        Queue<Integer> queue = new LinkedList<>();

        public void push(int x) {
            // 엘리먼트 삽입
            queue.add(x);
            // 맨 앞에 두는 상태로 전체 재정렬
            for (int i = 1; i < queue.size(); i++)
                queue.add(queue.remove());
        }

        public int pop() {
            // 재정렬한 상태이므로 큐 연산으로 추출
            return queue.remove();
        }

        public int top() {
            // 재정렬한 상태이므로 큐 연산으로 조회
            return queue.peek();
        }

        public boolean empty() {
            // 크기를 비교해 비어있는지 확인
            return queue.size() == 0;
        }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */