/**
 * Problem Statement : 
 * 
 * Implement an algorithm to find K'th to 
 * last element of a singly linked list.
 * Note : Size of linked list is not known
 * 
 */
 
 public class Problem_02 {
	 /* Move the fast pointer upto k nodes
		Then move both fast and slow point at same pace and when fast pointer hits end, slow pointer will be at right element.
		Time Complexity: O(n)
		Space Complexity: O(1)
	 */
	 public static <T> LinkedListNode<T> findKthToLastElement(LinkedListNode<T> head,int k) {
		 if(head==null || k<=0)
			 throw new IllegalArgumentException("Invalid Input");
		 LinkedListNode<T> fast = head, slow = head;
		 for(int i = 0; i < k; i++){
			 if(fast==null) return null;
			 fast=fast.next;
		 }
		 while(fast!=null){
			 fast=fast.next;
			 slow=slow.next;
		 }
		 return slow;
	 }
 }