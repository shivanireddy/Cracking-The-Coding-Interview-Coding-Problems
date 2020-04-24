/**
 * Problem Statement : 
 * 
 * Given two singly linked list, determine if
 * the two lists intersect. Return the intersecting
 * node. Note that intersection is defined based 
 * on the reference and not value. That is, if K'th
 * node of the first linked list is the exact same node
 * (by reference) as the J'th node of the second
 * linked list, then they are intersecting.
 * Time Complexity: O(M+N) M and N being length of list1 and list2 respectively
 * Space Complexity: O(1)
 */
 
 public class Problem_07 {
	 class Result {
		 public LinkedListNode tail;
		 public int size;
		 public Result(LinkedListNode tail,int size){
			 this.tail=tail;
			 this.size=size;
		 }
	 }
	 
	 Result getTailAndSize(LinkedListNode list){
		 if(list==null) return null;
		 int size=1;
		 LinkedListNode current = list;
		 while(current.next!=null){
			 size++;
			 current=current.next;
		 }
		 return new Result(current,size);
	 }
	 
	 LinkedListNode getKthNode(LinkedListNode head,int k){
		 LinkedListNode current=head;
		 while(k>0 && current!=null){
			 current=current.next;
			 k--;
		 }
		 return current;
	 }
	 
	 LinkedListNode findIntersection(LinkedListNode list1,LinkedlIstNode list2){
		 if(list1==null || list2==null) return null;
		 Result res1 = getTailAndSize(list1);
		 Result res2 = getTailAndSize(list2);
		 if(res1.tail!=res2.tail) return null;
		 LinkedListNode shorter = res1.size<res2.size?list1:list2;
		 LinkedListNode longer = res1.size<res2.size?list2.list1;
		 
		 longer = getKthNode(longer,Math.abs(res1.size-res2.size));
		 while(shorter!=longer){
			 shorter=shorter.next;
			 longer=longer.next;
		 }
		 return longer;
	 }
 }