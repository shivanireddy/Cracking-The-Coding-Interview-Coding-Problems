/**
 * Problem Statement : 
 * 
 * Implement a function to check if a linked
 * list is a palindrome.
 * 
 */
 
 public class Problem_06 {
	 public boolean isPalindrome(LinkedListNode head){
		 LinkedListNode reversed = reverseAndClone(head);
		 return isEqual(head,reversed);
	 }
	 
	 public LinkedListNode reverseAndClone(LinkedListNode node){
		 LinkedListNode head = null;
		 while(node!=null){
			 LinkedListNode n = new LinkedListNode(node.data);
			 n.next = head;
			 head = n;
			 node = node.next;
		 }
		 return head;
	 }
	 
	 public boolean isEqual(LinkedListNode one, LinkedListNode two){
		 while(one!=null && two!=null){
			 if(one.data!=two.data) return false;
			 one=one.next;
			 two=two.next;
		 }
		 return one==null && two==null;
	 }
	 // Using fast and slow pointer and stack approach
	 public boolean isPalindromeUsingStack(LinkedList head){
		 LinkedListNode fast = head;
		 LinkedListNode slow = head;
		 Stack<Integer> stack = new Stack<Integer>();
		//When fast pointer is at the end, slow pointer will be in the middle
		while(fast!=null && fast.next!=null){
			stack.push(slow.data);
			slow=slow.next;
			fast=fast.next.next;
		}
		//If LL has odd number of elements, skip the middle element
		if(fast!=null) slow=slow.next;
		while(slow!=null){
			int top = stack.pop().intValue();
			if(top!=slow.data) return false;
			slow=slow.next;
		}
		return true;
	 }
 }