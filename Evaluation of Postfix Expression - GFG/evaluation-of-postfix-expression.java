// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    System.out.println(new Solution().evaluatePostFix(br.readLine().trim()));
		}
	}
}// } Driver Code Ends


class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String str)
    {
        // Your code here
         Stack<Integer>stack=new Stack<>();
        char ch;
        for (int i = 0; i <str.length(); i++) {
            ch=str.charAt(i);
            if(ch==' ')
                continue;
            if(Character.isDigit(ch))
                stack.push(ch-48);
            else
            {
                int a=stack.pop();
                int b=stack.pop();
                if(ch=='+')
                    stack.push(b+a);
                else if(ch=='-')
                    stack.push(b-a);
                else if(ch=='*')
                    stack.push(b*a);
                else if(ch=='/')
                    stack.push(b/a);
                else if(ch=='%')
                    stack.push(b%a);
            }
        }
        return stack.peek();
    }
}