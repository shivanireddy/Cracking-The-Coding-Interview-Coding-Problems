/**
 * Problem Statement : 
 * 
 * Implement an algorithm to delete a node
 * in the middle (i.e any node but the first
 * and last node. Not necessarily the exact middle)
 * of a singly linked list, given only access to 
 * first node.
 * 
 * ex. delete c from : a -> b -> c -> d -> e -> f
 * output : a -> b -> d -> e -> f
 */
 
 public class Problem_03 {
	 public static <T> boolean deleteNode(LinkedListNode<T> node){
		 if(node==null || node.next==null) return false;
		 node.data = node.next.data;
		 node.next = node.next.next;
		 return true;
	 }
 }