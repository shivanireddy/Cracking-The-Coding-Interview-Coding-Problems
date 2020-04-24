/**
 * Problem Statement : 
 * 
 * Given a circular linked list, implement an 
 * algorithm that returns the node at the beginning
 * of the loop.
 * 
 * DEFINITION: 
 * Circular Linked List : A linked list in which a
 * node's next pointer points to the earlier node, so
 * as to make a loop in the linked list.
 * 
 * Ex. Input : A -> B -> C -> D -> E -> C [The same C as earlier]
 * Output : C
 * 
 */
 
 public class Problem_08 {
	 public static <T> LinkedListNode<T> beginingOfLoop(LinkedListNode<T> head) {
		 LinkedListNode<T> slow = head, fast = head;
		 while(fast!=null && fast.next!=null){
			 slow=slow.next;
			 fast=fast.next.next;
			 if(slow==fast) break;
		 }
		 if(fast==null || fast.next==null) return null;
		 slow=head;
		 while(slow!=fast){
			 slow=slow.next;
			 fast=fast.next;
		 }
		 return fast;
	 }
 }