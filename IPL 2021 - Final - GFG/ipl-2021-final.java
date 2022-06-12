// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.findMaxLen(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution {
    static int findMaxLen(String str) {
        Stack<Integer> stk = new Stack<>();
        stk.push(-1);
        int result = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == '(')
                stk.push(i);
            else
            {
                if(!stk.empty())
                    stk.pop();
                if (!stk.empty())
                    result
                        = Math.max(result,
                                   i - stk.peek());
                else
                    stk.push(i);
            }
        }
 
        return result;
    }
};