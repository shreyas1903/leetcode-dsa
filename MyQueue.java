class MyQueue {

    Stack<Integer> og;
    Stack<Integer> temp;
    int top;
    
    public MyQueue() {
        og = new Stack();
        temp = new Stack();
    }
    
    public void push(int x) {
        if(og.empty())
            top = x;
        og.push(x);
    }
    
    public int pop() {
        while(og.size() != 1)
        {
            temp.push(og.pop());
        }
        int popped = og.pop();
        if(!temp.empty())
            top = temp.peek();
        while(!temp.empty())
        {
            og.push(temp.pop());
        }
        return popped;
    }
    
    public int peek() {
        return top;
    }
    
    public boolean empty() {
        return og.empty();
    }
}
