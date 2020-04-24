/**
 * Problem Statement:
 * 
 * Write code to remove duplicates from unsorted linked list
 * 
 * FOLLOW UP : How would you solve this problem 
 * if temporary buffer is not allowed.
 * 
 */
 
 public class Problem_01{
	  /*
	 Time complexity = O(n)
	 Space Complexity = O(n)
	 
	 */
	 public static <T> void removeDuplicatesWithBuffer(LinkedListNode<T> head){
		 HashSet<T> set = new HashSet<T>();
		 if(head==null) return;
		 LinkedListNode<T> curr = head;
		 LinkedListNode<T> prev = null;
		 while(curr!=null){
			 if(!set.contains(curr.data)){
				 set.add(curr.data);
				 prev = curr;
			 }
			 else prev.next = curr.next;
			 curr=curr.next;
		 }
	 }
	 //using runner - without buffer
	 /*
	 Time complexity = O(n^2)
	 Space Complexity = O(1)
	 
	 */
	 public static <T> void removeDuplicatesWithoutBuffer(LinkedListNode<T> head){
		 if(head==null) return;
		 LinkedListNode<T> curr = head;
		 while(curr!=null){
			 LinkedListNode<T> runner = curr;
			 while(runner.next!=null){
				 if(runner.next.data==curr.data)
					 runner.next=runner.next.next;
				 else runner=runner.next;
			 }
			 curr=curr.next;
		 }
	 }
 }