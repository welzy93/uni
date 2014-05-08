public class FamilyTree {

	public class FamilyTreeNode{
		String name;
		FamilyTreeNode partner;
		FamilyTreeNode sibling;
		FamilyTreeNode child;
	}	
	FamilyTreeNode ancestor;
	public FamilyTree(String name)
	{
		ancestor = new FamilyTreeNode();
		ancestor.name = name;
		name = Input.getString("Please Enter Partner Name");
		FamilyTreeNode partner = new FamilyTreeNode();
		partner.name = name;
		ancestor.partner = partner;
		ancestor.partner.partner = ancestor;
	}	
	public void addchild(String name){
		FamilyTreeNode current = ancestor;
		FamilyTreeNode newChild=new FamilyTreeNode();
		newChild.name=name;
		FamilyTreeNode unique = ancestor;		
		boolean check = true;
		while(unique != null){
			if(unique.name.equalsIgnoreCase(name))
			{
				System.out.println("duplicate family member");
				check = false;
				unique = null;			
			}
			else{
				if(unique.partner != null)
				{
					if(unique.partner.name.equalsIgnoreCase(name))
					{
						System.out.println("duplicate family member");
						check = false;
						unique = null;			
					}
				}
				if(unique.child != null)
				{
					unique = unique.child;
				}
				else if (unique.sibling != null)
				{
					unique = unique.sibling;
				}
				else
				{
					unique = null;
				}
			}
		}
		if(check)
		{
			if(current.child==null){
				current.child = newChild;
			}		
			else{
				FamilyTreeNode next = current.child;
				while(next.sibling != null){
					next=next.sibling;
				}
				next.sibling=newChild;
			}			
		}
	}
	public void displayCurrent(){
		FamilyTreeNode current = ancestor;
		System.out.println(current.name);
		if(current.partner!=null)
			System.out.println(" "+current.partner.name);
		else
			System.out.print(" is the parent");	
	}	
	public void displayFamilyTree()
	{
		System.out.print(this.ancestor.name);
		System.out.print(" is married to ");
		System.out.println(this.ancestor.partner.name);

		FamilyTreeNode child=this.ancestor.child;
		while (child != null)
		{
			System.out.println("\t"+child.name);
			child=child.sibling;
		}			
	}
}





