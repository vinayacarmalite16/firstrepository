public class OddExcep {
    void even(int n) throws ArithmeticException{
        if(n%2==0){
            throw new ArithmeticException("Valid");
        }else {
            System.out.println("Odd");
        }
    }
    public static void main(String args[]){
        OddExcep oe=new OddExcep();
        try{
            oe.even(6);
        }
        catch (ArithmeticException a){
          System.out.println(a);
            System.out.println("rest of the code...");
        }

    }
}
