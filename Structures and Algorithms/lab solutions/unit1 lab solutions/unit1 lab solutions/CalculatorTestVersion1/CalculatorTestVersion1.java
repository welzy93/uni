public class CalculatorTestVersion1{
    public static void main (String[] args){
        int value1;
        int value2;
        int option;
        value1=Input.getInteger("input value1: ");
        value2=Input.getInteger("input value2: ");
        do{
            System.out.println("0: quit, 1: add, 2: subtract, 3: multiply, 4: integer division, 5: floating point division");
            option=Input.getInteger("input option: ");
            switch (option){
                case 0: break;
                case 1: System.out.println("add: "+value1+" + "+value2+" = "+(value1+value2));
                        break;
                case 2: System.out.println("subtract: "+value1+" - "+value2+" = "+(value1-value2));
                        break;
                case 3: System.out.println("multiply: "+value1+" * "+value2+" = "+(value1*value2));
                        break;
                case 4: if (value2==0)
                            System.out.println("attempt to divide by zero");
                        else
                            System.out.println("integer division: "+value1+" / "+value2+" = "+(value1/value2)+" rem "+(value1%value2));
                        break;
                case 5: if (value2==0)
                            System.out.println("attempt to divide by zero");
                        else{
                        	System.out.print("floating point division: "+value1+" / "+value2+" = ");
							System.out.format("%.2f%n",(double)value1/value2);
						}
                        break;
                default:System.out.println("invalid option");
                        break;
            }
        } while (option!=0);
    }
}
