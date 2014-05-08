public class NameList{
    private Name[] names;
    private int count;
    public NameList(int size){
        this.names=new Name[size];
    }
    public void add(){
		this.names[this.count]=new Name();
		this.count++;
    }
    public void sort(){
    	InsertionSort.sort(names);
    }
    public void display(){
        for(int index=0;index<this.count;index++)
        	this.names[index].display();
    }
}
