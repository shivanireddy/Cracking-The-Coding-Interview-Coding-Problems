/**
 * Problem Statement : 
 * 
 * Write code to partition a linked list around 
 * a value x, such that all nodes less then x
 * come before all node greater then or equal to x.
 * If x is contained within the list, the value of x
 * only need to be after the elements less then x (see below).
 * The partition element x can appear anywhere in the 
 * "right partition"; it does not need to appear between
 * the left and right partition.
 * 
 * Ex. Input : 3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1 [partition = 5]
 * Output : 3 -> 1 -> 2 -> 10 -> 5 -> 5 -> 8
 */
 
 
 public class Problem_04 {
	 public static LinkedListNode<Integer> partition(LinkedListNode<Integer> node, int x){
		 LinkedListNode<Integer> head = node;
		 LinkedListNode<Integer> tail = node;
		 while(node!=null) {
			 LinkedListNode<Integer> next = node.next;
			 if(node.data < x){
				 node.next=head;
				 head=node;
			 } else {
				 tail.next=node;
				 tail=node;
			 }
			 node=next;
		 }
		 tail.next=null;
		 return head;
	 }
 }