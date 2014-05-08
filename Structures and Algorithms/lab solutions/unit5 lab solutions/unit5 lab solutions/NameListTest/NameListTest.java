public class NameListTest{
    public static void main(String[] args){
        int size=Input.getInteger("input list size: ");
        NameList names=new NameList(size);
        int option;
        do{
            System.out.println("0: quit, 1: add, 2: sort, 3: display");
            option=Input.getInteger("input option: ");
            switch (option){
                case 0: break;
                case 1: names.add();
                        break;
                case 2: names.sort();
                        break;
                case 3: names.display();
                        break;
            }
        } while (option !=0);
    }
}
