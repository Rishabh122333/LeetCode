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
        StringBuilder sb = new StringBuilder();
    int[] arr = new int[26];
    Queue<Character> queue = new LinkedList<Character>();
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      queue.add(ch);
      arr[ch - 97]++;
      while (!queue.isEmpty()) {
        if (arr[queue.peek() - 97] > 1)
          queue.poll();
        else {
          sb.append(queue.peek());
          break;
        }
      }
      if (queue.isEmpty())
        sb.append("#");
    }
    return sb.toString();
    }
}
