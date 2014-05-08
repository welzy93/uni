public class MergedLinkedList extends SortedLinkedList implements MergedADT{
	public MergedADT merge(MergedADT additionalObjects){
	 	/* algorithm
		while entries in both lists loop
	   		if entry in list1 is less than entry in list2
				copy entry from list1 into merged list
			else
				if entry in list1 is greater than entry in list2
					copy entry from list2 into merged list
				else // duplicate entries could copy from either listy1 or list2
					copy entry from list1 into merged list
				end if
			end if
		end loop
		if at end of list1 then
		   	while entries remain in list2 loop
			   copy entry from list2 into merged list
			end loop
		else
		   	while entries remain in list1 loop
			   copy entry from list1 into merged list
			end loop
		end if 
		*/	 
		MergedLinkedList mergedObjects=new MergedLinkedList();
		ListNode thisNode=this.head;
		ListNode additionalNode=((MergedLinkedList)additionalObjects).head;
		ListNode mergedNode=null;
		while (thisNode!=null && additionalNode!=null)
			if (thisNode.object.compareTo(additionalNode.object)<0){
				// copy object from this list
				mergedNode=this.setupNode(mergedNode,mergedObjects,thisNode.object);
				thisNode=thisNode.next;
			}
			else
				if (thisNode.object.compareTo(additionalNode.object)>0){
					// copy object from additional list
					mergedNode=this.setupNode(mergedNode,mergedObjects,additionalNode.object);
					additionalNode=additionalNode.next;
				}
				else{
					// duplicate object, copy object from this list
					mergedNode=this.setupNode(mergedNode,mergedObjects,thisNode.object);
					thisNode=thisNode.next;
					additionalNode=additionalNode.next;
				}
		if (thisNode==null)
			// copy remaining objects from additional list
			while (additionalNode!=null){
				mergedNode=this.setupNode(mergedNode,mergedObjects, additionalNode.object);
				additionalNode=additionalNode.next;
			}
		else
			if (additionalNode==null)
				// copy remaining objects from this list
				while (thisNode!=null){
					mergedNode=this.setupNode(mergedNode,mergedObjects, thisNode.object);
					thisNode=thisNode.next;
				}
		return mergedObjects;
	}
	 
	private ListNode setupNode(ListNode mergedNode,MergedLinkedList mergedObjects, Comparable object){
		ListNode newNode=new ListNode();
		newNode.object=object;
		if (mergedObjects.head==null)
			mergedObjects.head=newNode;
		else
			mergedNode.next=newNode;
		mergedNode=newNode;
		return mergedNode;
	}
}
