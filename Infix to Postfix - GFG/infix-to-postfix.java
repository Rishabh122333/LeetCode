// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            System.out.println(
                new Solution().infixToPostfix(br.readLine().trim()));
        }
    }
}// } Driver Code Ends


class Solution {
     public static int precedence(char ch)
    {
        if(ch=='+' || ch=='-')
            return 1;
        else if(ch=='/' || ch=='*' || ch=='%')
            return 2;
        else if(ch=='^')
            return 3;
        return -1;
    }
    // Function to convert an infix expression to a postfix expression.
    public static String infixToPostfix(String str) {
        String ans="";
        Stack<Character>stack=new Stack<>();
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch=str.charAt(i);
            if(Character.isLetterOrDigit(ch))
                ans+=ch;
            else if(ch=='(')
                stack.push(ch);
            else if(ch==')')
            {
                while (!stack.isEmpty() && stack.peek()!='(')
                    ans+=stack.pop();
                stack.pop();
            }
            else
            {
                while(!(stack.isEmpty()) && precedence(ch)<=precedence(stack.peek()))
                    ans+=stack.pop();
                stack.push(ch);
            }
        }
        while(!stack.isEmpty())
            ans+=stack.pop();
        return ans;
    }
}