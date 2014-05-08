public class ReversedLinkedList extends SortedLinkedList implements ReversedADT{
	public ReversedADT reverse(){
		/* algorithm
		make a copy of the list
		if there are at least 2 nodes in the list then
			set the current node to the head of the list
			set the following node to the next of the current node
			do
				set the previous node to the current node
				set the current node to the following node
				set the following node to its next node
				set the next of the current node to the previous node
			while following node is not null
			set next of the head to null
			set the head to the current node
		end if
		*/
		ListNode currentNode;
		ListNode followingNode;
		ListNode previousNode;
		ReversedLinkedList reversedObjects=this.copy();
		if (reversedObjects.head!=null && reversedObjects.head.next!=null){
			currentNode=reversedObjects.head;
			previousNode=reversedObjects.head;
			followingNode=currentNode.next;
			do{
				previousNode=currentNode;
				currentNode=followingNode;
				followingNode=currentNode.next;
				currentNode.next=previousNode;
			}while (followingNode!=null);
			reversedObjects.head.next=null;
			reversedObjects.head=currentNode;
		}
		return reversedObjects;
	}
	
	private ReversedLinkedList copy(){
		ListNode currentNode;
		ListNode reversedNode;
		ReversedLinkedList reversedObjects=new ReversedLinkedList();
		if (this.head!=null){
			reversedObjects.head=new ListNode();
			reversedObjects.head.object=this.head.object;
			currentNode=this.head.next;
			reversedNode=reversedObjects.head;
			while (currentNode!=null){
				reversedNode.next=new ListNode();
				reversedNode=reversedNode.next;
				reversedNode.object=currentNode.object;
				currentNode=currentNode.next;
			}
		}
		return reversedObjects;
	}
}