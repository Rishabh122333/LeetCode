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

    // queue to store the characters
    Queue<Character> queue = new LinkedList<Character>();

    // traverse whole stream of characters
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);

      // push the character into the queue
      queue.add(ch);

      // increment the frequency count
      characterFrequency[ch - 'a']++;

      // check for the non repeating character
      while (!queue.isEmpty()) {
        // when the character is repeated
        if (characterFrequency[queue.peek() - 'a'] > 1)
          queue.remove();
        // when the character is not repeating
        else {
          resultantString.append(queue.peek());
          break;
        }
      }

      // if there is no non-repeating character
      if (queue.isEmpty())
        resultantString.append("#");
    }
    
    return resultantString.toString();
    }
}