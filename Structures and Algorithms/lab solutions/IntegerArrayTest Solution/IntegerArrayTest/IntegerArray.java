public class IntegerArray{
	public static void display(Integer[] array){
		class Display{
			void display(Integer[] array,int index){
				if (index!=array.length&&array[index]!=null){
					System.out.print(array[index]+" ");
					display(array,index+1);
				}
			}
		}
		new Display().display(array,0);
	}
	public static int getTotal(Integer[] array){
		class Total{
			int getTotal(Integer[] array,int index){
				int total=0;
				if (index!=array.length&&array[index]!=null)
					total=array[index]+getTotal(array,index+1);
				return total;
			}
		}
		int total;
		total=new Total().getTotal(array,0);
		return total;
	}
}
