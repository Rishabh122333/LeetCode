class MyStack {
    int tos;
    int stack[];
    public MyStack() {
        tos=-1;
        this.stack=new int[100]; 
    }
    
    public void push(int x) {
        if(tos==99)
            System.out.println("Stack overflow");
        else
        {
            tos++;
            stack[tos]=x;
        }
    }
    
    public int pop() {
         int x=-1;
        if(empty())
            System.out.println("Stack underflow");
        else
        {
            x=stack[tos--];
        }
        return x;
    }
    
    public int top() {
         if(empty())
            System.out.println("Stack underflow");
        return stack[tos];
    }
    
    public boolean empty() {
       return tos==-1;
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