public class BinarySearchTree implements SortedADT{
	private class BinarySearchTreeNode{
		private Comparable object;
		private BinarySearchTreeNode left;
		private BinarySearchTreeNode right;
	}
	private BinarySearchTreeNode root;
	public boolean insert(Comparable object){
		/* Algorithm
		create a new tree node
		add the object to the new node
		if tree is empty then
			make root refer to the new node
		else
			insert the new node in the tree 
		end if
		*/
		boolean inserted=true;
		BinarySearchTreeNode newNode=new BinarySearchTreeNode();
		newNode.object=object;
		if (this.root==null)
			this.root=newNode;
		else
			inserted=this.insert(this.root,newNode);
		return inserted;
	}
	private boolean insert(BinarySearchTreeNode currentNode, BinarySearchTreeNode newNode){
		/* Algorithm
		if new object matches current object then
			output duplicate object message
		else
			if new object is less than the current object then
				if current object does not have a left subtree then
					make left of current the new node
				else
					insert the new node in the left subtree
				end if
			else
				if current object does not have a right subtree then
					make right of current the new node
				else
					insert the new node in the right subtree
				end if
			end if
		end if
		*/
		boolean inserted=true;
     	if (newNode.object.compareTo(currentNode.object)==0){
			System.out.println("attempt to insert a duplicate");
			inserted=false;
		}
		else
			if (newNode.object.compareTo(currentNode.object)<0)
				if(currentNode.left==null)
					currentNode.left=newNode;
				else
        			inserted=this.insert(currentNode.left,newNode);
     		else
				if(currentNode.right==null)
					currentNode.right=newNode;
				else
        			inserted=this.insert(currentNode.right,newNode);
		return inserted;
	} 
	public Comparable remove(Comparable object){
			return this.remove(null,this.root,object);
	}
	private Comparable remove(BinarySearchTreeNode parentNode, BinarySearchTreeNode currentNode, Comparable objectToDelete){
		/* algorithm
		if current node is not null then
			if object matches current object then
				save removed object
				if current has no subtrees then
					replace subtree in parent with null
				else
					if current only has a left subtree then
						replace subtree in parent with current's left subtree
						set current's left subtree to null
					else
						if current only has a right subtree then
							replace subtree in parent with current's right subtree
							set current's right subtree to null
						else
							replace current node with the next largest node
						end if
					end if
				end if
			else
				if object to delete is less than the current object then
					remove the object from the left subtree
				else
					remove the object from the right subtree
				end if
			end if
		else
			object not found
		end if
		*/
		Comparable removedObject=null;
		if (currentNode!=null)
			if (objectToDelete.compareTo(currentNode.object)==0){
				removedObject=currentNode.object;
				if (currentNode.left==null && currentNode.right==null)
					this.replaceNode(currentNode,parentNode,null);
				else
					if (currentNode.left!=null && currentNode.right==null){
						this.replaceNode(currentNode,parentNode,currentNode.left);
						currentNode.left=null;
					}
					else
						if(currentNode.left==null && currentNode.right!=null){
							this.replaceNode(currentNode,parentNode,currentNode.right);
							currentNode.right=null;
						}
						else
							this.replaceWithNextLargest(currentNode,currentNode,currentNode.right);
			}
			else
				if (objectToDelete.compareTo(currentNode.object)<0)
					removedObject=this.remove(currentNode,currentNode.left,objectToDelete);
				else
					removedObject=this.remove(currentNode,currentNode.right,objectToDelete);
		return removedObject;
	}
	private void replaceNode(BinarySearchTreeNode currentNode,BinarySearchTreeNode parentNode,BinarySearchTreeNode replacementNode){
		/* algorithm
		if current is root then 
			set root to replacement node
		else
			if current is the root of the left subtree of parent then
				set parent's left subtreee to replacement node
			else
				set parent's right subtree to replacement node
			end if
		end if
		set current object to null
		*/
		if (currentNode==this.root) // removing root
			this.root=replacementNode;
		else
			if (currentNode==parentNode.left)
				parentNode.left=replacementNode;
			else
				parentNode.right=replacementNode;
		currentNode.object=null;
	}
	private void replaceWithNextLargest(BinarySearchTreeNode nodeForDeletion, BinarySearchTreeNode parentNode, BinarySearchTreeNode currentNode){
		/* Algorithm
		if current does not have a left subtree then
			copy the current object into the node for deletion
			if parent matches the node for deletion then
				set parent's right subtree to be current's right subtree
			else
				set parent's left subtree to be current's right subtree
			end if
			clear the current node
		else
			replace node for deletion with the next largest in current's left subtree
		end if
		*/
		if(currentNode.left==null){
			nodeForDeletion.object=currentNode.object;
			if (parentNode==nodeForDeletion)
				parentNode.right=currentNode.right;
			else
				parentNode.left=currentNode.right;
			currentNode.object=null;
			currentNode.right=null;
		}
		else
		   this.replaceWithNextLargest(nodeForDeletion,currentNode,currentNode.left);
	}
	public Comparable find(Comparable object){
		return this.find(this.root,object);
	}
	private Comparable find(BinarySearchTreeNode currentNode, Comparable objectToFind){ 
		/* Algorithm
		if node available then
			if current object matches object to find then
				object found
			else
				if object to find is less than the current object then
					search the left subtree
				else
					search the right subtree
				end if
			end if
		else
			object is not in the tree
		end if
		*/
		Comparable returnedObject=null;
    	if (currentNode!=null)
			if (objectToFind.compareTo(currentNode.object)==0)
				returnedObject=currentNode.object;
			else 
				if (objectToFind.compareTo(currentNode.object)<0)
					returnedObject=this.find(currentNode.left,objectToFind);
				else
					returnedObject=this.find(currentNode.right,objectToFind);
		return returnedObject;
	} 
	public void display(){
		if (this.root!=null){
			System.out.println("branches");
			this.displayBranches(this.root);
			System.out.println("in order");
			this.displayInOrder(this.root);
			System.out.println();
			System.out.println("pre order");
			this.displayPreOrder(this.root);
			System.out.println();
			System.out.println("post order");
			this.displayPostOrder(this.root);
			System.out.println();
		}
		else
			System.out.println("tree is empty");
	}
	private void displayBranches(BinarySearchTreeNode currentNode){ 
		// displays left and right for each node 
  		if (currentNode!=null){
  			System.out.println(currentNode.object+"  ");
			System.out.print("    left:  ");
			if (currentNode.left!=null)
				System.out.println(currentNode.left.object);
			else
				System.out.println("null");
			System.out.print("    right: ");
			if (currentNode.right!=null)
				System.out.println(currentNode.right.object);
			else
				System.out.println("null");
			this.displayBranches(currentNode.left); 
			this.displayBranches(currentNode.right);
		}
	}
	private void displayInOrder(BinarySearchTreeNode currentNode){ 
  		if (currentNode!=null){
			this.displayInOrder(currentNode.left); 
  			System.out.print(currentNode.object+"  ");
			this.displayInOrder(currentNode.right);
		}
	}
	private void displayPreOrder(BinarySearchTreeNode currentNode){ 
  		if (currentNode!=null){
  			System.out.print(currentNode.object+"  ");
			this.displayPreOrder(currentNode.left); 
			this.displayPreOrder(currentNode.right);
		}
	}
	private void displayPostOrder(BinarySearchTreeNode currentNode){ 
  		if (currentNode!=null){
			this.displayPostOrder(currentNode.left); 
			this.displayPostOrder(currentNode.right);
  			System.out.print(currentNode.object+"  ");
		}
	}
}