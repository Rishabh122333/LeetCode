// { Driver Code Starts
import java.util.Scanner;
import java.util.Stack;
class SpeStack{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			Stack<Integer> s=new Stack<>();
			GfG g=new GfG();
			while(!g.isEmpty(s)){
			    g.pop(s);
			}
			while(!g.isFull(s,n)){
				g.push(sc.nextInt(),s);
			}
		System.out.println(g.min(s));
		}
	}
}// } Driver Code Ends


/*Complete the function(s) below*/
class GfG{
    Stack<Integer> min=new Stack<>();
	public void push(int x,Stack<Integer> stack)
	{
	    if(stack.isEmpty() || min.isEmpty())
        {
            stack.push(x);
            min.push(x);
            return;
        }
        stack.push(x);
        if(stack.peek()<min.peek())
        {
            min.pop();
            min.push(x);
        }
	    //add code here.
	}
	public int pop(Stack<Integer> stack)
        {
            if(stack.isEmpty())
                return -Integer.MIN_VALUE;
            int x=stack.pop();
            if(x==min.peek())
                min.pop();
            return x;
            //add code here.
	}
	public int min(Stack<Integer> stack)
        {
           //add code here.
           return min.peek();
	}
	public boolean isFull(Stack<Integer>stack, int n)
        {
           //add code here.
           return stack.size()==n;
	}
	public boolean isEmpty(Stack<Integer>stack)
        {
           //add code here.
           return stack.isEmpty();
	}
}