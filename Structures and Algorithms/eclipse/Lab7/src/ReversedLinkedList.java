public class ReversedLinkedList extends SortedLinkedList implements ReversedADT{
	public ReversedADT reverse()
	{
		ReversedLinkedList listCopy = copy(); 
		ListNode currentNode; 
		ListNode followingNode; 
		ListNode previousNode; 
		
		if(this.head!=null&this.head.next!=null) 
		{ 
			System.out.println("There is a Number"); 
			currentNode = this.head; 
			previousNode = this.head; 
			followingNode = this.head; 
		
			do { 
				previousNode = currentNode; 
				currentNode = followingNode; 
				followingNode = followingNode.next; 
				currentNode.next = previousNode; 
				
			}while(followingNode!=null); 
			
			this.head.next = null; 
			this.head = currentNode; 
			} 
		
		return listCopy; } 
	

	
	
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