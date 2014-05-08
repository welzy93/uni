
public class Marks {
	private final int MODULES=6;
	private int[]marks=new int[MODULES];
	public Marks(){
		for(int mark=0;mark<MODULES;mark++)
			this.marks[mark]=Input.getInteger("input mark: ");
	}
	public void outputResults()	{
		
		final int PASS=40;
		final int MERIT=60;
		int total=0;
		int fails=0;
		double average;
		for(int mark:this.marks){
			total+=mark;
			if (mark<PASS)
				fails++;
		}
		// force floating point division
		average=(double)total/MODULES;
		System.out.print("average: "+ average+ " fails: "+fails);
		if (fails==0)
			if (average>=MERIT)
				System.out.println(" pass with merit");
			else
				System.out.println(" pass");
		else
			if (fails==1)
				if (average>=PASS)
					System.out.println(" pass");
				else
					System.out.println(" fail");
			else
				System.out.println(" fail");
	}	
}
