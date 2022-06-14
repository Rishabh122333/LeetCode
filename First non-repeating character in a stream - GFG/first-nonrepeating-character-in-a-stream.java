// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String A = br.readLine().trim();
            Solution ob = new Solution();
            String ans = ob.FirstNonRepeating(A);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution
{
    public String FirstNonRepeating(String str)
    {
        StringBuilder resultantString = new StringBuilder();
    int[] characterFrequency = new int[26];
    Queue<Character> queue = new LinkedList<Character>();
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      queue.add(ch);
      characterFrequency[ch - 'a']++;
      while (!queue.isEmpty()) {
        if (characterFrequency[queue.peek() - 'a'] > 1)
          queue.remove();
        else {
          resultantString.append(queue.peek());
          break;
        }
      }
      if (queue.isEmpty())
        resultantString.append("#");
    }
    return resultantString.toString();
    }
}