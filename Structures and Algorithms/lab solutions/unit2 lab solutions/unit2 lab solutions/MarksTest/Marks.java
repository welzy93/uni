public class Marks{
	private final int MODULES=6;
	private int[]marks=new int[MODULES];
	public Marks(){
		for(int mark=0;mark<MODULES;mark++)
			this.marks[mark]=Input.getInteger("input mark: ");
	}
	public void outputResults()	{
		/* algorithm
			for each module taken loop
				add module mark to total
				if failed module then
					increment number of fails
				end if
			end loop
			calculate average mark
			output average mark and number of fails
			if all modules passed then
				if average is at least merit level then
					output pass with merit
				else
					output pass
				end if
			else
				if only 1 failure then
					if average is at least pass mark then
						output pass
					else
						output fail
					end if
				else
					output fail
				end if
			end if
		*/
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