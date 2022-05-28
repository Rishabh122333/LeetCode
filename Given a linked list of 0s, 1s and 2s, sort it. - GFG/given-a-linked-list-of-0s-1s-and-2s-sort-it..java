// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Driverclass
{
    public static void main (String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            while(n-- > 1){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }
		   
		      head = new Solution().segregate(head);
		     printList(head);
		    System.out.println();
        }
    }
    
    public static void printList(Node head)
    {
        if(head == null)
           return;
           
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    
}



// } Driver Code Ends


//User function Template for Java

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution
{
     public static int sizeoflist(Node head)
    {
        Node temp=head;
        int c=0;
        while(temp!=null)
        {
            c++;
            temp=temp.next;
        }
        return  c;
    }
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
         Node temp=head;
        int c0=0,c2=0,c1=0;
        while(temp!=null)
        {
            if(temp.data==0)
                c0++;
            else if(temp.data==1)
                c1++;
            else
                c2++;
            temp=temp.next;
        }
        temp=head;
        while(temp!=null) {
            if (c0 != 0) {
                temp.data = 0;
                c0--;
            }
            else if (c1 != 0) {
                temp.data = 1;
                c1--;
            }
            else if (c2 != 0) {
                temp.data = 2;
                c2--;
            }
            temp=temp.next;
        }
        return head;
        // add your code here
    }
}


